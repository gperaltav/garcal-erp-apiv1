/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.model.ventas;

import com.garcal.erp.model.ErrorEntity;

/**
 *
 * @author User
 */
public class ComprobantesVentasEstados {

    private Integer emp_id;
    private String cve_codigo;
    private String cve_descripcion;
    private String cve_usucreacion;

    private ErrorEntity errorEntity = null;

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getCve_codigo() {
        return cve_codigo;
    }

    public void setCve_codigo(String cve_codigo) {
        this.cve_codigo = cve_codigo;
    }

    public String getCve_descripcion() {
        return cve_descripcion;
    }

    public void setCve_descripcion(String cve_descripcion) {
        this.cve_descripcion = cve_descripcion;
    }

    public String getCve_usucreacion() {
        return cve_usucreacion;
    }

    public void setCve_usucreacion(String cve_usucreacion) {
        this.cve_usucreacion = cve_usucreacion;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }

}
