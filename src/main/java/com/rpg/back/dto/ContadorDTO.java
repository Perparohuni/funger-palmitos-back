package com.rpg.back.dto;

public class ContadorDTO extends AbstractDTO{
    private SistemaDTO sistema;

    private String nome;
    private String descricao;
    private Long maximo;
    private Long minimo;

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
}
