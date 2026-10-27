package com.rpg.back.converter;

import com.rpg.back.dto.UsuarioDTO;
import com.rpg.back.entity.Usuario;
import org.springframework.stereotype.Component;

@Component
public class UsuarioConverter implements AbstractConverter<Usuario, UsuarioDTO>{
    @Override
    public UsuarioDTO toDto(Usuario model) {
        UsuarioDTO dto = new UsuarioDTO();
        dto.setId(model.getId());
        dto.setLogin(model.getLogin());
        dto.setSenha(model.getSenha());
        dto.setMestre(model.isMestre());

        return dto;
    }

    @Override
    public Usuario toEntity(UsuarioDTO dto) {
        Usuario  model = new Usuario()  ;
        model.setId(dto.getId());
        model.setSenha(dto.getSenha());
        model.setLogin(dto.getLogin());
        model.setMestre(dto.isMestre());

        return model;
    }
}
