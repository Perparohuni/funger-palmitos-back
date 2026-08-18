package com.rpg.back.service;

import com.rpg.back.dto.CampanhaDTO;
import com.rpg.back.entity.Campanha;
import com.rpg.back.repository.CampanhaRepository;
import com.rpg.back.utils.RPGException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class CampanhaService {
    @Autowired
    CampanhaRepository repository;

    public Page<Campanha> listar(Pageable pageable) {
        return repository.getAllByAtivoTrue(pageable);
    }

    public Campanha save(Campanha model) {
        return repository.save(model);
    }

    public Campanha findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RPGException("Campanha não encontrada!"));
    }
}
