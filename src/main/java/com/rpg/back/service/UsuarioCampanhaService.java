package com.rpg.back.service;

import com.rpg.back.entity.UsuarioCampanha;
import com.rpg.back.repository.UsuarioCampanhaRepository;
import com.rpg.back.utils.RPGException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioCampanhaService extends GenericCampanhaService<UsuarioCampanha> {
    @Autowired
    UsuarioCampanhaRepository repository;

    @Override
    protected UsuarioCampanhaRepository getRepository() {
        return repository;
    }

    @Override
    public UsuarioCampanha save(UsuarioCampanha usuarioCampanha) {
        if(repository.existsByUsuarioAndCampanhas(usuarioCampanha.getUsuario(), usuarioCampanha.getCampanhas())) {
            throw new RPGException("Usuário já registrado nessa campanha!");
        }
        return super.save(usuarioCampanha);
    }
}