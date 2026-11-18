package com.rpg.back.service;

import com.rpg.back.entity.Ficha;
import com.rpg.back.repository.FichaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FichaService extends GenericService<Ficha> {
    @Autowired
    FichaRepository repository;

    @Override
    protected FichaRepository getRepository() {
        return repository;
    }

    public Page<Ficha> findByUsuarioId(Long usuarioId, Pageable pageable) {
        return repository.findByUsuario_Id(usuarioId, pageable);
    }
}
