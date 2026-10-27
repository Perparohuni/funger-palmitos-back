package com.rpg.back.controller;

import com.rpg.back.converter.SistemaConverter;
import com.rpg.back.dto.SistemaDTO;
import com.rpg.back.entity.Sistema;
import com.rpg.back.service.SistemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mestrices/sistemas")
public class SistemaController extends GenericController<Sistema, SistemaDTO> {

    @Autowired
    SistemaService service;

    @Autowired
    SistemaConverter converter;

    @Override
    protected SistemaService getService() {
        return service;
    }

    @Override
    protected  SistemaConverter getConverter() {
        return converter;
    }
}
