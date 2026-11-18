package com.rpg.back.controller;

import com.rpg.back.converter.FichaElementoConverter;
import com.rpg.back.dto.FichaElementoDTO;
import com.rpg.back.entity.FichaElemento;
import com.rpg.back.service.FichaElementoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/{tipoRota}/ficha-elementos")
public class FichaElementoController extends GenericController<FichaElemento, FichaElementoDTO> {
    @Autowired
    FichaElementoService service;

    @Autowired
    FichaElementoConverter converter;

    @Override
    protected FichaElementoService getService() {
        return service;
    }

    @Override
    protected  FichaElementoConverter getConverter() {
        return converter;
    }
}
