package com.rpg.back.controller;

import com.rpg.back.converter.PersonagemConverter;
import com.rpg.back.dto.PersonagemDTO;
import com.rpg.back.entity.Personagem;
import com.rpg.back.service.PersonagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/{tipoRota}/personagens")
public class PersonagemController extends GenericController<Personagem, PersonagemDTO>{
    @Autowired
    PersonagemService service;

    @Autowired
    PersonagemConverter converter;

    @Override
    protected PersonagemService getService() {
        return service;
    }

    @Override
    protected  PersonagemConverter getConverter() {
        return converter;
    }

    @GetMapping("/usuario/{usuarioId}")
    public ResponseEntity<Page<Personagem>> findFromUsuario(Pageable pageable, @PathVariable Long usuarioId) {
        return ResponseEntity.ok(getService().findByUsuarioId(usuarioId, pageable));
    }
}

