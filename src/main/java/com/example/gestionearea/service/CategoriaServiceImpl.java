package com.example.gestionearea.service;

import com.example.gestionearea.converter.CategoriaConverter;
import com.example.gestionearea.entity.Categoria;
import com.example.gestionearea.dto.CategoriaDto;
import com.example.gestionearea.repository.CategoriaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService{

    @Autowired
    CategoriaRepo categoriaRepo;

    @Override
    public CategoriaDto findById(Long id) {
        Categoria categoria = categoriaRepo.findById(id).get();
        CategoriaConverter map = new CategoriaConverter();
        return map.toDto(categoria);
    }

    @Override
    public List<CategoriaDto> findAll() {
        CategoriaConverter map = new CategoriaConverter();
        return map.listToDto(categoriaRepo.findAll());
    }

    @Override
    public Categoria delete(Long id) {
        Categoria categoria = categoriaRepo.findById(id).get();
        categoriaRepo.delete(categoria);
        return categoria;
    }

    @Override
    public Categoria save(Categoria categoria) {
        return categoriaRepo.save(categoria);
    }
}
