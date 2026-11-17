package com.rpg.back.enums;

import com.rpg.back.utils.RPGException;

public enum EnumTipoDado {
    D100(100L, 1L),
    D20(20L, 1L),
    D12(12L, 1L),
    D10(10L, 1L),
    D8(8L, 1L),
    D6(6L, 1L),
    D4(4L, 1L);

    Long maximo;
    Long minimo;

    EnumTipoDado(Long maximo, Long minimo) {
        this.maximo = maximo;
        this.minimo = minimo;
    }

    public EnumTipoDado toEnum(String enumString) {
        for(EnumTipoDado dado: EnumTipoDado.values()) {
            if(enumString.equals(dado.name())) {
                return dado;
            }
        }
        throw new RPGException("Tipo de dado inválido");
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
