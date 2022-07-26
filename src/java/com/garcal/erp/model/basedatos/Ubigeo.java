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
public class Ubigeo {

    private String ubi_codigo;
    private String ubi_nombre;
    private String ubi_nombrecompleto;
    private String ubi_departamento;
    private String ubi_provincia;
    private String ubi_distrito;
    private String ubi_departamentonombre;
    private String ubi_provincianombre;
    private String ubi_usucreacion;

    private ErrorEntity errorEntity = null;

    public String getUbi_codigo() {
        return ubi_codigo;
    }

    public void setUbi_codigo(String ubi_codigo) {
        this.ubi_codigo = ubi_codigo;
    }

    public String getUbi_nombre() {
        return ubi_nombre;
    }

    public void setUbi_nombre(String ubi_nombre) {
        this.ubi_nombre = ubi_nombre;
    }

    public String getUbi_nombrecompleto() {
        return ubi_nombrecompleto;
    }

    public void setUbi_nombrecompleto(String ubi_nombrecompleto) {
        this.ubi_nombrecompleto = ubi_nombrecompleto;
    }

    public String getUbi_departamento() {
        return ubi_departamento;
    }

    public void setUbi_departamento(String ubi_departamento) {
        this.ubi_departamento = ubi_departamento;
    }

    public String getUbi_provincia() {
        return ubi_provincia;
    }

    public void setUbi_provincia(String ubi_provincia) {
        this.ubi_provincia = ubi_provincia;
    }

    public String getUbi_distrito() {
        return ubi_distrito;
    }

    public void setUbi_distrito(String ubi_distrito) {
        this.ubi_distrito = ubi_distrito;
    }

    public String getUbi_departamentonombre() {
        return ubi_departamentonombre;
    }

    public void setUbi_departamentonombre(String ubi_departamentonombre) {
        this.ubi_departamentonombre = ubi_departamentonombre;
    }

    public String getUbi_provincianombre() {
        return ubi_provincianombre;
    }

    public void setUbi_provincianombre(String ubi_provincianombre) {
        this.ubi_provincianombre = ubi_provincianombre;
    }

    public String getUbi_usucreacion() {
        return ubi_usucreacion;
    }

    public void setUbi_usucreacion(String ubi_usucreacion) {
        this.ubi_usucreacion = ubi_usucreacion;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }

}
