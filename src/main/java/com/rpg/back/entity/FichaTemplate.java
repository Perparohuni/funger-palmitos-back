package com.rpg.back.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ficha_template")
public class FichaTemplate extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Sistema sistema;

    private String nome;
    private boolean ativo;

    @OneToMany(mappedBy = "fichaTemplate", cascade = CascadeType.ALL)
    private List<FichaElemento> elementos = new ArrayList<>();

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
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

    public List<FichaElemento> getElementos() {
        return elementos;
    }

    public void setElementos(List<FichaElemento> elementos) {
        this.elementos = elementos;
    }
}
