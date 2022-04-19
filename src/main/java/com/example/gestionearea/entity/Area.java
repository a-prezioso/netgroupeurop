package com.example.gestionearea.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Area {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String nome_area;

    @OneToMany(mappedBy = "area",fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    Set<Investimento> listaInvestimenti = new HashSet<>();

}
