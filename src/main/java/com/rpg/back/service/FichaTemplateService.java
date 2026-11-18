package com.rpg.back.service;

import com.rpg.back.entity.FichaTemplate;
import com.rpg.back.repository.FichaTemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class FichaTemplateService extends GenericSystemService<FichaTemplate> {
    @Autowired
    FichaTemplateRepository repository;

    @Override
    protected FichaTemplateRepository getRepository() {
        return repository;
    }
}