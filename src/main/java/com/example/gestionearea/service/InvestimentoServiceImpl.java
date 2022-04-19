package com.example.gestionearea.service;

import com.example.gestionearea.converter.InvestimentoConverter;
import com.example.gestionearea.entity.Investimento;
import com.example.gestionearea.dto.InvestimentoDto;
import com.example.gestionearea.repository.InvestimentoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestimentoServiceImpl implements InvestimentoService{

    @Autowired
    InvestimentoRepo investimentoRepo;


    @Override
    public InvestimentoDto findById(Long id) {
        Investimento investimento=investimentoRepo.findById(id).get();
        InvestimentoConverter map = new InvestimentoConverter();

        return map.toDto(investimento);
    }

    @Override
    public List<InvestimentoDto> findAll() {
        InvestimentoConverter map = new InvestimentoConverter();
        return map.listToDto(investimentoRepo.findAll());
    }

    @Override
    public Investimento delete(Long id) {
        Investimento investimento = investimentoRepo.findById(id).get();
        investimentoRepo.delete(investimento);
        return investimento;
    }

    @Override
    public Investimento save(Investimento investimento) {
        return investimentoRepo.save(investimento);
    }
}
