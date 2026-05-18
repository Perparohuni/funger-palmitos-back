package com.rpg.back.service;

import com.rpg.back.config.JwtTokenConfig;
import com.rpg.back.dto.LoginDTO;
import com.rpg.back.dto.LoginRespostaDTO;
import com.rpg.back.dto.RespostaDTO;
import com.rpg.back.dto.UsuarioDTO;
import com.rpg.back.entity.Usuario;
import com.rpg.back.repository.UsuarioRepository;
import com.rpg.back.utils.RPGException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private JwtTokenConfig jwtTokenConfig;

    public UsuarioDTO login(LoginDTO login) {
        Usuario usuario = repository.findByLogin(login.getLogin()).orElseThrow(() -> new RPGException("Login ou senha inválidos!"));

        String token = jwtTokenConfig.gerarToken(login.getLogin());

        UsuarioDTO usuarioLogado = new UsuarioDTO();
        usuarioLogado.setMestre(usuario.isMestre());
        usuarioLogado.setLogin(usuario.getLogin());
        usuarioLogado.setToken(token);

        return usuarioLogado;
    }
}
