package com.rpg.back.dto;

public class UsuarioCampanhaDTO extends AbstractDTO{
    private UsuarioDTO usuario;
    private CampanhaDTO campanhas;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UsuarioDTO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.usuario = usuario;
    }

    public CampanhaDTO getCampanhas() {
        return campanhas;
    }

    public void setCampanhas(CampanhaDTO campanhas) {
        this.campanhas = campanhas;
    }
}

