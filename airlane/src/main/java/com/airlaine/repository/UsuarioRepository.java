package com.airlaine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airlaine.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
}
