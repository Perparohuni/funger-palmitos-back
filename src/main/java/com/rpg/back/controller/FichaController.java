package com.rpg.back.controller;

import com.rpg.back.converter.FichaConverter;
import com.rpg.back.dto.FichaDTO;
import com.rpg.back.entity.Ficha;
import com.rpg.back.entity.Personagem;
import com.rpg.back.service.FichaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/{tipoRota}/fichas")
public class FichaController extends GenericController<Ficha, FichaDTO>{
    @Autowired
    FichaService service;

    @Autowired
    FichaConverter converter;

    @Override
    protected FichaService getService() {
        return service;
    }

    @Override
    protected  FichaConverter getConverter() {
        return converter;
    }

    @GetMapping("/usuario/{usuarioId}")
    public ResponseEntity<Page<Ficha>> findFromUsuario(Pageable pageable, @PathVariable Long usuarioId) {
        return ResponseEntity.ok(getService().findByUsuarioId(usuarioId, pageable));
    }
}
