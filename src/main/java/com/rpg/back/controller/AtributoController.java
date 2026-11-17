package com.rpg.back.controller;

import com.rpg.back.converter.AtributoConverter;
import com.rpg.back.dto.AtributoDTO;
import com.rpg.back.entity.Atributo;
import com.rpg.back.service.AtributoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/{tipoRota}/atributos")
public class AtributoController extends GenericSystemController<Atributo, AtributoDTO> {
    @Autowired
    AtributoService service;

    @Autowired
    AtributoConverter converter;

    @Override
    protected AtributoService getService() {
        return service;
    }

    @Override
    protected  AtributoConverter getConverter() {
        return converter;
    }

}
