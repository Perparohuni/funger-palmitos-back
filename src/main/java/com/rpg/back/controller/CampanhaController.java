package com.rpg.back.controller;

import com.rpg.back.converter.CampanhaConverter;
import com.rpg.back.dto.CampanhaDTO;
import com.rpg.back.entity.Campanha;
import com.rpg.back.service.CampanhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mestrices/campanhas")
public class CampanhaController extends GenericController<Campanha, CampanhaDTO> {
    @Autowired
    CampanhaService service;

    @Autowired
    CampanhaConverter converter;

    @Override
    protected CampanhaService getService() {
        return service;
    }

    @Override
    protected  CampanhaConverter getConverter() {
        return converter;
    }
}
