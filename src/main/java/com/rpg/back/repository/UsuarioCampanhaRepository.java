package com.rpg.back.repository;

import com.rpg.back.entity.Campanha;
import com.rpg.back.entity.Usuario;
import com.rpg.back.entity.UsuarioCampanha;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

public interface UsuarioCampanhaRepository extends GenericCampanhaRepository<UsuarioCampanha> {
    boolean existsByUsuarioAndCampanhas(Usuario usuario, Campanha campanha);

    @Query("""
            SELECT uc.campanhas from UsuarioCampanha uc
            where uc.usuario.id = :idUsuario
            """)
    Page<Campanha> findByUsuario_Id(Long idUsuario, Pageable pageable);
}
