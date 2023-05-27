package com.example.back_dgi.ws.dto;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class RetardTvaDto {
    public long id;
    public BigDecimal montantretard;
}
