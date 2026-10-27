package com.rpg.back.controller;

import com.rpg.back.dto.AbstractDTO;
import com.rpg.back.entity.AbstractEntity;
import com.rpg.back.service.GenericSystemService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public abstract class GenericSystemController<Model extends AbstractEntity, DTO extends AbstractDTO> extends
        GenericController<Model, DTO> {
    @Override
    protected abstract GenericSystemService<Model> getService();

    @GetMapping("/sistema/{idSistema}")
    public ResponseEntity<Page<Model>> findAllFromSistema(Pageable pageable, @PathVariable Long idSistema) {
        return ResponseEntity.ok(getService().findAllFromSistema(pageable, idSistema));
    }
}
