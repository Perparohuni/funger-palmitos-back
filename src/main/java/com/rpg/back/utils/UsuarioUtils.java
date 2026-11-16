package com.rpg.back.utils;

import com.rpg.back.entity.Usuario;
import com.rpg.back.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class UsuarioUtils {

    @Autowired
    UsuarioService service;

    public Usuario getUsuario() {
        Authentication authentication =
                SecurityContextHolder.getContext().getAuthentication();

        if (authentication == null) {
            throw new RPGException("Usuário não autenticado");
        }

        return service.findByLogin(authentication.getPrincipal().toString());
    }
}