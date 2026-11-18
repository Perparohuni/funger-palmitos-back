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
    FichaElementoConverter fichaElementoConverter;
    @Autowired
    UsuarioConverter usuarioConverter;

    @Override
    public FichaDTO toDto(Ficha model) {
        FichaDTO dto = new FichaDTO();
        dto.setId(model.getId());
        dto.setNome(model.getNome());
        dto.setAtivo(model.isAtivo());
        dto.setFichaTemplate(fichaTemplateConverter.toDto(model.getFichaTemplate()));
        dto.setUsuario(usuarioConverter.toDto(model.getUsuario()));
        dto.setElementos(elementosToDTO(model.getElementos()));

        return dto;
    }

    @Override
    public Ficha toEntity(FichaDTO dto) {
        Ficha model = new Ficha();
        model.setId(dto.getId());
        model.setNome(dto.getNome());
        model.setAtivo(dto.isAtivo());
        model.setFichaTemplate(fichaTemplateConverter.toEntity(dto.getFichaTemplate()));
        model.setUsuario(usuarioConverter.toEntity(dto.getUsuario()));
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
