/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.model.mantenimiento;

import com.garcal.erp.model.ErrorEntity;
import java.sql.Date;

/**
 *
 * @author Teresa
 */
public class ProgramacionMantenimiento {
    
    private Integer pma_id;
    private Integer emp_id;
    private Integer veh_id;
    private Double pma_avisokm;
    private Double pma_km;
    private Date pma_fechamantenimiento;
    private Double pma_ultimokm;
    private String pma_usucreacion;
    
    private ErrorEntity errorEntity = null;

    public Integer getPma_id() {
        return pma_id;
    }

    public void setPma_id(Integer pma_id) {
        this.pma_id = pma_id;
    }

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public Integer getVeh_id() {
        return veh_id;
    }

    public void setVeh_id(Integer veh_id) {
        this.veh_id = veh_id;
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

    public Date getPma_fechamantenimiento() {
        return pma_fechamantenimiento;
    }

    public void setPma_fechamantenimiento(Date pma_fechamantenimiento) {
        this.pma_fechamantenimiento = pma_fechamantenimiento;
    }

    public Double getPma_ultimokm() {
        return pma_ultimokm;
    }

    public void setPma_ultimokm(Double pma_ultimokm) {
        this.pma_ultimokm = pma_ultimokm;
    }

    public String getPma_usucreacion() {
        return pma_usucreacion;
    }

    public void setPma_usucreacion(String pma_usucreacion) {
        this.pma_usucreacion = pma_usucreacion;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }
    
    
}
