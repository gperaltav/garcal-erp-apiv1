/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.model.compras;

import com.garcal.erp.model.ErrorEntity;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ComprobantesComprasDet {

    private Integer emp_id;
    private Integer ccc_id;
    private Integer pro_id;
    private Integer via_id;
    private Integer veh_id;
    private Integer tra_id;
    private String ccd_serie;
    private Double ccd_cantidad;
    private Double ccd_preciounitario;
    private Double ccd_subtotal;
    private String uni_unidad;
    private String ccd_usucreacion;

    private ErrorEntity errorEntity = null;

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public Integer getCcc_id() {
        return ccc_id;
    }

    public void setCcc_id(Integer ccc_id) {
        this.ccc_id = ccc_id;
    }

    public Integer getPro_id() {
        return pro_id;
    }

    public void setPro_id(Integer pro_id) {
        this.pro_id = pro_id == 0 ? null : pro_id;
    }

    public Integer getVia_id() {
        return via_id;
    }

    public void setVia_id(Integer via_id) {
        this.via_id = via_id == 0 ? null : via_id;
    }

    public Integer getVeh_id() {
        return veh_id;
    }

    public void setVeh_id(Integer veh_id) {
        this.veh_id = veh_id == 0 ? null : veh_id;
    }

    public Integer getTra_id() {
        return tra_id;
    }

    public void setTra_id(Integer tra_id) {
        this.tra_id =tra_id == 0 ? null :tra_id;
    }

    public String getCcd_serie() {
        return ccd_serie;
    }

    public void setCcd_serie(String ccd_serie) {
        this.ccd_serie = ccd_serie;
    }

    public Double getCcd_cantidad() {
        return ccd_cantidad;
    }

    public void setCcd_cantidad(Double ccd_cantidad) {
        this.ccd_cantidad = ccd_cantidad;
    }

    public Double getCcd_preciounitario() {
        return ccd_preciounitario;
    }

    public void setCcd_preciounitario(Double ccd_preciounitario) {
        this.ccd_preciounitario = ccd_preciounitario;
    }

    public Double getCcd_subtotal() {
        return ccd_subtotal;
    }

    public void setCcd_subtotal(Double ccd_subtotal) {
        this.ccd_subtotal = ccd_subtotal;
    }

    public String getUni_unidad() {
        return uni_unidad;
    }

    public void setUni_unidad(String uni_unidad) {
        this.uni_unidad = uni_unidad;
    }

    public String getCcd_usucreacion() {
        return ccd_usucreacion;
    }

    public void setCcd_usucreacion(String ccd_usucreacion) {
        this.ccd_usucreacion = ccd_usucreacion;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }

}
