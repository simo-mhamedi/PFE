package com.example.back_dgi.ws.converter;

import com.example.back_dgi.bean.Societe;
import com.example.back_dgi.ws.dto.SocieteDto;
import com.example.back_dgi.generateur.mapper.AutoMapper;
import org.springframework.stereotype.Component;

@Component
public class SocieteConverter extends AutoMapper<Societe, SocieteDto> {
    public SocieteConverter() {
        super(Societe.class, SocieteDto.class);
    }
}
