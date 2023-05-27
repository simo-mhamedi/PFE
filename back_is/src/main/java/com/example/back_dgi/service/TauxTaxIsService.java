package com.example.back_dgi.service;

import com.example.back_dgi.bean.RetardTva;
import com.example.back_dgi.bean.TauxTaxIs;
import com.example.back_dgi.dao.RetardTvaDao;
import com.example.back_dgi.dao.TauxTaxIsDao;
import com.example.back_dgi.ws.converter.RetardTvaConverter;
import com.example.back_dgi.ws.converter.TauxTaxIsConverter;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public class TauxTaxIsService {
    public TauxTaxIs findTauxTaxIsByMtretard(BigDecimal montantretard) {
        return this.tauxTaxIsDao.findByMtRetard(montantretard);
    }
    public void saveTauxTaxIs(TauxTaxIs tauxTaxIs) {
        TauxTaxIs check=this.tauxTaxIsDao.findByMtRetard(tauxTaxIs.getMtRetard());
        if(check==null)
        {
            this.tauxTaxIsDao.save(tauxTaxIs);
        };
    }
    public List<TauxTaxIs> getAllTauxTaxIs() {
        return  this.tauxTaxIsDao.findAll();
    }
    private final TauxTaxIsDao tauxTaxIsDao;
    private final TauxTaxIsConverter tauxTaxIsConverter;

    public TauxTaxIsService(TauxTaxIsDao tauxTaxIsDao, TauxTaxIsConverter tauxTaxIsConverter) {
        this.tauxTaxIsDao = tauxTaxIsDao;
        this.tauxTaxIsConverter = tauxTaxIsConverter;
    }
}
