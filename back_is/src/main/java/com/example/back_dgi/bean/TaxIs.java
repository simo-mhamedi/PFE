package com.example.back_dgi.bean;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
public class TaxIs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @ManyToOne
    private Societe societe;
    private BigDecimal TotaleCharge;
    private BigDecimal beneficierAvantImpot;
    private  BigDecimal mtImpot;
    @ManyToOne
    private TauxTaxIs tauxTaxIs;
    private BigDecimal beneficierApreImpot;
    private BigDecimal TotaleProduit;
    private int annee;
    private int trimestre;
}
