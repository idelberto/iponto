package br.com.iponto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.iponto.dominio.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}

