package com.example.gestionearea.controllerRest;

import com.example.gestionearea.entity.Investimento;
import com.example.gestionearea.dto.InvestimentoDto;
import com.example.gestionearea.service.InvestimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/investimento")
public class RestInvestimentoController {

    @Autowired
    InvestimentoService investimentoService;

    @GetMapping(value = "/{id}")
    public InvestimentoDto getById(@PathVariable("id") Long id) {
        return investimentoService.findById(id);
    }

    @GetMapping(value = "/lista")
    public List<InvestimentoDto> getAll() {
        return investimentoService.findAll();
    }

    @PostMapping(value = "/newInvestiento")
    public void newInvestimento(@RequestBody Investimento investimento) {
        investimentoService.save(investimento);
    }

    @DeleteMapping(value = "/deleteInvestimento/{id}")
    public void deleteInvestimentoPerId(@PathVariable("id") Long id) {
        investimentoService.delete(id);
    }

}
