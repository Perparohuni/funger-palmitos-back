package com.rpg.back.entity;

import com.rpg.back.enums.EnumTipoElemento;
import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import tools.jackson.databind.JsonNode;

@Entity
@Table(name = "ficha_elemento")
public class FichaElemento extends AbstractEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private FichaTemplate fichaTemplate;
    @ManyToOne
    private Ficha ficha;

    @Column(name = "pos_x")
    private Integer posX;
    @Column(name = "pos_y")
    private Integer posY;

    private Integer largura;
    private Integer altura;

    @Enumerated(EnumType.STRING)
    private EnumTipoElemento tipo;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(columnDefinition = "jsonb")
    private JsonNode configuracao;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(columnDefinition = "jsonb")
    private JsonNode valor;

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

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

    public Integer getPosX() {
        return posX;
    }

    public void setPosX(Integer posX) {
        this.posX = posX;
    }

    public Integer getPosY() {
        return posY;
    }

    public void setPosY(Integer posY) {
        this.posY = posY;
    }

    public Integer getLargura() {
        return largura;
    }

    public void setLargura(Integer largura) {
        this.largura = largura;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public EnumTipoElemento getTipo() {
        return tipo;
    }

    public void setTipo(EnumTipoElemento tipo) {
        this.tipo = tipo;
    }

    public JsonNode getConfiguracao() {
        return configuracao;
    }

    public void setConfiguracao(JsonNode configuracao) {
        this.configuracao = configuracao;
    }

    public JsonNode getValor() {
        return valor;
    }

    public void setValor(JsonNode valor) {
        this.valor = valor;
    }
}
