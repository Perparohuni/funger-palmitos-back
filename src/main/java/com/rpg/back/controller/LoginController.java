package com.rpg.back.controller;

import com.rpg.back.config.JwtTokenConfig;
import com.rpg.back.dto.LoginDTO;
import com.rpg.back.dto.LoginRespostaDTO;
import com.rpg.back.dto.RespostaDTO;
import com.rpg.back.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private JwtTokenConfig jwtTokenConfig;

    @Autowired
    LoginService service;

    @PostMapping
    public ResponseEntity<?> login(@RequestBody LoginDTO login) {
        RespostaDTO<LoginRespostaDTO> dados = service.login(login);
        String token = jwtTokenConfig.gerarToken(login.getLogin());

        ResponseEntity.status(401).body(new RespostaDTO<>(false, "Login ou senha inválidos", null));
        return ResponseEntity.ok(new RespostaDTO<LoginRespostaDTO>(true, "Logado com sucesso meu chapa!", null));
    }
}
