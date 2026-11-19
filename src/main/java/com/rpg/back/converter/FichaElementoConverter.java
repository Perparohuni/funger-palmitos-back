package com.rpg.back.converter;

import com.rpg.back.dto.FichaElementoDTO;
import com.rpg.back.entity.FichaElemento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FichaElementoConverter implements AbstractConverter<FichaElemento, FichaElementoDTO> {
    @Autowired
    FichaTemplateConverter fichaTemplateConverter;

    @Autowired
    FichaConverter fichaConverter;

    @Override
    public FichaElementoDTO toDto(FichaElemento model) {
        if (model == null) return null;
        FichaElementoDTO dto = new FichaElementoDTO();
        dto.setId(model.getId());
        dto.setPosX(model.getPosX());
        dto.setPosY(model.getPosY());
        dto.setLargura(model.getLargura());
        dto.setAltura(model.getAltura());
        dto.setTipo(model.getTipo());
        dto.setConfiguracao(model.getConfiguracao());
        dto.setValor(model.getValor());
        dto.setFicha(fichaConverter.toDto(model.getFicha()));
        dto.setFichaTemplate(fichaTemplateConverter.toDto(model.getFichaTemplate()));

        return dto;
    }


    @Override
    public FichaElemento toEntity(FichaElementoDTO dto) {
        if (dto == null) return null;
        FichaElemento model = new FichaElemento();
        model.setId(dto.getId());
        model.setPosX(dto.getPosX());
        model.setPosY(dto.getPosY());
        model.setLargura(dto.getLargura());
        model.setAltura(dto.getAltura());
        model.setTipo(dto.getTipo());
        model.setConfiguracao(dto.getConfiguracao());
        model.setValor(dto.getValor());
        model.setFicha(fichaConverter.toEntity(dto.getFicha()));
        model.setFichaTemplate(fichaTemplateConverter.toEntity(dto.getFichaTemplate()));

        return model;
    }
}