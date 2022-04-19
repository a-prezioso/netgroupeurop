package com.example.gestionearea.dto;

import lombok.Data;

import java.util.List;

@Data
public class AreaDto {

    private String nome_area;

    private List<String> nomi_investimento;
}
