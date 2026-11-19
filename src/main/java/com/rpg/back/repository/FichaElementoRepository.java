package com.rpg.back.repository;

import com.rpg.back.entity.FichaElemento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FichaElementoRepository extends JpaRepository<FichaElemento, Long> {
    List<FichaElemento> findByFichaTemplate_Id(Long templateId);
}
