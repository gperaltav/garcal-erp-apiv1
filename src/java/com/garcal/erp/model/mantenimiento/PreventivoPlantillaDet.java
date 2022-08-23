/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.model.mantenimiento;

import com.garcal.erp.model.ErrorEntity;


/**
 *
 * @author Teresa
 */
public class PreventivoPlantillaDet {
    
    private Integer tar_id;
    private Double ppa_avisokm;
    private Double ppa_km;
  
    private ErrorEntity errorEntity = null;
   

    public Integer getTar_id() {
        return tar_id;
    }

    public void setTar_id(Integer tar_id) {
        this.tar_id = tar_id;
    }

    public Double getPpa_avisokm() {
        return ppa_avisokm;
    }

    public void setPpa_avisokm(Double ppa_avisokm) {
        this.ppa_avisokm = ppa_avisokm;
    }

    public Double getPpa_km() {
        return ppa_km;
    }

    public void setPpa_km(Double ppa_km) {
        this.ppa_km = ppa_km;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }

    
   
    
}
