package com.rpg.back.dto;

import com.rpg.back.enums.EnumTipoElemento;
import tools.jackson.databind.JsonNode;

public class FichaElementoDTO extends AbstractDTO{
    private FichaTemplateDTO fichaTemplate;
    private FichaDTO ficha;

    private Integer posX;
    private Integer posY;

    private Integer largura;
    private Integer altura;

    private EnumTipoElemento tipo;

    private JsonNode configuracao;
    private JsonNode valor;

    @Override
    public Long getId() {
        return id;
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

    public FichaDTO getFicha() {
        return ficha;
    }

    public void setFicha(FichaDTO ficha) {
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
