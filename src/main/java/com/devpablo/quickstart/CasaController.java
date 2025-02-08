package com.devpablo.quickstart;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CasaController {

    private final CasaService casaService;

    public CasaController(CasaService casaService) {
        this.casaService = casaService;
    }

    @GetMapping
    public ResponseEntity<List<Casa>> listCasas(){

        List<Casa> casas = this.casaService.listarCasas();

        return ResponseEntity.ok(casas);
    }

    @PostMapping
    public ResponseEntity<Casa> crearCasa(@RequestBody Casa casa){

        Casa casaEntity = new Casa();
        casaEntity.setDireccion(casa.getDireccion());
        Casa casaDB = this.casaService.crearCasa(casaEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body(casaDB);
    }

}
