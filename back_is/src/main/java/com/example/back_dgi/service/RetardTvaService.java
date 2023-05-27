package com.example.back_dgi.service;

import com.example.back_dgi.bean.RetardTva;
import com.example.back_dgi.bean.Societe;
import com.example.back_dgi.dao.RetardTvaDao;
import com.example.back_dgi.dao.SocieteDao;
import com.example.back_dgi.ws.converter.RetardTvaConverter;
import com.example.back_dgi.ws.converter.SocieteConverter;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class RetardTvaService {


    public RetardTva findRetardTvaByMontantretard(BigDecimal montantretard) {
        return this.retardTvaDao.findByMontantretard(montantretard);
    }
    public void saveRetardTva(RetardTva retardTva) {
        RetardTva check=this.retardTvaDao.findByMontantretard(retardTva.getMontantretard());
        if(check==null)
        {
            this.retardTvaDao.save(retardTva);
        };
    }
    public List<RetardTva> getAllRetardTva() {
        return  this.retardTvaDao.findAll();
    }
    private final RetardTvaDao retardTvaDao;
    private final RetardTvaConverter retardTvaConverter;
    public RetardTvaService(RetardTvaDao retardTvaDao, RetardTvaConverter retardTvaConverter) {
        this.retardTvaDao = retardTvaDao;
        this.retardTvaConverter = retardTvaConverter;
    }
}
