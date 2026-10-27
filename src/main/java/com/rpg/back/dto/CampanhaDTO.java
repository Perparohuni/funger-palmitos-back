package com.rpg.back.dto;

import jakarta.validation.constraints.NotEmpty;

public class CampanhaDTO extends AbstractDTO {
    @NotEmpty(message = "A campanha precisa ter um nome!")
    private String nome;
    private String descricao;
    private boolean ativo;
    private SistemaDTO sistema;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public SistemaDTO getSistema() {
        return sistema;
    }

    public void setSistema(SistemaDTO sistema) {
        this.sistema = sistema;
    }
}
