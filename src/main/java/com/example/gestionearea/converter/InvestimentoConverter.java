package com.example.gestionearea.converter;

import com.example.gestionearea.entity.Investimento;
import com.example.gestionearea.dto.InvestimentoDto;

import java.util.ArrayList;
import java.util.List;

public class InvestimentoConverter {

    public InvestimentoDto toDto(Investimento investimento){

        InvestimentoDto dto = new InvestimentoDto();

        dto.setNome_investimento(investimento.getNome_investimeno());
        dto.setTotale_investimento(investimento.getTotale_investimento());
        dto.setData_investimento(investimento.getData_investimento());
        dto.setNome_categoria(investimento.getCategoria().getNome_categoria());

        return dto;
    }

    public List<InvestimentoDto> listToDto(List<Investimento> lista){

        List<InvestimentoDto> listaDto= new ArrayList<>();

        for(int i=0; i<lista.size(); i++){
            listaDto.add(toDto(lista.get(i)));
        }

        return listaDto;
    }

}
