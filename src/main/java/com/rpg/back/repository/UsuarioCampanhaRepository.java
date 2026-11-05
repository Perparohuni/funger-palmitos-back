package com.rpg.back.repository;

import com.rpg.back.entity.Campanha;
import com.rpg.back.entity.Usuario;
import com.rpg.back.entity.UsuarioCampanha;

public interface UsuarioCampanhaRepository extends GenericCampanhaRepository<UsuarioCampanha> {
    boolean existsByUsuarioAndCampanhas(Usuario usuario, Campanha campanha);
}
