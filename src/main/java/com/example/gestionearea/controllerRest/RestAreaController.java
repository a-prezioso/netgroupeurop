package com.example.gestionearea.controllerRest;

import com.example.gestionearea.entity.Area;
import com.example.gestionearea.dto.AreaDto;
import com.example.gestionearea.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/area")
public class RestAreaController {

    @Autowired
    AreaService areaService;

    @GetMapping(value = "/{id}")
    public AreaDto getById(@PathVariable("id") Integer id) {
        return areaService.findById(id);
    }

    @GetMapping(value = "/lista")
    public List<AreaDto> getAll() {
        return areaService.findAll();
    }

    @PostMapping(value = "/newArea")
    public void newArea(@RequestBody Area area) {
        areaService.save(area);
    }

    @DeleteMapping(value = "/deleteArea/{id}")
    public void deleteAreaPerId(@PathVariable("id") Integer id) {
        areaService.delete(id);
    }

}
