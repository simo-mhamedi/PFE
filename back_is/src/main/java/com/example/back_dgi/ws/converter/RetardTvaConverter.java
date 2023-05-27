package com.example.back_dgi.ws.converter;

import com.example.back_dgi.bean.RetardTva;
import com.example.back_dgi.ws.dto.RetardTvaDto;
import com.example.back_dgi.generateur.mapper.AutoMapper;
import org.springframework.stereotype.Component;

@Component
public class RetardTvaConverter  extends AutoMapper<RetardTva, RetardTvaDto> {
    public RetardTvaConverter() {
        super(RetardTva.class, RetardTvaDto.class);
    }
}
