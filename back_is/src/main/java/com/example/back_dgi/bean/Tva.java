package com.example.back_dgi.bean;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
public class Tva {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Societe societe;
    private BigDecimal totalTvaDv;
    private BigDecimal totalTvaCollecte;
    private BigDecimal totalTvaCalcule;
    @ManyToOne
    private RetardTva TvaRet;
    private BigDecimal montantRetard;
    private BigDecimal tauxRetardTvaRef;
    private int annee;
    private int trimestre;
}