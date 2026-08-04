package com.rpg.back.controller;

import com.rpg.back.entity.Campanha;
import com.rpg.back.service.CampanhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mestrices/campanhas")
public class CampanhaController {
    @Autowired
    CampanhaService service;

    @GetMapping
    public ResponseEntity<Page<Campanha>> getAll(Pageable pageable) {

        return ResponseEntity.ok(service.listar(pageable));
    }
}
