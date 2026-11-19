package com.rpg.back.converter;

import com.rpg.back.dto.FichaElementoDTO;
import com.rpg.back.dto.FichaTemplateDTO;
import com.rpg.back.entity.FichaElemento;
import com.rpg.back.entity.FichaTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FichaTemplateConverter implements AbstractConverter<FichaTemplate, FichaTemplateDTO>{
    @Autowired
    SistemaConverter sistemaConverter;

    @Override
    public FichaTemplateDTO toDto(FichaTemplate model) {
        if (model == null) return null;
        FichaTemplateDTO dto = new FichaTemplateDTO();
        dto.setId(model.getId());
        dto.setNome(model.getNome());
        dto.setAtivo(model.isAtivo());
        dto.setSistema(sistemaConverter.toDto(model.getSistema()));

        return dto;
    }

    @Override
    public FichaTemplate toEntity(FichaTemplateDTO dto) {
        if (dto == null) return null;
        FichaTemplate model = new FichaTemplate();
        model.setId(dto.getId());
        model.setNome(dto.getNome());
        model.setAtivo(dto.isAtivo());
        model.setSistema(sistemaConverter.toEntity(dto.getSistema()));

        return model;
    }
}