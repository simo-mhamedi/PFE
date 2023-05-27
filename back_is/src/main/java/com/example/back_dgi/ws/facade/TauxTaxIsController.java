package com.example.back_dgi.ws.facade;

import com.example.back_dgi.dao.TauxTaxIsDao;
import com.example.back_dgi.service.SocieteService;
import com.example.back_dgi.service.TauxTaxIsService;
import com.example.back_dgi.ws.converter.SocieteConverter;
import com.example.back_dgi.ws.converter.TauxTaxIsConverter;
import com.example.back_dgi.ws.dto.SocieteDto;
import com.example.back_dgi.ws.dto.TauxTaxIsDto;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("api/tauxTaxIs")
public class TauxTaxIsController {
    @GetMapping("/mtRetard/{mtRetard}")
    public TauxTaxIsDto findTauxTaxIsByMtRetard(@PathVariable BigDecimal mtRetard) {
        return this.converter.toDto(TauxTaxIs.findTauxTaxIsByMtretard(mtRetard));
    }
    @PostMapping("/")
    public void saveTauxTaxIs(@RequestBody TauxTaxIsDto tauxTaxIsDto) {
        this.TauxTaxIs.saveTauxTaxIs(this.converter.toItem(tauxTaxIsDto));
    }
    @GetMapping("/all")
    public List<TauxTaxIsDto> getAllTauxTaxIs() {
        return  this.converter.toDtos(this.TauxTaxIs.getAllTauxTaxIs());
    }

    private final TauxTaxIsService TauxTaxIs;
    private final TauxTaxIsConverter converter;

    public TauxTaxIsController(TauxTaxIsService TauxTaxIs, TauxTaxIsConverter converter) {
        this.TauxTaxIs = TauxTaxIs;
        this.converter = converter;
    }
}
