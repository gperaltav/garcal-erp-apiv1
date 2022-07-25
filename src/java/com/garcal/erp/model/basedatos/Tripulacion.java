/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.model.basedatos;

import com.garcal.erp.model.ErrorEntity;
import java.sql.Date;

/**
 *
 * @author User
 */
public class Tripulacion {

    private Integer tri_id;
    private Integer tra_id;

    private String tri_licenciacategoria;
    private String tri_licencianro;
    private String tri_especialidad;
    private String tri_usucreacion;
    private String tri_usumodificacion;
    private String tri_licenciafechavencimiento;
    private Boolean tri_inscritossunatiqbf;

    private ErrorEntity errorEntity = null;

    public Integer getTri_id() {
        return tri_id;
    }

    public void setTri_id(Integer tri_id) {
        this.tri_id = tri_id;
    }

    public Integer getTra_id() {
        return tra_id;
    }

    public void setTra_id(Integer tra_id) {
        this.tra_id = tra_id;
    }

    public String getTri_licenciacategoria() {
        return tri_licenciacategoria;
    }

    public void setTri_licenciacategoria(String tri_licenciacategoria) {
        this.tri_licenciacategoria = tri_licenciacategoria;
    }

    public String getTri_licencianro() {
        return tri_licencianro;
    }

    public void setTri_licencianro(String tri_licencianro) {
        this.tri_licencianro = tri_licencianro;
    }

    public String getTri_especialidad() {
        return tri_especialidad;
    }

    public void setTri_especialidad(String tri_especialidad) {
        this.tri_especialidad = tri_especialidad;
    }

    public String getTri_usucreacion() {
        return tri_usucreacion;
    }

    public void setTri_usucreacion(String tri_usucreacion) {
        this.tri_usucreacion = tri_usucreacion;
    }

    public String getTri_usumodificacion() {
        return tri_usumodificacion;
    }

    public void setTri_usumodificacion(String tri_usumodificacion) {
        this.tri_usumodificacion = tri_usumodificacion;
    }

    public String getTri_licenciafechavencimiento() {
        return tri_licenciafechavencimiento;
    }

    public void setTri_licenciafechavencimiento(String tri_licenciafechavencimiento) {
        this.tri_licenciafechavencimiento = tri_licenciafechavencimiento;
    }

    public Boolean getTri_inscritossunatiqbf() {
        return tri_inscritossunatiqbf;
    }

    public void setTri_inscritossunatiqbf(Boolean tri_inscritossunatiqbf) {
        this.tri_inscritossunatiqbf = tri_inscritossunatiqbf;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }

}
