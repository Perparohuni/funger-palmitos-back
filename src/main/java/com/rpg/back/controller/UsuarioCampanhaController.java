package com.rpg.back.controller;

import com.rpg.back.converter.UsuarioCampanhaConverter;
import com.rpg.back.dto.UsuarioCampanhaDTO;
import com.rpg.back.entity.UsuarioCampanha;
import com.rpg.back.service.UsuarioCampanhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mestrices/campanhas/usuarios")
public class UsuarioCampanhaController extends GenericCampanhaController<UsuarioCampanha, UsuarioCampanhaDTO> {
    @Autowired
    UsuarioCampanhaService service;

    @Autowired
    UsuarioCampanhaConverter converter;

    @Override
    protected UsuarioCampanhaService getService() {
        return service;
    }

    @Override
    protected  UsuarioCampanhaConverter getConverter() {
        return converter;
    }
}
