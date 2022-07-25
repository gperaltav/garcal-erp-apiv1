/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.model.compras;

import com.garcal.erp.model.ErrorEntity;

/**
 *
 * @author User
 */
public class ComprobantesComprasTipos {
    
    private Integer emp_id;
    private String cct_codigo;
    private String cct_descripcion;
    private String cct_codigosunat;
    private String cct_usucreacion;      
    
    private ErrorEntity errorEntity = null;

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getCct_codigo() {
        return cct_codigo;
    }

    public void setCct_codigo(String cct_codigo) {
        this.cct_codigo = cct_codigo;
    }

    public String getCct_descripcion() {
        return cct_descripcion;
    }

    public void setCct_descripcion(String cct_descripcion) {
        this.cct_descripcion = cct_descripcion;
    }

    public String getCct_codigosunat() {
        return cct_codigosunat;
    }

    public void setCct_codigosunat(String cct_codigosunat) {
        this.cct_codigosunat = cct_codigosunat;
    }

    public String getCct_usucreacion() {
        return cct_usucreacion;
    }

    public void setCct_usucreacion(String cct_usucreacion) {
        this.cct_usucreacion = cct_usucreacion;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }
}
