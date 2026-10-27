package com.rpg.back.converter;

import com.rpg.back.dto.CampanhaDTO;
import com.rpg.back.entity.Campanha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CampanhaConverter implements AbstractConverter<Campanha, CampanhaDTO> {

    @Autowired
    SistemaConverter sistemaConverter;

    @Override
    public CampanhaDTO toDto(Campanha model) {
        CampanhaDTO dto = new CampanhaDTO();
        dto.setId(model.getId());
        dto.setNome(model.getNome());
        dto.setDescricao(model.getDescricao());
        dto.setAtivo(model.getAtivo());
        dto.setSistema(sistemaConverter.toDto(model.getSistema()));

        return dto;
    }

    @Override
    public Campanha toEntity(CampanhaDTO dto) {
        Campanha model = new Campanha();
        model.setId(dto.getId());
        model.setNome(dto.getNome());
        model.setDescricao(dto.getDescricao());
        model.setAtivo(dto.isAtivo());
        model.setSistema(sistemaConverter.toEntity(dto.getSistema()));
        return model;
    }
}
