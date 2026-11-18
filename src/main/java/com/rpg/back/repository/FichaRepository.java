package com.rpg.back.repository;

import com.rpg.back.entity.Ficha;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FichaRepository extends JpaRepository<Ficha, Long> {
    Page<Ficha> findByUsuario_Id(Long idUsuario, Pageable pageable);
}
