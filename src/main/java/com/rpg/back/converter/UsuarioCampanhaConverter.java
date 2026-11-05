package com.rpg.back.converter;

import com.rpg.back.dto.UsuarioCampanhaDTO;
import com.rpg.back.entity.UsuarioCampanha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UsuarioCampanhaConverter implements AbstractConverter<UsuarioCampanha, UsuarioCampanhaDTO> {

    @Autowired
    CampanhaConverter campanhaConverter;

    @Autowired
    UsuarioConverter usuarioConverter;

    @Override
    public UsuarioCampanhaDTO toDto(UsuarioCampanha model) {
        UsuarioCampanhaDTO dto = new UsuarioCampanhaDTO();
        dto.setId(model.getId());
        dto.setCampanhas(campanhaConverter.toDto(model.getCampanhas()));
        dto.setUsuario(usuarioConverter.toDto(model.getUsuario()));

        return dto;
    }

    @Override
    public UsuarioCampanha toEntity(UsuarioCampanhaDTO dto) {
        UsuarioCampanha model = new UsuarioCampanha();
        model.setId(model.getId());
        model.setCampanhas(campanhaConverter.toEntity(dto.getCampanhas()));
        model.setUsuario(usuarioConverter.toEntity(dto.getUsuario()));
        return model;
    }
}
