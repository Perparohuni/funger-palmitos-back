package com.rpg.back.repository;

import com.rpg.back.entity.AbstractEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericCampanhaRepository<T extends AbstractEntity> extends JpaRepository<T, Long> {
    Page<T> findAllByCampanhas_id(Long campanhasId, Pageable pageable);
}
