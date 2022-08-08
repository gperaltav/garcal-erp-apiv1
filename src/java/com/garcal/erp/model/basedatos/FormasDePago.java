/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.model.basedatos;

import com.garcal.erp.model.ErrorEntity;

/**
 *
 * @author User
 */
public class FormasDePago {

    private Integer emp_id;
    private String fdp_id;
    private String mon_id;
    private String fdp_descripcion;
    private Integer fpd_diasvencimentos;
    private String fdp_usucreacion;

    private ErrorEntity errorEntity = null;

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getFdp_id() {
        return fdp_id;
    }

    public void setFdp_id(String fdp_id) {
        this.fdp_id = fdp_id;
    }

    public String getMon_id() {
        return mon_id;
    }

    public void setMon_id(String mon_id) {
        this.mon_id = mon_id;
    }

    public String getFdp_descripcion() {
        return fdp_descripcion;
    }

    public void setFdp_descripcion(String fdp_descripcion) {
        this.fdp_descripcion = fdp_descripcion;
    }

    public Integer getFpd_diasvencimentos() {
        return fpd_diasvencimentos;
    }

    public void setFpd_diasvencimentos(Integer fpd_diasvencimentos) {
        this.fpd_diasvencimentos = fpd_diasvencimentos;
    }

    public String getFdp_usucreacion() {
        return fdp_usucreacion;
    }

    public void setFdp_usucreacion(String fdp_usucreacion) {
        this.fdp_usucreacion = fdp_usucreacion;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }

}
