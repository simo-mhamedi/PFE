package com.example.back_dgi.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
public class Societe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public BigDecimal ice;
    public String libelle;
}
