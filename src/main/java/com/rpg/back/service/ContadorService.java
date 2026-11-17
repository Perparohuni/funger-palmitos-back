package com.rpg.back.service;

import com.rpg.back.entity.Contador;
import com.rpg.back.repository.ContadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContadorService extends GenericSystemService<Contador> {
    @Autowired
    ContadorRepository repository;

    @Override
    protected ContadorRepository getRepository() {
        return repository;
    }
}
