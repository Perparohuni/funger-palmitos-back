package com.rpg.back.converter;

import com.rpg.back.dto.FichaTemplateDTO;
import com.rpg.back.entity.FichaTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FichaTemplateConverter implements AbstractConverter<FichaTemplate, FichaTemplateDTO>{
    @Autowired
    SistemaConverter sistemaConverter;

    @Override
    public FichaTemplateDTO toDto(FichaTemplate model) {
        FichaTemplateDTO dto = new FichaTemplateDTO();
        dto.setId(model.getId());
        dto.setNome(model.getNome());
        dto.setAtivo(model.isAtivo());
        dto.setSistema(sistemaConverter.toDto(model.getSistema()));

        return dto;
    }

    @Override
    public FichaTemplate toEntity(FichaTemplateDTO dto) {
        FichaTemplate model = new FichaTemplate();
        model.setId(dto.getId());
        model.setNome(dto.getNome());
        model.setAtivo(dto.isAtivo());
        model.setSistema(sistemaConverter.toEntity(dto.getSistema()));

        return model;
    }
}
