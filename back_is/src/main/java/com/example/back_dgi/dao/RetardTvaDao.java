package com.example.back_dgi.dao;

import com.example.back_dgi.bean.RetardTva;
import com.example.back_dgi.bean.Societe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface RetardTvaDao extends JpaRepository<RetardTva,Long>  {
    RetardTva findByMontantretard(BigDecimal montantretard);
}
