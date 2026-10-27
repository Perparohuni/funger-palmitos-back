package com.rpg.back.converter;

import com.rpg.back.dto.SistemaDTO;
import com.rpg.back.entity.Sistema;
import org.springframework.stereotype.Component;

@Component
public class SistemaConverter implements AbstractConverter<Sistema, SistemaDTO>{

    @Override
    public SistemaDTO toDto(Sistema model) {
        SistemaDTO dto = new SistemaDTO();
        dto.setId(model.getId());
        dto.setNome(model.getNome());
        dto.setAtivo(model.isAtivo());

        return dto;
    }

    @Override
    public Sistema toEntity(SistemaDTO dto) {
        Sistema model = new Sistema();
        model.setId(dto.getId());
        model.setNome(dto.getNome());
        model.setAtivo(dto.isAtivo());

        return model;
    }
}
