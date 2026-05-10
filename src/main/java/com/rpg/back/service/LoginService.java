package com.rpg.back.service;

import com.rpg.back.dto.LoginDTO;
import com.rpg.back.dto.LoginRespostaDTO;
import com.rpg.back.dto.RespostaDTO;
import com.rpg.back.entity.Usuario;
import com.rpg.back.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private UsuarioRepository repository;

    public RespostaDTO<LoginRespostaDTO> login(LoginDTO login) {
        Usuario usuario = repository.findByLogin(login.getLogin()).orElseThrow(() -> new RuntimeException("Usuário = não"));
        return null;
    }
}
