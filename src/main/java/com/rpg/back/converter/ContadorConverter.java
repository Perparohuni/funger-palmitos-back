package com.rpg.back.converter;

import com.rpg.back.dto.ContadorDTO;
import com.rpg.back.entity.Contador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ContadorConverter implements AbstractConverter<Contador, ContadorDTO>{
    @Autowired
    SistemaConverter sistemaConverter;

    @Override
    public ContadorDTO toDto(Contador model) {
        ContadorDTO dto = new ContadorDTO();
        dto.setId(model.getId());
        dto.setNome(model.getNome());
        dto.setDescricao(model.getDescricao());
        dto.setMaximo(model.getMaximo());
        dto.setMinimo(model.getMinimo());
        dto.setSistema(sistemaConverter.toDto(model.getSistema()));

        return dto;
    }

    @Override
    public Contador toEntity(ContadorDTO dto) {
        Contador model = new Contador();
        model.setId(dto.getId());
        model.setNome(dto.getNome());
        model.setDescricao(dto.getDescricao());
        model.setMaximo(dto.getMaximo());
        model.setMinimo(dto.getMinimo());
        model.setSistema(sistemaConverter.toEntity(dto.getSistema()));

        return model;
    }
}