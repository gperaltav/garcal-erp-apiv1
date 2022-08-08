/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.model.basedatos;

import com.garcal.erp.model.ErrorEntity;

/**
 *
 * @author User
 */
public class FormasDeCobro {

    private Integer emp_id;
    private String fdc_codigo;
    private String mon_codigo;
    private String fdc_descripcion;

    private ErrorEntity errorEntity = null;

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getFdc_codigo() {
        return fdc_codigo;
    }

    public void setFdc_codigo(String fdc_codigo) {
        this.fdc_codigo = fdc_codigo;
    }

    public String getMon_codigo() {
        return mon_codigo;
    }

    public void setMon_codigo(String mon_codigo) {
        this.mon_codigo = mon_codigo;
    }

    public String getFdc_descripcion() {
        return fdc_descripcion;
    }

    public void setFdc_descripcion(String fdc_descripcion) {
        this.fdc_descripcion = fdc_descripcion;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }

}
