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
public class Flete {

    private String vfl_codigo;
    private String vfl_nombre;
    private ErrorEntity errorEntity = null;

    public String getVfl_codigo() {
        return vfl_codigo;
    }

    public void setVfl_codigo(String vfl_codigo) {
        this.vfl_codigo = vfl_codigo;
    }

    public String getVfl_nombre() {
        return vfl_nombre;
    }

    public void setVfl_nombre(String vfl_nombre) {
        this.vfl_nombre = vfl_nombre;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }

}
