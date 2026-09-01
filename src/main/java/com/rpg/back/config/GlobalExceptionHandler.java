package com.rpg.back.config;

import com.rpg.back.dto.ErroRespostaDTO;
import com.rpg.back.utils.RPGException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(RPGException.class)
    public ResponseEntity<ErroRespostaDTO> rpgException(
            RPGException e
    ) {
        ErroRespostaDTO resposta = new ErroRespostaDTO(e.getMessage(), 404);

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(resposta);
    }

    @ExceptionHandler(SQLException.class)
    public ResponseEntity<ErroRespostaDTO> sqlException(
            SQLException e
    ) {
        ErroRespostaDTO resposta = new ErroRespostaDTO(e.getMessage(), 404);

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(resposta);
    }
}
