package com.rpg.back.converter;

import com.rpg.back.dto.CampanhaDTO;
import com.rpg.back.entity.Campanha;
import org.springframework.stereotype.Component;

@Component
public class CampanhaConverter implements AbstractConverter<Campanha, CampanhaDTO> {

    @Override
    public CampanhaDTO toDto(Campanha model) {
        CampanhaDTO dto = new CampanhaDTO();
        dto.setId(model.getId());
        dto.setNome(model.getNome());
        dto.setDescricao(model.getDescricao());
        dto.setAtivo(model.getAtivo());

        return dto;
    }

    @Override
    public Campanha toEntity(CampanhaDTO dto) {
        Campanha model = new Campanha();
        model.setId(dto.getId());
        model.setNome(dto.getNome());
        model.setDescricao(dto.getDescricao());
        model.setAtivo(dto.getAtivo());

        return model;
    }
}
