package com.rpg.back.converter;

import com.rpg.back.dto.PersonagemDTO;
import com.rpg.back.entity.Personagem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonagemConverter implements AbstractConverter<Personagem, PersonagemDTO> {

    @Autowired
    UsuarioConverter usuarioConverter;

    @Override
    public PersonagemDTO toDto(Personagem model) {
        PersonagemDTO dto = new PersonagemDTO();
        dto.setId(model.getId());
        dto.setNome(model.getNome());
        dto.setDescricaoFisica(model.getDescricaoFisica());
        dto.setHistoria(model.getHistoria());
        dto.setObservacoes(model.getObservacoes());
        dto.setAtivo(model.isAtivo());
        dto.setUsuario(usuarioConverter.toDto(model.getUsuario()));

        return dto;
    }

    @Override
    public Personagem toEntity(PersonagemDTO dto) {
        Personagem model = new Personagem();
        model.setId(dto.getId());
        model.setNome(dto.getNome());
        model.setDescricaoFisica(dto.getDescricaoFisica());
        model.setHistoria(dto.getHistoria());
        model.setObservacoes(dto.getObservacoes());
        model.setAtivo(dto.isAtivo());
        model.setUsuario(usuarioConverter.toEntity(dto.getUsuario()));

        return model;
    }
}
