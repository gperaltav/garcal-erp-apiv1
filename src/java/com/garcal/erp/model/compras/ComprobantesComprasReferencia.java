/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.model.compras;

import com.garcal.erp.model.ErrorEntity;

/**
 *
 * @author usuario
 */
public class ComprobantesComprasReferencia {

    private Integer emp_id;
    private String ccr_codigo;
    private String ccr_descripcion;
    private String ccr_usucreacion;

    private ErrorEntity errorEntity = null;

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getCcr_codigo() {
        return ccr_codigo;
    }

    public void setCcr_codigo(String ccr_codigo) {
        this.ccr_codigo = ccr_codigo;
    }

    public String getCcr_descripcion() {
        return ccr_descripcion;
    }

    public void setCcr_descripcion(String ccr_descripcion) {
        this.ccr_descripcion = ccr_descripcion;
    }

    public String getCcr_usucreacion() {
        return ccr_usucreacion;
    }

    public void setCcr_usucreacion(String ccr_usucreacion) {
        this.ccr_usucreacion = ccr_usucreacion;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }

}
