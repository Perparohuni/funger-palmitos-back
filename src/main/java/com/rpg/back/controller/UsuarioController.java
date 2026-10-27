package com.rpg.back.controller;

import com.rpg.back.converter.UsuarioConverter;
import com.rpg.back.dto.UsuarioDTO;
import com.rpg.back.entity.Usuario;
import com.rpg.back.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mestrices/usuarios")
public class UsuarioController  extends GenericController<Usuario, UsuarioDTO>{
    @Autowired
    UsuarioService service;

    @Autowired
    UsuarioConverter converter;

    @Override
    protected UsuarioService getService() {
        return service;
    }

    @Override
    protected  UsuarioConverter getConverter() {
        return converter;
    }
}
