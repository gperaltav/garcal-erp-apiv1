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
public class PreventivoPlantilla {
    
    private Integer ppa_id;
    private Integer emp_id;
    private Integer tar_id;
    private Integer vma_id;
    private Double ppa_avisokm;
    private Double ppa_km;
    private String ppa_usucreacion;
    private ErrorEntity errorEntity = null;

    public Integer getPpa_id() {
        return ppa_id;
    }

    public void setPpa_id(Integer ppa_id) {
        this.ppa_id = ppa_id;
    }

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public Integer getTar_id() {
        return tar_id;
    }

    public void setTar_id(Integer tar_id) {
        this.tar_id = tar_id;
    }

    public Integer getVma_id() {
        return vma_id;
    }

    public void setVma_id(Integer vma_id) {
        this.vma_id = vma_id;
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

    public String getPpa_usucreacion() {
        return ppa_usucreacion;
    }

    public void setPpa_usucreacion(String ppa_usucreacion) {
        this.ppa_usucreacion = ppa_usucreacion;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }
    
    
}
