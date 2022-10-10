package com.dev.ferreteriaapi.repositories;

import com.dev.ferreteriaapi.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepo extends JpaRepository<Usuario, Long> {
    Usuario findByUsername(String username);
    Long countByUsername(String username);

}
