package com.rpg.back.service;

import com.rpg.back.entity.AbstractEntity;
import com.rpg.back.utils.RPGException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class GenericService<Model extends AbstractEntity> {

    protected abstract JpaRepository<Model, Long> getRepository();

    public Page<Model> findAll(Pageable pageable) {
        return getRepository().findAll(pageable);
    }

    public Model save(Model model) {
        return getRepository().save(model);
    }

    public Model update(Model model) {
        return getRepository().save(model);
    }

    public Model findById(Long id) {
        return getRepository().findById(id).orElseThrow(() -> new RPGException("Registro não encontrado!"));
    }

    public Model delete(Long id) {
        Model campanha = getRepository().findById(id).orElseThrow(() -> new RPGException("Registro não encontrado!"));
        getRepository().delete(campanha);
        return campanha;
    }
}
