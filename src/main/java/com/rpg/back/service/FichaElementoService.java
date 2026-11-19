package com.rpg.back.service;

import com.rpg.back.entity.FichaElemento;
import com.rpg.back.repository.FichaElementoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FichaElementoService extends GenericService<FichaElemento> {
    @Autowired
    FichaElementoRepository repository;

    @Override
    protected FichaElementoRepository getRepository() {
        return repository;
    }

    public List<FichaElemento> findAllFromTemplate(Long templateId) {
        return getRepository().findByFichaTemplate_Id(templateId);
    }
}
