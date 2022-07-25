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
public class VehiculosClases {

    private String vcl_id;
    private String vcl_nombre;

    private ErrorEntity errorEntity = null;

    public String getVcl_id() {
        return vcl_id;
    }

    public void setVcl_id(String vcl_id) {
        this.vcl_id = vcl_id;
    }

    public String getVcl_nombre() {
        return vcl_nombre;
    }

    public void setVcl_nombre(String vcl_nombre) {
        this.vcl_nombre = vcl_nombre;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }

}
