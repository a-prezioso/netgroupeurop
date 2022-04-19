package com.example.gestionearea.service;

import com.example.gestionearea.entity.Categoria;
import com.example.gestionearea.dto.CategoriaDto;

import java.util.List;

public interface CategoriaService {
    CategoriaDto findById(Long id);

    List<CategoriaDto> findAll();

    Categoria delete(Long id);

    Categoria save(Categoria aula);
}
