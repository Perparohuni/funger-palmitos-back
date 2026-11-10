package com.rpg.back.controller;

import com.rpg.back.converter.CampanhaConverter;
import com.rpg.back.dto.CampanhaDTO;
import com.rpg.back.entity.Campanha;
import com.rpg.back.service.CampanhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/{tipoRota}/campanhas")
public class CampanhaController extends GenericSystemController<Campanha, CampanhaDTO> {
    @Autowired
    CampanhaService service;

    @Autowired
    CampanhaConverter converter;

    @Override
    protected CampanhaService getService() {
        return service;
    }

    @Override
    protected  CampanhaConverter getConverter() {
        return converter;
    }

    @GetMapping("/usuario/{usuarioId}")
    public ResponseEntity<Page<Campanha>> findFromUsuario(Pageable pageable, @PathVariable Long usuarioId) {
        return ResponseEntity.ok(service.findByUsuario(pageable, usuarioId));
    }
}
