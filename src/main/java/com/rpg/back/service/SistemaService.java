package com.rpg.back.service;

import com.rpg.back.entity.Sistema;
import com.rpg.back.repository.SistemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SistemaService extends GenericService<Sistema> {
    @Autowired
    SistemaRepository repository;

    @Override
    protected SistemaRepository getRepository() {
        return repository;
    }
}
