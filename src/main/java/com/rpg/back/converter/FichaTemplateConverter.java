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
    @Autowired
    FichaElementoConverter fichaElementoConverter;

    @Override
    public FichaTemplateDTO toDto(FichaTemplate model) {
        FichaTemplateDTO dto = new FichaTemplateDTO();
        dto.setId(model.getId());
        dto.setNome(model.getNome());
        dto.setAtivo(model.isAtivo());
        dto.setSistema(sistemaConverter.toDto(model.getSistema()));
        dto.setElementos(elementosToDTO(model.getElementos()));

        return dto;
    }

    @Override
    public FichaTemplate toEntity(FichaTemplateDTO dto) {
        FichaTemplate model = new FichaTemplate();
        model.setId(dto.getId());
        model.setNome(dto.getNome());
        model.setAtivo(dto.isAtivo());
        model.setSistema(sistemaConverter.toEntity(dto.getSistema()));
        model.setElementos(elementosToEntity(dto.getElementos()));

        return model;
    }

    private List<FichaElementoDTO> elementosToDTO(List<FichaElemento> entities) {
        return entities.stream().map(model -> fichaElementoConverter.toDto(model)).toList();
    }

    private List<FichaElemento> elementosToEntity(List<FichaElementoDTO> dtos) {
        return dtos.stream().map(dto -> fichaElementoConverter.toEntity(dto)).toList();
    }
}
