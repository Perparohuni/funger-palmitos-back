package com.rpg.back.repository;

import com.rpg.back.entity.AbstractEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericSystemRepository<T extends AbstractEntity> extends JpaRepository<T, Long> {
    Page<T> findAllBySistema_Id(Long idSistema, Pageable pageable);
}
