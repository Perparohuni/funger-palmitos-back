package com.rpg.back.controller;

import com.rpg.back.config.JwtTokenConfig;
import com.rpg.back.dto.LoginDTO;
import com.rpg.back.dto.LoginRespostaDTO;
import com.rpg.back.dto.RespostaDTO;
import com.rpg.back.dto.UsuarioDTO;
import com.rpg.back.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    LoginService service;

    @PostMapping
    public ResponseEntity<?> login(@RequestBody LoginDTO login) {
        UsuarioDTO usuarioLogado = service.login(login);

        return ResponseEntity.ok(new RespostaDTO<UsuarioDTO>(true, "Logado com sucesso meu chapa!", usuarioLogado));
    }
}
