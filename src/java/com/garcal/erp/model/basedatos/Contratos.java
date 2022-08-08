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
public class Contratos {

    private Integer emp_id;

    private String tco_id;
    private String tco_nombre;

    private ErrorEntity errorEntity = null;

    public String getTco_id() {
        return tco_id;
    }

    public void setTco_id(String tco_id) {
        this.tco_id = tco_id;
    }

    public String getTco_nombre() {
        return tco_nombre;
    }

    public void setTco_nombre(String tco_nombre) {
        this.tco_nombre = tco_nombre;
    }

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }

}
