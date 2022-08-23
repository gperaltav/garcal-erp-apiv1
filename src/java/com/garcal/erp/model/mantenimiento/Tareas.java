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
public class Tareas {
    
    private Integer emp_id;
    private String tar_codigo;
    private String tar_descripcion;
    private Boolean tar_activo;
    private String tar_usucreacion;
    private Integer tar_id;
    
    private ErrorEntity errorEntity = null;

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getTar_codigo() {
        return tar_codigo;
    }

    public void setTar_codigo(String tar_codigo) {
        this.tar_codigo = tar_codigo;
    }

    public String getTar_descripcion() {
        return tar_descripcion;
    }

    public void setTar_descripcion(String tar_descripcion) {
        this.tar_descripcion = tar_descripcion;
    }

    public Boolean getTar_activo() {
        return tar_activo;
    }

    public void setTar_activo(Boolean tar_activo) {
        this.tar_activo = tar_activo;
    }

    public String getTar_usucreacion() {
        return tar_usucreacion;
    }

    public void setTar_usucreacion(String tar_usucreacion) {
        this.tar_usucreacion = tar_usucreacion;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }

    public Integer getTar_id() {
        return tar_id;
    }

    public void setTar_id(Integer tar_id) {
        this.tar_id = tar_id;
    }
    
    
}
