package com.rpg.back.service;

import com.rpg.back.entity.Atributo;
import com.rpg.back.repository.AtributoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AtributoService extends GenericSystemService<Atributo>{
    @Autowired
    AtributoRepository repository;

    @Override
    protected AtributoRepository getRepository() {
        return repository;
    }
}