package com.rpg.back.enums;

import com.rpg.back.utils.RPGException;

public enum EnumTipoElemento {
    ATRIBUTO,
    CONTADOR,
    TEXTO_SIMPLES,
    CAMPO_TEXTO;


    public EnumTipoElemento toEnum(String enumString) {
        for(EnumTipoElemento dado: EnumTipoElemento.values()) {
            if(enumString.equals(dado.name())) {
                return dado;
            }
        }
        throw new RPGException("Tipo de elemento inválido");
    }
}
