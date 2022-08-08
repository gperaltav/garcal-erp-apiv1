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
public class Especialidad {

    private Integer emp_id;

    private Integer tes_id;
    private String tes_nombre;

    private ErrorEntity errorEntity = null;

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public Integer getTes_id() {
        return tes_id;
    }

    public void setTes_id(Integer tes_id) {
        this.tes_id = tes_id;
    }

    public String getTes_nombre() {
        return tes_nombre;
    }

    public void setTes_nombre(String tes_nombre) {
        this.tes_nombre = tes_nombre;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }

}
