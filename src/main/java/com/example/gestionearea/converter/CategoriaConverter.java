package com.example.gestionearea.converter;

import com.example.gestionearea.entity.Categoria;
import com.example.gestionearea.dto.CategoriaDto;

import java.util.ArrayList;
import java.util.List;

public class CategoriaConverter {

    public CategoriaDto toDto(Categoria categoria){

        CategoriaDto dto = new CategoriaDto();

        dto.setNome_categoria(categoria.getNome_categoria());

        return dto;
    }

    public List<CategoriaDto> listToDto(List<Categoria> lista){

        List<CategoriaDto> listaDto= new ArrayList<>();

        for(int i=0; i<lista.size(); i++){
            listaDto.add(toDto(lista.get(i)));
        }

        return listaDto;
    }
}
