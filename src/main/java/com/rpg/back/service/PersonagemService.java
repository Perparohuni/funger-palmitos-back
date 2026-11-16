package com.rpg.back.service;

import com.rpg.back.entity.Personagem;
import com.rpg.back.entity.Usuario;
import com.rpg.back.repository.PersonagemRepository;
import com.rpg.back.utils.UsuarioUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PersonagemService extends GenericService<Personagem>{
    @Autowired
    PersonagemRepository repository;

    @Autowired
    UsuarioUtils usuarioUtils;

    @Override
    protected PersonagemRepository getRepository() {
        return repository;
    }

    @Override
    public Personagem save(Personagem model) {
        Usuario usuario = usuarioUtils.getUsuario();
        model.setUsuario(usuario);
        return super.save(model);
    }

    public Page<Personagem> findByUsuarioId(Long usuarioId, Pageable pageable) {
        return repository.findByUsuario_Id(usuarioId, pageable);
    }
}
