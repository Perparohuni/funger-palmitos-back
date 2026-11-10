package com.rpg.back.service;

import com.rpg.back.entity.Campanha;
import com.rpg.back.repository.CampanhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class CampanhaService extends GenericSystemService<Campanha> {
    @Autowired
    CampanhaRepository repository;

    @Autowired
    UsuarioCampanhaService usuarioCampanhaService;

    @Override
    protected CampanhaRepository getRepository() {
        return repository;
    }

    public Page<Campanha> findByUsuario(Pageable pageable, Long usuarioId) {
        return usuarioCampanhaService.findByUsuarioId(usuarioId, pageable);
    }
}
