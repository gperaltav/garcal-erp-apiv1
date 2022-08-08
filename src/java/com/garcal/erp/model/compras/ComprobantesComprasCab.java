/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.model.compras;

import com.garcal.erp.model.ErrorEntity;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ComprobantesComprasCab {

    private Integer emp_id;
    private Integer ent_id;
    private String ccc_serie;
    private String ccc_numero;
    private String ccc_fechaemision;

    private Double ccc_subtotal;
    private Double ccc_impuesto;
    private Double ccc_total;

    private String cct_codigo;
    private String cce_codigo;
    private String mon_codigo;
    private String ccc_observaciones;

    private Integer ccc_idreferencia; // bigint
    private Double ccc_tipocambio;
    private Boolean ccc_generamovimiento;
    private String ccc_fechaingreso;
    private String ccc_periodoregistro;
    private String usu_codigo;
    private String ccc_usucreacion;

    private Integer pro_id;
    private Integer via_id;
    private Integer veh_id;
    private Integer tra_id;

    private String ccd_serie;
    private Double ccd_cantidad;
    private Double ccd_preciounitario;
    private Double ccd_subtotal;
    private String uni_unidad;
    private String ccr_codigo;

    private String ccc_serienumero;
    private String ccc_fechaemisioninicio;
    private String ccc_fechaemisionfin;

    private Integer ccc_id;
    private String emp_razonsocial;
    private String cct_descripcion;

    private String ent_nombre;
    private String cce_descripcion;
    private String ccr_descripcion;

    private String ccc_comprobantereferencia;

    private ArrayList<ComprobantesComprasDet> detalle;

    private ErrorEntity errorEntity = null;

    public ArrayList<ComprobantesComprasDet> getDetalle() {
        return detalle;
    }

    public void setDetalle(ArrayList<ComprobantesComprasDet> detalle) {
        this.detalle = detalle;
    }

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public Integer getEnt_id() {
        return ent_id;
    }

    public void setEnt_id(Integer ent_id) {
        this.ent_id = ent_id == 0 ? null : ent_id;
    }

    public String getCcc_serie() {
        return ccc_serie;
    }

    public void setCcc_serie(String ccc_serie) {
        this.ccc_serie = ccc_serie;
    }

    public String getCcc_numero() {
        return ccc_numero;
    }

    public void setCcc_numero(String ccc_numero) {
        this.ccc_numero = ccc_numero;
    }

    public String getCcc_fechaemision() {
        return ccc_fechaemision;
    }

    public void setCcc_fechaemision(String ccc_fechaemision) {
        this.ccc_fechaemision = ccc_fechaemision;
    }

    public Double getCcc_subtotal() {
        return ccc_subtotal;
    }

    public void setCcc_subtotal(Double ccc_subtotal) {
        this.ccc_subtotal = ccc_subtotal;
    }

    public Double getCcc_impuesto() {
        return ccc_impuesto;
    }

    public void setCcc_impuesto(Double ccc_impuesto) {
        this.ccc_impuesto = ccc_impuesto;
    }

    public Double getCcc_total() {
        return ccc_total;
    }

    public void setCcc_total(Double ccc_total) {
        this.ccc_total = ccc_total;
    }

    public String getCct_codigo() {
        return cct_codigo;
    }

    public void setCct_codigo(String cct_codigo) {
        this.cct_codigo = cct_codigo;
    }

    public String getCce_codigo() {
        return cce_codigo;
    }

    public void setCce_codigo(String cce_codigo) {
        this.cce_codigo = cce_codigo;
    }

    public String getMon_codigo() {
        return mon_codigo;
    }

    public void setMon_codigo(String mon_codigo) {
        this.mon_codigo = mon_codigo;
    }

    public String getCcc_observaciones() {
        return ccc_observaciones;
    }

    public void setCcc_observaciones(String ccc_observaciones) {
        this.ccc_observaciones = ccc_observaciones;
    }

    public Integer getCcc_idreferencia() {
        return ccc_idreferencia;
    }

    public void setCcc_idreferencia(Integer ccc_idreferencia) {

        if (ccc_idreferencia == 0) {
            ccc_idreferencia = null;
        }

        this.ccc_idreferencia = ccc_idreferencia;

    }

    public Double getCcc_tipocambio() {
        return ccc_tipocambio;
    }

    public void setCcc_tipocambio(Double ccc_tipocambio) {
        this.ccc_tipocambio = ccc_tipocambio;
    }

    public Boolean getCcc_generamovimiento() {
        return ccc_generamovimiento;
    }

    public void setCcc_generamovimiento(Boolean ccc_generamovimiento) {
        this.ccc_generamovimiento = ccc_generamovimiento;
    }

    public String getCcc_fechaingreso() {
        return ccc_fechaingreso;
    }

    public void setCcc_fechaingreso(String ccc_fechaingreso) {
        this.ccc_fechaingreso = ccc_fechaingreso;
    }

    public String getCcc_periodoregistro() {
        return ccc_periodoregistro;
    }

    public void setCcc_periodoregistro(String ccc_periodoregistro) {
        this.ccc_periodoregistro = ccc_periodoregistro;
    }

    public String getUsu_codigo() {
        return usu_codigo;
    }

    public void setUsu_codigo(String usu_codigo) {
        this.usu_codigo = usu_codigo;
    }

    public String getCcc_usucreacion() {
        return ccc_usucreacion;
    }

    public void setCcc_usucreacion(String ccc_usucreacion) {
        this.ccc_usucreacion = ccc_usucreacion;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }

    public Integer getPro_id() {
        return pro_id;
    }

    public void setPro_id(Integer pro_id) {
        this.pro_id = pro_id;
    }

    public Integer getVia_id() {
        return via_id;
    }

    public void setVia_id(Integer via_id) {
        this.via_id = via_id;
    }

    public Integer getVeh_id() {
        return veh_id;
    }

    public void setVeh_id(Integer veh_id) {
        this.veh_id = veh_id;
    }

    public Integer getTra_id() {
        return tra_id;
    }

    public void setTra_id(Integer tra_id) {
        this.tra_id = tra_id;
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

    public String getCcr_codigo() {
        return ccr_codigo;
    }

    public void setCcr_codigo(String ccr_codigo) {
        this.ccr_codigo = ccr_codigo;
    }

    public String getCcc_serienumero() {
        return ccc_serienumero;
    }

    public void setCcc_serienumero(String ccc_serienumero) {
        this.ccc_serienumero = ccc_serienumero;
    }

    public String getCcc_fechaemisioninicio() {
        return ccc_fechaemisioninicio;
    }

    public void setCcc_fechaemisioninicio(String ccc_fechaemisioninicio) {
        this.ccc_fechaemisioninicio = ccc_fechaemisioninicio;
    }

    public String getCcc_fechaemisionfin() {
        return ccc_fechaemisionfin;
    }

    public void setCcc_fechaemisionfin(String ccc_fechaemisionfin) {
        this.ccc_fechaemisionfin = ccc_fechaemisionfin;
    }

    public Integer getCcc_id() {
        return ccc_id;
    }

    public void setCcc_id(Integer ccc_id) {
        this.ccc_id = ccc_id;
    }

    public String getEmp_razonsocial() {
        return emp_razonsocial;
    }

    public void setEmp_razonsocial(String emp_razonsocial) {
        this.emp_razonsocial = emp_razonsocial;
    }

    public String getCct_descripcion() {
        return cct_descripcion;
    }

    public void setCct_descripcion(String cct_descripcion) {
        this.cct_descripcion = cct_descripcion;
    }

    public String getEnt_nombre() {
        return ent_nombre;
    }

    public void setEnt_nombre(String ent_nombre) {
        this.ent_nombre = ent_nombre;
    }

    public String getCce_descripcion() {
        return cce_descripcion;
    }

    public void setCce_descripcion(String cce_descripcion) {
        this.cce_descripcion = cce_descripcion;
    }

    public String getCcr_descripcion() {
        return ccr_descripcion;
    }

    public void setCcr_descripcion(String ccr_descripcion) {
        this.ccr_descripcion = ccr_descripcion;
    }

    public String getCcc_comprobantereferencia() {
        return ccc_comprobantereferencia;
    }

    public void setCcc_comprobantereferencia(String ccc_comprobantereferencia) {
        this.ccc_comprobantereferencia = ccc_comprobantereferencia;
    }

}
