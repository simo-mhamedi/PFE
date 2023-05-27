package com.example.back_dgi.dao;

import com.example.back_dgi.bean.Societe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  SocieteDao extends JpaRepository<Societe,Long> {
    Societe findByLibelle(String libelle);
}
