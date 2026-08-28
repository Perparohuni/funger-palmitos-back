package com.rpg.back.converter;

import com.rpg.back.dto.AbstractDTO;
import com.rpg.back.entity.AbstractEntity;

public interface AbstractConverter<Model extends AbstractEntity, DTO extends AbstractDTO> {
    public Model toEntity(DTO dto);

    public DTO toDto(Model model);
}
