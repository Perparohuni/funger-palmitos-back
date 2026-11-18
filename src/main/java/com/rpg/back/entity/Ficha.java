package com.rpg.back.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ficha")
public class Ficha extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private FichaTemplate fichaTemplate;

    @ManyToOne
    private Usuario usuario;

    private String nome;
    private boolean ativo;

    @OneToMany(mappedBy = "ficha", cascade = CascadeType.ALL)
    private List<FichaElemento> elementos = new ArrayList<>();

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FichaTemplate getFichaTemplate() {
        return fichaTemplate;
    }

    public void setFichaTemplate(FichaTemplate fichaTemplate) {
        this.fichaTemplate = fichaTemplate;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
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

    public List<FichaElemento> getElementos() {
        return elementos;
    }

    public void setElementos(List<FichaElemento> elementos) {
        this.elementos = elementos;
    }
}
