package com.rpg.back.converter;

import com.rpg.back.dto.AtributoDTO;
import com.rpg.back.entity.Atributo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtributoConverter implements AbstractConverter<Atributo, AtributoDTO> {
    @Autowired
    SistemaConverter sistemaConverter;

    @Override
    public AtributoDTO toDto(Atributo model) {
        AtributoDTO dto = new AtributoDTO();
        dto.setId(model.getId());
        dto.setNome(model.getNome());
        dto.setDescricao(model.getDescricao());
        dto.setMaximo(model.getMaximo());
        dto.setMinimo(model.getMinimo());
        dto.setTipoDado(model.getTipoDado());
        dto.setValorMaximoDado(model.getValorMaximoDado());
        dto.setValorMinimoDado(model.getValorMinimoDado());
        dto.setSistema(sistemaConverter.toDto(model.getSistema()));

        return dto;
    }

    @Override
    public Atributo toEntity(AtributoDTO dto) {
        Atributo model = new Atributo();
        model.setId(dto.getId());
        model.setNome(dto.getNome());
        model.setDescricao(dto.getDescricao());
        model.setMaximo(dto.getMaximo());
        model.setMinimo(dto.getMinimo());
        model.setTipoDado(dto.getTipoDado());
        model.setValorMaximoDado(dto.getValorMaximoDado());
        model.setValorMinimoDado(dto.getValorMinimoDado());
        model.setSistema(sistemaConverter.toEntity(dto.getSistema()));

        return model;
    }
}