package com.rpg.back.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario_campanha")
public class UsuarioCampanha extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Campanha campanhas;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Campanha getCampanhas() {
        return campanhas;
    }

    public void setCampanhas(Campanha campanhas) {
        this.campanhas = campanhas;
    }
}
