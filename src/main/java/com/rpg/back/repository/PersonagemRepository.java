package com.rpg.back.repository;

import com.rpg.back.entity.Personagem;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonagemRepository extends JpaRepository<Personagem, Long> {

    Page<Personagem> findByUsuario_Id(Long idUsuario, Pageable pageable);
}
