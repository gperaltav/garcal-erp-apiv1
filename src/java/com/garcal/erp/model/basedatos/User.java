/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.model.basedatos;

import com.garcal.erp.model.ErrorEntity;

/**
 *
 * @author Gloria Peralta <gloria.ypv@gmail.com>
 */
public class User {

    private String usu_codigo;
    private String usu_clave;
    private String usu_nombres;
    private String usu_apellidopaterno;
    private String usu_apellidomaterno;
    private String usu_nrodocumento;
    private String usu_telefono;
    private String usu_direccion;
    private String usu_usucreacion;
    private String uusmodifi;
    private Boolean usu_isexit;

    private ErrorEntity errorEntity = null;

    public String getUsu_codigo() {
        return usu_codigo;
    }

    public void setUsu_codigo(String usu_codigo) {
        this.usu_codigo = usu_codigo;
    }

    public String getUsu_clave() {
        return usu_clave;
    }

    public void setUsu_clave(String usu_clave) {
        this.usu_clave = usu_clave;
    }

    public String getUsu_nombres() {
        return usu_nombres;
    }

    public void setUsu_nombres(String usu_nombres) {
        this.usu_nombres = usu_nombres;
    }

    public String getUsu_apellidopaterno() {
        return usu_apellidopaterno;
    }

    public void setUsu_apellidopaterno(String usu_apellidopaterno) {
        this.usu_apellidopaterno = usu_apellidopaterno;
    }

    public String getUsu_apellidomaterno() {
        return usu_apellidomaterno;
    }

    public void setUsu_apellidomaterno(String usu_apellidomaterno) {
        this.usu_apellidomaterno = usu_apellidomaterno;
    }

    public String getUsu_nrodocumento() {
        return usu_nrodocumento;
    }

    public void setUsu_nrodocumento(String usu_nrodocumento) {
        this.usu_nrodocumento = usu_nrodocumento;
    }

    public String getUsu_telefono() {
        return usu_telefono;
    }

    public void setUsu_telefono(String usu_telefono) {
        this.usu_telefono = usu_telefono;
    }

    public String getUsu_direccion() {
        return usu_direccion;
    }

    public void setUsu_direccion(String usu_direccion) {
        this.usu_direccion = usu_direccion;
    }

    public String getUsu_usucreacion() {
        return usu_usucreacion;
    }

    public void setUsu_usucreacion(String usu_usucreacion) {
        this.usu_usucreacion = usu_usucreacion;
    }

    public String getUusmodifi() {
        return uusmodifi;
    }

    public void setUusmodifi(String uusmodifi) {
        this.uusmodifi = uusmodifi;
    }

    public Boolean getUsu_isexit() {
        return usu_isexit;
    }

    public void setUsu_isexit(Boolean usu_isexit) {
        this.usu_isexit = usu_isexit;
    }
    

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }
    
    

   

}
