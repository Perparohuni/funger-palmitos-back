package com.rpg.back.controller;

import com.rpg.back.converter.AbstractConverter;
import com.rpg.back.dto.AbstractDTO;
import com.rpg.back.entity.AbstractEntity;
import com.rpg.back.service.GenericService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public abstract class GenericController<Model extends AbstractEntity, DTO extends AbstractDTO>{
    protected abstract AbstractConverter<Model, DTO> getConverter();

    protected abstract GenericService<Model> getService();

    @GetMapping
    public ResponseEntity<Page<Model>> findAll(Pageable pageable) {
        return ResponseEntity.ok(getService().findAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<DTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(getConverter().toDto(getService().findById(id)));
    }

    @PostMapping
    public ResponseEntity<DTO> save(@RequestBody DTO dto) {
        Model model = getService().save(getConverter().toEntity(dto));
        return ResponseEntity.ok(getConverter().toDto(model));
    }

    @PutMapping
    public ResponseEntity<DTO> update(@RequestBody DTO dto) {
        Model model = getService().update(getConverter().toEntity(dto));
        return ResponseEntity.ok(getConverter().toDto(model));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<DTO> delete(@PathVariable Long id) {
        return ResponseEntity.ok(getConverter().toDto(getService().delete(id)));
    }
}
