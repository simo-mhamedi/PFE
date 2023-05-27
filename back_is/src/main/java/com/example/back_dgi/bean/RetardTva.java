package com.example.back_dgi.bean;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
public class RetardTva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public BigDecimal montantretard;
}
