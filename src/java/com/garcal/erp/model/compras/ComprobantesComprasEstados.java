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
public class ComprobantesComprasEstados {
    
    private Integer emp_id;
    private String cce_codigo;
    private String cce_descripcion;
    private String cce_usucreacion;      
    
    private ErrorEntity errorEntity = null;

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getCce_codigo() {
        return cce_codigo;
    }

    public void setCce_codigo(String cce_codigo) {
        this.cce_codigo = cce_codigo;
    }

    public String getCce_descripcion() {
        return cce_descripcion;
    }

    public void setCce_descripcion(String cce_descripcion) {
        this.cce_descripcion = cce_descripcion;
    }

    public String getCce_usucreacion() {
        return cce_usucreacion;
    }

    public void setCce_usucreacion(String cce_usucreacion) {
        this.cce_usucreacion = cce_usucreacion;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }
    
    
    
}
