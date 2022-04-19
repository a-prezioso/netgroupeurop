package com.example.gestionearea.service;

import com.example.gestionearea.converter.AreaConverter;
import com.example.gestionearea.entity.Area;
import com.example.gestionearea.dto.AreaDto;
import com.example.gestionearea.repository.AreaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaServiceImpl implements AreaService{

    @Autowired
    AreaRepo areaRepo;


    @Override
    public AreaDto findById(Integer id) {
        Area area = areaRepo.findById(id).get();
        AreaConverter map = new AreaConverter();
        return map.toDto(area);
    }

    @Override
    public List<AreaDto> findAll() {
        AreaConverter map = new AreaConverter();
        return map.listToDto(areaRepo.findAll());
    }

    @Override
    public Area delete(Integer id) {
        Area area= areaRepo.findById(id).get();
        areaRepo.delete(area);
        return area;
    }

    @Override
    public Area save(Area area) {
        return areaRepo.save(area);
    }
}
