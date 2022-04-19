package com.example.gestionearea.converter;

import com.example.gestionearea.entity.Area;
import com.example.gestionearea.entity.Investimento;
import com.example.gestionearea.dto.AreaDto;

import java.util.ArrayList;
import java.util.List;

public class AreaConverter {

    public AreaDto toDto(Area area){

        AreaDto dto = new AreaDto();

        dto.setNome_area(area.getNome_area());

        List<String> nomi_investimenti = new ArrayList<>();

        for(Investimento inv : area.getListaInvestimenti()){
            nomi_investimenti.add(inv.getNome_investimeno());
        }

        dto.setNomi_investimento(nomi_investimenti);

        return dto;
    }

    public  List<AreaDto> listToDto(List<Area> lista){

        List<AreaDto> listaDto= new ArrayList<>();

        for(int i=0; i<lista.size(); i++){
            listaDto.add(toDto(lista.get(i)));
        }

        return listaDto;
    }
}
