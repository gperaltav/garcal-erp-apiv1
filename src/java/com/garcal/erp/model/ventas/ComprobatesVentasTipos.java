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
public class ComprobatesVentasTipos {
    
      private Integer emp_id;
      private String cvt_codigo;
      private String cvt_descripcion;
      private Integer cvt_maxitems;
      private String cvt_codigosunat;//char
      private String cvt_usucreacion;
      
      private ErrorEntity errorEntity = null;

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }
    public String getCvt_codigo() {
        return cvt_codigo;
    }

    public void setCvt_codigo(String cvt_codigo) {
        this.cvt_codigo = cvt_codigo;
    }

    public String getCvt_descripcion() {
        return cvt_descripcion;
    }

    public void setCvt_descripcion(String cvt_descripcion) {
        this.cvt_descripcion = cvt_descripcion;
    }

    public Integer getCvt_maxitems() {
        return cvt_maxitems;
    }

    public void setCvt_maxitems(Integer cvt_maxitems) {
        this.cvt_maxitems = cvt_maxitems;
    }

    public String getCvt_codigosunat() {
        return cvt_codigosunat;
    }

    public void setCvt_codigosunat(String cvt_codigosunat) {
        this.cvt_codigosunat = cvt_codigosunat;
    }

    public String getCvt_usucreacion() {
        return cvt_usucreacion;
    }

    public void setCvt_usucreacion(String cvt_usucreacion) {
        this.cvt_usucreacion = cvt_usucreacion;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }
      
      
    
    
    
}
