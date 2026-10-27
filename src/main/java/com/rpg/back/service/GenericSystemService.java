package com.rpg.back.service;

import com.rpg.back.entity.AbstractEntity;
import com.rpg.back.repository.GenericSystemRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public abstract class GenericSystemService<Model extends AbstractEntity> extends GenericService<Model> {
    @Override
    protected abstract GenericSystemRepository<Model> getRepository();

    public Page<Model> findAllFromSistema(Pageable pageable, Long idSistema) {
        return getRepository().findAllBySistema_Id(idSistema, pageable);
    }
}
