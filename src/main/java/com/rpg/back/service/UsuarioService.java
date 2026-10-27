package com.rpg.back.service;

import com.rpg.back.entity.Usuario;
import com.rpg.back.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService extends GenericService<Usuario> {
    @Autowired
    UsuarioRepository repository;

    @Override
    protected UsuarioRepository getRepository() {
        return repository;
    }
}
