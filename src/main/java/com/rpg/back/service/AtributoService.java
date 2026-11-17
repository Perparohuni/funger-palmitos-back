package com.rpg.back.service;

import com.rpg.back.entity.Atributo;
import com.rpg.back.repository.AtributoRepository;
import com.rpg.back.utils.RPGException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class AtributoService extends GenericSystemService<Atributo>{
    @Autowired
    AtributoRepository repository;

    @Override
    protected AtributoRepository getRepository() {
        return repository;
    }

    @Override
    public Atributo save(Atributo atributo) {
        if(atributo.getTipoDado() != null && atributo.getValorMaximoDado() != null && atributo.getValorMinimoDado() != null) {
            throw new RPGException("Caso escolher um tipo de dado, não é necessário informar os valores mínimos e máximos dele");
        }

        if(atributo.getTipoDado() != null) {
            atributo.setValorMaximoDado(atributo.getTipoDado().getMaximo());
            atributo.setValorMinimoDado(atributo.getTipoDado().getMinimo());
        }
        return super.save(atributo);
    }

    @Override
    public Atributo update(Atributo atributo) {
        if(atributo.getTipoDado() != null && atributo.getValorMaximoDado() != null && atributo.getValorMinimoDado() != null) {
            throw new RPGException("Caso escolher um tipo de dado, não é necessário informar os valores mínimos e máximos dele");
        }

        if(atributo.getTipoDado() != null) {
            atributo.setValorMaximoDado(atributo.getTipoDado().getMaximo());
            atributo.setValorMinimoDado(atributo.getTipoDado().getMinimo());
        }
        return super.save(atributo);
    }

    @Override
    public Atributo findById(Long id) {
        Atributo atributo = super.findById(id);
        if(atributo.getTipoDado() != null) {
            atributo.setValorMaximoDado(null);
            atributo.setValorMinimoDado(null);
        }
        return atributo;
    }
}