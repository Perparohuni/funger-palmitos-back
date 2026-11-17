package com.rpg.back.controller;

import com.rpg.back.converter.ContadorConverter;
import com.rpg.back.dto.ContadorDTO;
import com.rpg.back.entity.Contador;
import com.rpg.back.service.ContadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/{tipoRota}/contadores")
public class ContadorController extends GenericSystemController<Contador, ContadorDTO> {
    @Autowired
    ContadorService service;

    @Autowired
    ContadorConverter converter;

    @Override
    protected ContadorService getService() {
        return service;
    }

    @Override
    protected  ContadorConverter getConverter() {
        return converter;
    }

}