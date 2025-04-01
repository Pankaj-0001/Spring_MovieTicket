package com.Movieticket.MovieTicket.Config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JWTutils {

    private String Secret_key = "$2a$12$69.5la4vfbLrVWSDgTprAuq3.gXHbFyaq2onoFsqglif0J0dF2kbW";

    public String getToken(String email) {
        Map<String,Object> claims =new HashMap<>();
        return Jwts.builder()
                .subject(email)
                .claims(claims)
                .header().empty().add("typ", "jwt")
                .and()
                .issuedAt(new Date(System.currentTimeMillis()))
                .expiration(new Date(System.currentTimeMillis()+1000*60*60))
                .signWith(getSignkey())
                .compact();
    }

    public SecretKey getSignkey(){
        return Keys.hmacShaKeyFor(Secret_key.getBytes());
    }

    public String extractEmail(String jwt) {
        Claims claim = extractClaims(jwt);
        return claim.getSubject();
    }

    private Claims extractClaims(String jwt) {
        return Jwts.parser()
                .verifyWith(getSignkey())
                .build()
                .parseSignedClaims(jwt)
                .getPayload();
    }


    public boolean validateToken(String jwt) {
        return !isTokenexpired(jwt);
    }

    private boolean isTokenexpired(String jwt) {
        return extractExptime(jwt).before(new Date());
    }

    private Date extractExptime(String jwt) {
        return extractClaims(jwt).getExpiration();
    }
}
