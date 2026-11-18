package com.rpg.back.controller;

import com.rpg.back.converter.FichaTemplateConverter;
import com.rpg.back.dto.FichaTemplateDTO;
import com.rpg.back.entity.FichaTemplate;
import com.rpg.back.service.FichaTemplateService;
import org.springframework.beans.factory.annotation.Autowired;

public class FichaTemplateController extends GenericSystemController<FichaTemplate, FichaTemplateDTO> {
    @Autowired
    FichaTemplateService service;

    @Autowired
    FichaTemplateConverter converter;

    @Override
    protected FichaTemplateService getService() {
        return service;
    }

    @Override
    protected  FichaTemplateConverter getConverter() {
        return converter;
    }
}
