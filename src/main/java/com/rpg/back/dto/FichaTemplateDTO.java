package com.rpg.back.dto;

public class FichaTemplateDTO extends AbstractDTO {
    private SistemaDTO sistema;
    private String nome;
    private boolean ativo;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SistemaDTO getSistema() {
        return sistema;
    }

    public void setSistema(SistemaDTO sistema) {
        this.sistema = sistema;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
