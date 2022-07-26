/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.model.planificacionviajes;

import com.garcal.erp.model.ErrorEntity;

/**
 *
 * @author User
 */
public class ViajesEstados {

    private String vie_codigo;
    private String vie_nombre;
    private String vie_usucreacion;
    private ErrorEntity errorEntity = null;

    public String getVie_codigo() {
        return vie_codigo;
    }

    public void setVie_codigo(String vie_codigo) {
        this.vie_codigo = vie_codigo;
    }

    public String getVie_nombre() {
        return vie_nombre;
    }

    public void setVie_nombre(String vie_nombre) {
        this.vie_nombre = vie_nombre;
    }

    public String getVie_usucreacion() {
        return vie_usucreacion;
    }

    public void setVie_usucreacion(String vie_usucreacion) {
        this.vie_usucreacion = vie_usucreacion;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }

}
