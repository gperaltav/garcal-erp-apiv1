/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.model.ventas;

import com.garcal.erp.model.ErrorEntity;
import java.sql.Date;

/**
 *
 * @author User
 */
public class ComprobantesVentasCab {

    private Integer emp_id;
    private Integer ent_id;
    private String cvc_serie;
    private String cvc_numero;

    private String cvc_fechaemision;
    private String cvc_fechavencimiento;

    private Double cvc_subtotal;
    private Double cvc_impuesto;
    private Double cvc_total;

    private String cvt_codigo;
    private String cve_codigo;
    private String mon_codigo;

    private Double cve_tipocambio;
    private Integer cvc_idreferencia;

    private String cvc_observaciones;
    private String cvc_observacionesopcional;

    private Integer gui_idremitente;
    private Integer gui_idtransportisa;
    private Integer via_id;

    private String usu_codigo;
    private String cvc_usucreacion;
    private String cvc_feccreacion;

    private String cvc_serienumero;
    private Date cvc_fechaemisioninicio;
    private Date cvc_fechaemisionfin;

    private Integer cvc_id;
    private String emp_razonsocial;
    private String cvt_descripcion;
    private String ent_nombre;

    private String cve_descripcion;
    private String cvc_comprobantereferencia;

    private String fdc_codigo;
    private String vec_nroreferencia;
    private Date vec_fechacancelacioninicio;
    private Date vec_fechacancelacionfin;
    private String via_descripcion;

    private ErrorEntity errorEntity = null;

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
        this.ent_id = ent_id;
    }

    public String getCvc_serie() {
        return cvc_serie;
    }

    public void setCvc_serie(String cvc_serie) {
        this.cvc_serie = cvc_serie;
    }

    public String getCvc_numero() {
        return cvc_numero;
    }

    public void setCvc_numero(String cvc_numero) {
        this.cvc_numero = cvc_numero;
    }

    public String getCvc_fechaemision() {
        return cvc_fechaemision;
    }

    public void setCvc_fechaemision(String cvc_fechaemision) {
        this.cvc_fechaemision = cvc_fechaemision;
    }

    public String getCvc_fechavencimiento() {
        return cvc_fechavencimiento;
    }

    public void setCvc_fechavencimiento(String cvc_fechavencimiento) {
        this.cvc_fechavencimiento = cvc_fechavencimiento;
    }

    public Double getCvc_subtotal() {
        return cvc_subtotal;
    }

    public void setCvc_subtotal(Double cvc_subtotal) {
        this.cvc_subtotal = cvc_subtotal;
    }

    public Double getCvc_impuesto() {
        return cvc_impuesto;
    }

    public void setCvc_impuesto(Double cvc_impuesto) {
        this.cvc_impuesto = cvc_impuesto;
    }

    public Double getCvc_total() {
        return cvc_total;
    }

    public void setCvc_total(Double cvc_total) {
        this.cvc_total = cvc_total;
    }

    public String getCvt_codigo() {
        return cvt_codigo;
    }

    public void setCvt_codigo(String cvt_codigo) {
        this.cvt_codigo = cvt_codigo;
    }

    public String getCve_codigo() {
        return cve_codigo;
    }

    public void setCve_codigo(String cve_codigo) {
        this.cve_codigo = cve_codigo;
    }

    public String getMon_codigo() {
        return mon_codigo;
    }

    public void setMon_codigo(String mon_codigo) {
        this.mon_codigo = mon_codigo;
    }

    public Double getCve_tipocambio() {
        return cve_tipocambio;
    }

    public void setCve_tipocambio(Double cve_tipocambio) {
        this.cve_tipocambio = cve_tipocambio;
    }

    public Integer getCvc_idreferencia() {
        return cvc_idreferencia;
    }

    public void setCvc_idreferencia(Integer cvc_idreferencia) {
        this.cvc_idreferencia = cvc_idreferencia;
    }

    public String getCvc_observaciones() {
        return cvc_observaciones;
    }

    public void setCvc_observaciones(String cvc_observaciones) {
        this.cvc_observaciones = cvc_observaciones;
    }

    public String getCvc_observacionesopcional() {
        return cvc_observacionesopcional;
    }

    public void setCvc_observacionesopcional(String cvc_observacionesopcional) {
        this.cvc_observacionesopcional = cvc_observacionesopcional;
    }

    public Integer getGui_idremitente() {
        return gui_idremitente;
    }

    public void setGui_idremitente(Integer gui_idremitente) {
        this.gui_idremitente = gui_idremitente;
    }

    public Integer getGui_idtransportisa() {
        return gui_idtransportisa;
    }

    public void setGui_idtransportisa(Integer gui_idtransportisa) {
        this.gui_idtransportisa = gui_idtransportisa;
    }

    public Integer getVia_id() {
        return via_id;
    }

    public void setVia_id(Integer via_id) {
        this.via_id = via_id;
    }

    public String getUsu_codigo() {
        return usu_codigo;
    }

    public void setUsu_codigo(String usu_codigo) {
        this.usu_codigo = usu_codigo;
    }

    public String getCvc_usucreacion() {
        return cvc_usucreacion;
    }

    public void setCvc_usucreacion(String cvc_usucreacion) {
        this.cvc_usucreacion = cvc_usucreacion;
    }

    public String getCvc_feccreacion() {
        return cvc_feccreacion;
    }

    public void setCvc_feccreacion(String cvc_feccreacion) {
        this.cvc_feccreacion = cvc_feccreacion;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }

    public String getCvc_serienumero() {
        return cvc_serienumero;
    }

    public void setCvc_serienumero(String cvc_serienumero) {
        this.cvc_serienumero = cvc_serienumero;
    }

    public Date getCvc_fechaemisioninicio() {
        return cvc_fechaemisioninicio;
    }

    public void setCvc_fechaemisioninicio(Date cvc_fechaemisioninicio) {
        this.cvc_fechaemisioninicio = cvc_fechaemisioninicio;
    }

    public Date getCvc_fechaemisionfin() {
        return cvc_fechaemisionfin;
    }

    public void setCvc_fechaemisionfin(Date cvc_fechaemisionfin) {
        this.cvc_fechaemisionfin = cvc_fechaemisionfin;
    }

    public Integer getCvc_id() {
        return cvc_id;
    }

    public void setCvc_id(Integer cvc_id) {
        this.cvc_id = cvc_id;
    }

    public String getEmp_razonsocial() {
        return emp_razonsocial;
    }

    public void setEmp_razonsocial(String emp_razonsocial) {
        this.emp_razonsocial = emp_razonsocial;
    }

    public String getCvt_descripcion() {
        return cvt_descripcion;
    }

    public void setCvt_descripcion(String cvt_descripcion) {
        this.cvt_descripcion = cvt_descripcion;
    }

    public String getEnt_nombre() {
        return ent_nombre;
    }

    public void setEnt_nombre(String ent_nombre) {
        this.ent_nombre = ent_nombre;
    }

    public String getCve_descripcion() {
        return cve_descripcion;
    }

    public void setCve_descripcion(String cve_descripcion) {
        this.cve_descripcion = cve_descripcion;
    }

    public String getCvc_comprobantereferencia() {
        return cvc_comprobantereferencia;
    }

    public void setCvc_comprobantereferencia(String cvc_comprobantereferencia) {
        this.cvc_comprobantereferencia = cvc_comprobantereferencia;
    }

    public String getFdc_codigo() {
        return fdc_codigo;
    }

    public void setFdc_codigo(String fdc_codigo) {
        this.fdc_codigo = fdc_codigo;
    }

    public String getVec_nroreferencia() {
        return vec_nroreferencia;
    }

    public void setVec_nroreferencia(String vec_nroreferencia) {
        this.vec_nroreferencia = vec_nroreferencia;
    }

    public Date getVec_fechacancelacioninicio() {
        return vec_fechacancelacioninicio;
    }

    public void setVec_fechacancelacioninicio(Date vec_fechacancelacioninicio) {
        this.vec_fechacancelacioninicio = vec_fechacancelacioninicio;
    }

    public Date getVec_fechacancelacionfin() {
        return vec_fechacancelacionfin;
    }

    public void setVec_fechacancelacionfin(Date vec_fechacancelacionfin) {
        this.vec_fechacancelacionfin = vec_fechacancelacionfin;
    }

    public String getVia_descripcion() {
        return via_descripcion;
    }

    public void setVia_descripcion(String via_descripcion) {
        this.via_descripcion = via_descripcion;
    }

}
