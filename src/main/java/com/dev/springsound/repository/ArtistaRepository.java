package com.dev.springsound.repository;

import com.dev.springsound.model.Artista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArtistaRepository extends JpaRepository<Artista, Long> {
    Optional<Artista> findByNomeContainingIgnoreCase(String nome);
}
