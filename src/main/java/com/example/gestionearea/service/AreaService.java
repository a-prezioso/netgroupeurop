package com.example.gestionearea.service;

import com.example.gestionearea.entity.Area;
import com.example.gestionearea.dto.AreaDto;

import java.util.List;

public interface AreaService {

    AreaDto findById(Integer id);

    List<AreaDto> findAll();

    Area delete(Integer id);

    Area save(Area area);
}
