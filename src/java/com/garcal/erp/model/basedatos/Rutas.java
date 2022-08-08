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
public class Rutas {

    private Integer rut_id;
    private String rut_nombre;
    private Integer nod_idorigen;
    private Integer nod_iddestino;
    private String rut_usucreacion;
    private String rut_usumodificacion;
    private Integer emp_id;

    private ErrorEntity errorEntity = null;

    public Integer getRut_id() {
        return rut_id;
    }

    public void setRut_id(Integer rut_id) {
        this.rut_id = rut_id;
    }

    public String getRut_nombre() {
        return rut_nombre;
    }

    public void setRut_nombre(String rut_nombre) {
        this.rut_nombre = rut_nombre;
    }

    public Integer getNod_idorigen() {
        return nod_idorigen;
    }

    public void setNod_idorigen(Integer nod_idorigen) {
        this.nod_idorigen = nod_idorigen;
    }

    public Integer getNod_iddestino() {
        return nod_iddestino;
    }

    public void setNod_iddestino(Integer nod_iddestino) {
        this.nod_iddestino = nod_iddestino;
    }

    public String getRut_usucreacion() {
        return rut_usucreacion;
    }

    public void setRut_usucreacion(String rut_usucreacion) {
        this.rut_usucreacion = rut_usucreacion;
    }

    public String getRut_usumodificacion() {
        return rut_usumodificacion;
    }

    public void setRut_usumodificacion(String rut_usumodificacion) {
        this.rut_usumodificacion = rut_usumodificacion;
    }

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }

}
