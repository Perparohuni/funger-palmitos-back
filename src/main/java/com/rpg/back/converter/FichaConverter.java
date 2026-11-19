package com.rpg.back.converter;

import com.rpg.back.dto.FichaDTO;
import com.rpg.back.dto.FichaElementoDTO;
import com.rpg.back.entity.Ficha;
import com.rpg.back.entity.FichaElemento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FichaConverter implements AbstractConverter<Ficha, FichaDTO> {
    @Autowired
    FichaTemplateConverter fichaTemplateConverter;
    @Autowired
    UsuarioConverter usuarioConverter;

    @Override
    public FichaDTO toDto(Ficha model) {
        if (model == null) return null;
        FichaDTO dto = new FichaDTO();
        dto.setId(model.getId());
        dto.setNome(model.getNome());
        dto.setAtivo(model.isAtivo());
        dto.setFichaTemplate(fichaTemplateConverter.toDto(model.getFichaTemplate()));
        dto.setUsuario(usuarioConverter.toDto(model.getUsuario()));

        return dto;
    }

    @Override
    public Ficha toEntity(FichaDTO dto) {
        if (dto == null) return null;
        Ficha model = new Ficha();
        model.setId(dto.getId());
        model.setNome(dto.getNome());
        model.setAtivo(dto.isAtivo());
        model.setFichaTemplate(fichaTemplateConverter.toEntity(dto.getFichaTemplate()));
        model.setUsuario(usuarioConverter.toEntity(dto.getUsuario()));

        return model;
    }
}
