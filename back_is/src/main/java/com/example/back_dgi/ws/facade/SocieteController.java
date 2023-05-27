package com.example.back_dgi.ws.facade;

import com.example.back_dgi.ws.converter.SocieteConverter;
import com.example.back_dgi.ws.dto.SocieteDto;
import com.example.back_dgi.service.SocieteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/societe")
public class SocieteController {

    @GetMapping("/libelle/{libelle}")
    public SocieteDto findSocieteByLibelle(@PathVariable String libelle) {
        return this.converter.toDto(service.findSocieteByLibelle(libelle));
    }
    @PostMapping("/")
    public void saveSociete(@RequestBody SocieteDto societeDto) {
        this.service.saveSociete(this.converter.toItem(societeDto));
    }
    @GetMapping("/all")
    public List<SocieteDto> getAllsociete() {
        return  this.converter.toDtos(this.service.getAllsociete());
    }


    private final SocieteService service;
    private final SocieteConverter converter;

    public SocieteController(SocieteService societeService, SocieteConverter societeConverter) {
        this.service = societeService;
        this.converter = societeConverter;
    }

}
