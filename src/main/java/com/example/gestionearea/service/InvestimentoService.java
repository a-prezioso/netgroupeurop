package com.example.gestionearea.service;

import com.example.gestionearea.entity.Investimento;
import com.example.gestionearea.dto.InvestimentoDto;

import java.util.List;

public interface InvestimentoService {

    InvestimentoDto findById(Long id);

    List<InvestimentoDto> findAll();

    Investimento delete(Long id);

    Investimento save(Investimento aula);
}
