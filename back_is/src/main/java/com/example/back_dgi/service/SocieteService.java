package com.example.back_dgi.service;

import com.example.back_dgi.bean.Societe;
import com.example.back_dgi.dao.SocieteDao;
import com.example.back_dgi.ws.converter.SocieteConverter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocieteService {

    public Societe findSocieteByLibelle(String libelle) {
        return this.societeDao.findByLibelle(libelle);
    }
    public void saveSociete(Societe societe) {
        Societe check=this.societeDao.findByLibelle(societe.getLibelle());
        if(check==null)
        {
            this.societeDao.save(societe);
        };
    }
    public List<Societe> getAllsociete() {
       return  this.societeDao.findAll();
    }

    private final SocieteDao societeDao;
    private final SocieteConverter societeConverter;

    public SocieteService(SocieteDao societeDao, SocieteConverter societeConverter) {
        this.societeDao = societeDao;
        this.societeConverter = societeConverter;
    }
}
