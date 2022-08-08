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
public class Puestos {

    private Integer emp_id;

    private Integer pue_id;
    private String pue_nombre;

    private ErrorEntity errorEntity = null;

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public Integer getPue_id() {
        return pue_id;
    }

    public void setPue_id(Integer pue_id) {
        this.pue_id = pue_id;
    }

    public String getPue_nombre() {
        return pue_nombre;
    }

    public void setPue_nombre(String pue_nombre) {
        this.pue_nombre = pue_nombre;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }

}
