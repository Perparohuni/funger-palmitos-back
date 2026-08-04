package com.rpg.back.service;

import com.rpg.back.dto.CampanhaDTO;
import com.rpg.back.entity.Campanha;
import com.rpg.back.repository.CampanhaRepository;
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
}
