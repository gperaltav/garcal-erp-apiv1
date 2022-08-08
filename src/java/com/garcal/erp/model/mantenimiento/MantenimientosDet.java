/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.model.mantenimiento;

import com.garcal.erp.model.ErrorEntity;

/**
 *
 * @author Teresa
 */
public class MantenimientosDet {
    
    private Integer mad_id;
    private Integer man_id;
    private Integer emp_id;
    private Integer tar_id;
    private String mad_descripcion;
    private String mad_observacion;
    private String mad_estado;
    private String mad_usucreacion;
    
    private ErrorEntity errorEntity = null;

    public Integer getMan_id() {
        return man_id;
    }

    public void setMan_id(Integer man_id) {
        this.man_id = man_id;
    }

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public Integer getTar_id() {
        return tar_id;
    }

    public void setTar_id(Integer tar_id) {
        this.tar_id = tar_id;
    }

    public String getMad_descripcion() {
        return mad_descripcion;
    }

    public void setMad_descripcion(String mad_descripcion) {
        this.mad_descripcion = mad_descripcion;
    }

    public String getMad_observacion() {
        return mad_observacion;
    }

    public void setMad_observacion(String mad_observacion) {
        this.mad_observacion = mad_observacion;
    }

    public String getMad_estado() {
        return mad_estado;
    }

    public void setMad_estado(String mad_estado) {
        this.mad_estado = mad_estado;
    }

    public String getMad_usucreacion() {
        return mad_usucreacion;
    }

    public void setMad_usucreacion(String mad_usucreacion) {
        this.mad_usucreacion = mad_usucreacion;
    }

    public Integer getMad_id() {
        return mad_id;
    }

    public void setMad_id(Integer mad_id) {
        this.mad_id = mad_id;
    }
    

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }
    
    
    
}
