package com.devpablo.quickstart;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CasaService {
    private final CasaRepository casaRepository;

    public CasaService(CasaRepository casaRepository) {
        this.casaRepository = casaRepository;
    }

    public List<Casa> listarCasas(){
        return (List<Casa>) this.casaRepository.findAll();
    }

    public Casa crearCasa(Casa casa){
        return this.casaRepository.save(casa);
    }
}
