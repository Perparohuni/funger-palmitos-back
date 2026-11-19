package com.rpg.back.controller;

import com.rpg.back.converter.FichaElementoConverter;
import com.rpg.back.dto.FichaElementoDTO;
import com.rpg.back.entity.FichaElemento;
import com.rpg.back.service.FichaElementoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/{tipoRota}/ficha-elementos")
public class FichaElementoController extends GenericController<FichaElemento, FichaElementoDTO> {
    @Autowired
    FichaElementoService service;

    @Autowired
    FichaElementoConverter converter;

    @Override
    protected FichaElementoService getService() {
        return service;
    }

    @Override
    protected  FichaElementoConverter getConverter() {
        return converter;
    }

    @GetMapping("template/{templateId}")
    public ResponseEntity<List<FichaElementoDTO>> findAllFromTemplate(@PathVariable Long templateId) {
        return ResponseEntity.ok(getService().findAllFromTemplate(templateId).stream().map(converter::toDto).toList());
    }
}
