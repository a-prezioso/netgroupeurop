package com.example.gestionearea.controllerRest;


import com.example.gestionearea.entity.Categoria;
import com.example.gestionearea.dto.CategoriaDto;
import com.example.gestionearea.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categoria")
public class RestCategoriaController {

    @Autowired
    CategoriaService categoriaService;


    @GetMapping(value = "/{id}")
    public CategoriaDto getById(@PathVariable("id") Long id) {
        return categoriaService.findById(id);
    }

    @GetMapping(value = "/lista")
    public List<CategoriaDto> getAll() {
        return categoriaService.findAll();
    }

    @PostMapping(value = "/newCategoria")
    public void newCategoria(@RequestBody Categoria categoria) {
        categoriaService.save(categoria);
    }

    @DeleteMapping(value = "/deleteCategoria/{id}")
    public void deleteCategoriaPerId(@PathVariable("id") Long id) {
        categoriaService.delete(id);
    }

}
