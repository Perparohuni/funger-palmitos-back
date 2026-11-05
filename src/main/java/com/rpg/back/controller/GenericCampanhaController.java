package com.rpg.back.controller;

import com.rpg.back.dto.AbstractDTO;
import com.rpg.back.entity.AbstractEntity;
import com.rpg.back.service.GenericCampanhaService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public abstract class GenericCampanhaController<Model extends AbstractEntity, DTO extends AbstractDTO> extends
        GenericController<Model, DTO> {
    @Override
    protected abstract GenericCampanhaService<Model> getService();

    @GetMapping("/campanha/{campanhaId}")
    public ResponseEntity<Page<Model>> findAllFromCampanha(Pageable pageable, @PathVariable Long campanhaId) {
        return ResponseEntity.ok(getService().findAllFromCampanha(pageable, campanhaId));
    }
}
