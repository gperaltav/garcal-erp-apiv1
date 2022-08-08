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
public class VehiculosMarcas {

    private Integer vma_id;
    private String vma_nombre;
    private ErrorEntity errorEntity = null;

    public Integer getVma_id() {
        return vma_id;
    }

    public void setVma_id(Integer vma_id) {
        this.vma_id = vma_id;
    }

    public String getVma_nombre() {
        return vma_nombre;
    }

    public void setVma_nombre(String vma_nombre) {
        this.vma_nombre = vma_nombre;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }

}
