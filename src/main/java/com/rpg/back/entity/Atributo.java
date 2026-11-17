package com.rpg.back.entity;

import com.rpg.back.enums.EnumTipoDado;
import jakarta.persistence.*;

@Entity
@Table(name = "atributo")
public class Atributo extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Sistema sistema;

    private String nome;
    private String descricao;
    private Long maximo;
    private Long minimo;

    @Enumerated(EnumType.STRING)
    private EnumTipoDado tipoDado;
    private Long valorMaximoDado;
    private Long valorMinimoDado;

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getMaximo() {
        return maximo;
    }

    public void setMaximo(Long maximo) {
        this.maximo = maximo;
    }

    public Long getMinimo() {
        return minimo;
    }

    public void setMinimo(Long minimo) {
        this.minimo = minimo;
    }

    public EnumTipoDado getTipoDado() {
        return tipoDado;
    }

    public void setTipoDado(EnumTipoDado tipoDado) {
        this.tipoDado = tipoDado;
    }

    public Long getValorMaximoDado() {
        return valorMaximoDado;
    }

    public void setValorMaximoDado(Long valorMaximoDado) {
        this.valorMaximoDado = valorMaximoDado;
    }

    public Long getValorMinimoDado() {
        return valorMinimoDado;
    }

    public void setValorMinimoDado(Long valorMinimoDado) {
        this.valorMinimoDado = valorMinimoDado;
    }
}