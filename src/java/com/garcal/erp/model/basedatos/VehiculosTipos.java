/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.model.basedatos;

import com.garcal.erp.model.ErrorEntity;

/**
 *
 * @author Gloria Peralta <gloria.ypv@gmail.com>
 */
public class VehiculosTipos {

    private String vti_id;
    private String vti_nombre;
    private ErrorEntity errorEntity = null;

    public String getVti_id() {
        return vti_id;
    }

    public void setVti_id(String vti_id) {
        this.vti_id = vti_id;
    }

    public String getVti_nombre() {
        return vti_nombre;
    }

    public void setVti_nombre(String vti_nombre) {
        this.vti_nombre = vti_nombre;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }

}
