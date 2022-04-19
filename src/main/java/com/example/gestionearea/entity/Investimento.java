package com.example.gestionearea.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Investimento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String nome_investimeno;

    @Column
    private Double totale_investimento;

    @Column
    private LocalDate data_investimento;

    @ManyToOne
    @JoinColumn(name = "id_categoria", referencedColumnName = "id")
    private Categoria categoria;

    @ManyToOne
    private Area area;
}
