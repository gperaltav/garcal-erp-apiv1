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
public class Productos {

    private Integer pro_id;
    private Integer emp_id;
    private String pro_nombre;

    private String pro_codigo;
    private String pro_descripcion;
    private String uni_codigomenor;
    private String mod_codigo;

    private Double pro_preciominimo;
    private Double pro_precioventa;
    private Double pro_preciocompra;
    private String pro_codsunat;

    private String pro_tipouso;
    private String pro_usucreacion;
    private String pro_usumodificacion;
    private String pxt_descripcion;

    private ErrorEntity errorEntity = null;

    public Integer getPro_id() {
        return pro_id;
    }

    public void setPro_id(Integer pro_id) {
        this.pro_id = pro_id;
    }

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getPro_nombre() {
        return pro_nombre;
    }

    public void setPro_nombre(String pro_nombre) {
        this.pro_nombre = pro_nombre;
    }

    public String getPro_codigo() {
        return pro_codigo;
    }

    public void setPro_codigo(String pro_codigo) {
        this.pro_codigo = pro_codigo;
    }

    public String getPro_descripcion() {
        return pro_descripcion;
    }

    public void setPro_descripcion(String pro_descripcion) {
        this.pro_descripcion = pro_descripcion;
    }

    public String getUni_codigomenor() {
        return uni_codigomenor;
    }

    public void setUni_codigomenor(String uni_codigomenor) {
        this.uni_codigomenor = uni_codigomenor;
    }

    public String getMod_codigo() {
        return mod_codigo;
    }

    public void setMod_codigo(String mod_codigo) {
        this.mod_codigo = mod_codigo;
    }

    public Double getPro_preciominimo() {
        return pro_preciominimo;
    }

    public void setPro_preciominimo(Double pro_preciominimo) {
        this.pro_preciominimo = pro_preciominimo;
    }

    public Double getPro_precioventa() {
        return pro_precioventa;
    }

    public void setPro_precioventa(Double pro_precioventa) {
        this.pro_precioventa = pro_precioventa;
    }

    public Double getPro_preciocompra() {
        return pro_preciocompra;
    }

    public void setPro_preciocompra(Double pro_preciocompra) {
        this.pro_preciocompra = pro_preciocompra;
    }

    public String getPro_codsunat() {
        return pro_codsunat;
    }

    public void setPro_codsunat(String pro_codsunat) {
        this.pro_codsunat = pro_codsunat;
    }

    public String getPro_usucreacion() {
        return pro_usucreacion;
    }

    public void setPro_usucreacion(String pro_usucreacion) {
        this.pro_usucreacion = pro_usucreacion;
    }

    public String getPro_usumodificacion() {
        return pro_usumodificacion;
    }

    public void setPro_usumodificacion(String pro_usumodificacion) {
        this.pro_usumodificacion = pro_usumodificacion;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }

    public String getPro_tipouso() {
        return pro_tipouso;
    }

    public void setPro_tipouso(String pro_tipouso) {
        this.pro_tipouso = pro_tipouso;
    }

    public String getPxt_descripcion() {
        return pxt_descripcion;
    }

    public void setPxt_descripcion(String pxt_descripcion) {
        this.pxt_descripcion = pxt_descripcion;
    }

}
