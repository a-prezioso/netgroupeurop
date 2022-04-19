package com.example.gestionearea.repository;

import com.example.gestionearea.entity.Investimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvestimentoRepo extends JpaRepository<Investimento, Long> {
}
