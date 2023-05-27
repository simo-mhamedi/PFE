package com.example.back_dgi.ws.converter;

import com.example.back_dgi.bean.TauxTaxIs;
import com.example.back_dgi.ws.dto.TauxTaxIsDto;
import com.example.back_dgi.generateur.mapper.AutoMapper;
import org.springframework.stereotype.Component;

@Component
public class TauxTaxIsConverter  extends AutoMapper<TauxTaxIs, TauxTaxIsDto> {
    public TauxTaxIsConverter() {
        super(TauxTaxIs.class, TauxTaxIsDto.class);
    }
}
