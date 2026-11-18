package com.rpg.back.dto;

import java.util.ArrayList;
import java.util.List;

public class FichaDTO extends AbstractDTO{
    private FichaTemplateDTO fichaTemplate;
    private UsuarioDTO usuario;
    private String nome;
    private boolean ativo;

    private List<FichaElementoDTO> elementos = new ArrayList<>();

    @Override
    public Long getId() {
        return super.getId();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FichaTemplateDTO getFichaTemplate() {
        return fichaTemplate;
    }

    public void setFichaTemplate(FichaTemplateDTO fichaTemplate) {
        this.fichaTemplate = fichaTemplate;
    }

    public UsuarioDTO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.usuario = usuario;
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
