package com.rpg.back.controller;

import com.rpg.back.converter.CampanhaConverter;
import com.rpg.back.dto.CampanhaDTO;
import com.rpg.back.entity.Campanha;
import com.rpg.back.service.CampanhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mestrices/campanhas")
public class CampanhaController {
    @Autowired
    CampanhaService service;

    @Autowired
    CampanhaConverter converter;

    @GetMapping
    public ResponseEntity<Page<Campanha>> getAll(Pageable pageable) {
        return ResponseEntity.ok(service.listar(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<CampanhaDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(converter.toDto(service.findById(id)));
    }

    @PostMapping
    public ResponseEntity<Campanha> save(@RequestBody CampanhaDTO dto) {
        Campanha campanha = service.save(converter.toEntity(dto));
        return ResponseEntity.ok(campanha);
    }
}
