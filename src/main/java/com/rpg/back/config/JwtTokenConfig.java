package com.rpg.back.config;

import com.rpg.back.dto.UsuarioDTO;
import com.rpg.back.entity.Usuario;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.security.Key;
import java.util.Date;

@Service
public class JwtTokenConfig {
    @Value("${JWT_SECRET}")
    private String secret;

    public String gerarToken(Usuario usuario) {

        Key key = Keys.hmacShaKeyFor(secret.getBytes());

        return Jwts.builder()
                .subject(usuario.getLogin())
                .claim("mestre", usuario.isMestre())
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 *12))
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }

    public Claims validarToken(String token) {
        Key key = Keys.hmacShaKeyFor(secret.getBytes());

        return Jwts.parser().verifyWith((SecretKey) key)
                .build().parseSignedClaims(token).getPayload();
    }
}
