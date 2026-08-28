package com.rpg.back.service;

import com.rpg.back.entity.Campanha;
import com.rpg.back.repository.CampanhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CampanhaService extends GenericService<Campanha> {
    @Autowired
    CampanhaRepository repository;

    @Override
    protected CampanhaRepository getRepository() {
        return repository;
    }
}
