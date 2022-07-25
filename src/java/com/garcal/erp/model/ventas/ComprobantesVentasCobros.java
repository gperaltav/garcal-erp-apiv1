/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.model.ventas;

import com.garcal.erp.model.ErrorEntity;
import java.sql.Date;

/**
 *
 * @author User
 */
public class ComprobantesVentasCobros {
    
    private Integer emp_id;
    private Integer cvc_id;
    private String fdc_codigo;
    private Double vec_monto;
    private String vec_nroreferencia;
    private String vec_fechacancelacion;
    private String vec_descripcion;
    private String mon_codigo;
    private String vec_usucreacion;
    private String vec_feccreacion;
    
    private ErrorEntity errorEntity = null;

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public Integer getCvc_id() {
        return cvc_id;
    }

    public void setCvc_id(Integer cvc_id) {
        this.cvc_id = cvc_id;
    }

    public String getFdc_codigo() {
        return fdc_codigo;
    }

    public void setFdc_codigo(String fdc_codigo) {
        this.fdc_codigo = fdc_codigo;
    }

    public Double getVec_monto() {
        return vec_monto;
    }

    public void setVec_monto(Double vec_monto) {
        this.vec_monto = vec_monto;
    }

    public String getVec_nroreferencia() {
        return vec_nroreferencia;
    }

    public void setVec_nroreferencia(String vec_nroreferencia) {
        this.vec_nroreferencia = vec_nroreferencia;
    }

    public String getVec_fechacancelacion() {
        return vec_fechacancelacion;
    }

    public void setVec_fechacancelacion(String vec_fechacancelacion) {
        this.vec_fechacancelacion = vec_fechacancelacion;
    }

    public String getVec_descripcion() {
        return vec_descripcion;
    }

    public void setVec_descripcion(String vec_descripcion) {
        this.vec_descripcion = vec_descripcion;
    }

    public String getMon_codigo() {
        return mon_codigo;
    }

    public void setMon_codigo(String mon_codigo) {
        this.mon_codigo = mon_codigo;
    }

    public String getVec_usucreacion() {
        return vec_usucreacion;
    }

    public void setVec_usucreacion(String vec_usucreacion) {
        this.vec_usucreacion = vec_usucreacion;
    }

    public String getVec_feccreacion() {
        return vec_feccreacion;
    }

    public void setVec_feccreacion(String vec_feccreacion) {
        this.vec_feccreacion = vec_feccreacion;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }
    
    
    
}
