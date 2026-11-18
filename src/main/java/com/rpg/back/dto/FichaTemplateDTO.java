package com.rpg.back.dto;

import java.util.ArrayList;
import java.util.List;

public class FichaTemplateDTO extends AbstractDTO {
    private SistemaDTO sistema;
    private String nome;
    private boolean ativo;

    private List<FichaElementoDTO> elementos = new ArrayList<>();

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

    public List<FichaElementoDTO> getElementos() {
        return elementos;
    }

    public void setElementos(List<FichaElementoDTO> elementos) {
        this.elementos = elementos;
    }
}
