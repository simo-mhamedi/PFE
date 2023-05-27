package com.example.back_dgi.ws.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class TauxTaxIsDto {
    public long id;
    public BigDecimal mtRetard;
    public BigDecimal cotisationMinimal;

}
