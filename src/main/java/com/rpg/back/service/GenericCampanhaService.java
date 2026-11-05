package com.rpg.back.service;

import com.rpg.back.entity.AbstractEntity;
import com.rpg.back.repository.GenericCampanhaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public abstract class GenericCampanhaService<Model extends AbstractEntity> extends GenericService<Model> {
    @Override
    protected abstract GenericCampanhaRepository<Model> getRepository();

    public Page<Model> findAllFromCampanha(Pageable pageable, Long campanhaId) {
        return getRepository().findAllByCampanhas_id(campanhaId, pageable);
    }
}