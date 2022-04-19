package com.example.gestionearea.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String nome_categoria;
}
