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
public class VehiculosModelos {

    private Integer vmo_id;
    private String vmo_nombre;
    private ErrorEntity errorEntity = null;

    public Integer getVmo_id() {
        return vmo_id;
    }

    public void setVmo_id(Integer vmo_id) {
        this.vmo_id = vmo_id;
    }

    public String getVmo_nombre() {
        return vmo_nombre;
    }

    public void setVmo_nombre(String vmo_nombre) {
        this.vmo_nombre = vmo_nombre;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }

}
