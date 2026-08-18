package com.rpg.back.repository;

import com.rpg.back.entity.Campanha;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampanhaRepository extends JpaRepository<Campanha, Long> {


    Page<Campanha> getAllByAtivoTrue(Pageable pageable);
}
