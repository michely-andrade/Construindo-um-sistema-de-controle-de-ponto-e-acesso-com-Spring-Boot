package com.dio.live.repository;

import com.dio.live.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface JornadaRepository {
    JornadaTrabalho save(JornadaTrabalho jornadaTrabalho);

    List<JornadaTrabalho> findAll();

    Optional<JornadaTrabalho> findById(Long idJornada);

    void deleteById(Long idJornada);
}
