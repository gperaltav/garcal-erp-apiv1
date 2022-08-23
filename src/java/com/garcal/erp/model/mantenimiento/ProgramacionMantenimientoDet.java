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
public class ProgramacionMantenimientoDet {
    
   
    private Integer tar_id;
    private Double pma_avisokm;
    private Double pma_km;
   
    
    private ErrorEntity errorEntity = null;
    
  

    public Integer getTar_id() {
        return tar_id;
    }

    public void setTar_id(Integer tar_id) {
        this.tar_id = tar_id;
    }

    public Double getPma_avisokm() {
        return pma_avisokm;
    }

    public void setPma_avisokm(Double pma_avisokm) {
        this.pma_avisokm = pma_avisokm;
    }

    public Double getPma_km() {
        return pma_km;
    }

    public void setPma_km(Double pma_km) {
        this.pma_km = pma_km;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }
    
    

   
    
}
