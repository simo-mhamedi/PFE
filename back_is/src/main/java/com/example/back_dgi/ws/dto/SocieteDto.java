package com.example.back_dgi.ws.dto;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
public class SocieteDto {
    public long id;
    public BigDecimal ice;
    public String libelle;
}
