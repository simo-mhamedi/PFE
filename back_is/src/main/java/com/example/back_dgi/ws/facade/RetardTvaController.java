package com.example.back_dgi.ws.facade;

import com.example.back_dgi.service.RetardTvaService;
import com.example.back_dgi.service.TauxTaxIsService;
import com.example.back_dgi.ws.converter.RetardTvaConverter;
import com.example.back_dgi.ws.converter.TauxTaxIsConverter;
import com.example.back_dgi.ws.dto.RetardTvaDto;
import com.example.back_dgi.ws.dto.TauxTaxIsDto;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("api/retardTva")
public class RetardTvaController {

    @GetMapping("/montantretard/{montantretard}")
    public RetardTvaDto findTauxTaxIsByMontantretard(@PathVariable BigDecimal montantretard) {
        return this.converter.toDto(retardTva.findRetardTvaByMontantretard(montantretard));
    }
    @PostMapping("/")
    public void saveRetardTva(@RequestBody RetardTvaDto retardTvaDto) {
        this.retardTva.saveRetardTva(this.converter.toItem(retardTvaDto));
    }
    @GetMapping("/all")
    public List<RetardTvaDto> getAllRetardTva() {
        return  this.converter.toDtos(this.retardTva.getAllRetardTva());
    }

    private final RetardTvaService  retardTva;
    private final RetardTvaConverter converter;

    public RetardTvaController(RetardTvaService retardTva, RetardTvaConverter converter) {
        this.retardTva = retardTva;
        this.converter = converter;
    }
}
