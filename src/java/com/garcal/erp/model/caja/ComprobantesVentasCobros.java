/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.model.caja;

import com.garcal.erp.model.ErrorEntity;
import java.sql.Date;

/**
 *
 * @author User
 */
public class ComprobantesVentasCobros {

    private Integer emp_id;
    private Integer vec_id;
    private Integer cvc_id;
    private String fdc_codigo;
    private Double vec_monto;
    private String vec_nroreferencia;
    private String vec_fechacancelacion;
    private String vec_descripcion;
    private String mon_codigo;
    private String vec_usucreacion;

    private String vec_fechacancelacioninicio;
    private String vec_fechacancelacionfin;

    private String cct_codigo;
    private String cct_descripcion;
    private String cce_codigo;
    private String cce_descripcion;
    private String cvc_mon_codigo;
    private String fdc_descripcion;
    private String vec_mon_codigo;
    private Double vec_tipocambio;
    private String cvt_codigo;
    private String cvc_serienumero;
    private String cvc_fechaemision;
    private String emp_razonsocial;
    private String ent_nombre;
    private Double cvc_total;
    private String via_descripcion;

    private ErrorEntity errorEntity = null;

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public Integer getVec_id() {
        return vec_id;
    }

    public void setVec_id(Integer vec_id) {
        this.vec_id = vec_id;
    }

    public Integer getCvc_id() {
        return cvc_id;
    }

    public void setCvc_id(Integer cvc_id) {
        this.cvc_id = cvc_id;
    }

    public String getFdc_codigo() {
        return fdc_codigo;
    }

    public void setFdc_codigo(String fdc_codigo) {
        this.fdc_codigo = fdc_codigo;
    }

    public Double getVec_monto() {
        return vec_monto;
    }

    public void setVec_monto(Double vec_monto) {
        this.vec_monto = vec_monto;
    }

    public String getVec_nroreferencia() {
        return vec_nroreferencia;
    }

    public void setVec_nroreferencia(String vec_nroreferencia) {
        this.vec_nroreferencia = vec_nroreferencia;
    }

    public String getVec_fechacancelacion() {
        return vec_fechacancelacion;
    }

    public void setVec_fechacancelacion(String vec_fechacancelacion) {
        this.vec_fechacancelacion = vec_fechacancelacion;
    }

    public String getVec_descripcion() {
        return vec_descripcion;
    }

    public void setVec_descripcion(String vec_descripcion) {
        this.vec_descripcion = vec_descripcion;
    }

    public String getMon_codigo() {
        return mon_codigo;
    }

    public void setMon_codigo(String mon_codigo) {
        this.mon_codigo = mon_codigo;
    }

    public String getVec_usucreacion() {
        return vec_usucreacion;
    }

    public void setVec_usucreacion(String vec_usucreacion) {
        this.vec_usucreacion = vec_usucreacion;
    }

    public String getVec_fechacancelacioninicio() {
        return vec_fechacancelacioninicio;
    }

    public void setVec_fechacancelacioninicio(String vec_fechacancelacioninicio) {
        this.vec_fechacancelacioninicio = vec_fechacancelacioninicio;
    }

    public String getVec_fechacancelacionfin() {
        return vec_fechacancelacionfin;
    }

    public void setVec_fechacancelacionfin(String vec_fechacancelacionfin) {
        this.vec_fechacancelacionfin = vec_fechacancelacionfin;
    }

    public String getCct_codigo() {
        return cct_codigo;
    }

    public void setCct_codigo(String cct_codigo) {
        this.cct_codigo = cct_codigo;
    }

    public String getCct_descripcion() {
        return cct_descripcion;
    }

    public void setCct_descripcion(String cct_descripcion) {
        this.cct_descripcion = cct_descripcion;
    }

    public String getCce_codigo() {
        return cce_codigo;
    }

    public void setCce_codigo(String cce_codigo) {
        this.cce_codigo = cce_codigo;
    }

    public String getCce_descripcion() {
        return cce_descripcion;
    }

    public void setCce_descripcion(String cce_descripcion) {
        this.cce_descripcion = cce_descripcion;
    }

    public String getCvc_mon_codigo() {
        return cvc_mon_codigo;
    }

    public void setCvc_mon_codigo(String cvc_mon_codigo) {
        this.cvc_mon_codigo = cvc_mon_codigo;
    }

    public String getFdc_descripcion() {
        return fdc_descripcion;
    }

    public void setFdc_descripcion(String fdc_descripcion) {
        this.fdc_descripcion = fdc_descripcion;
    }

    public String getVec_mon_codigo() {
        return vec_mon_codigo;
    }

    public void setVec_mon_codigo(String vec_mon_codigo) {
        this.vec_mon_codigo = vec_mon_codigo;
    }

    public Double getVec_tipocambio() {
        return vec_tipocambio;
    }

    public void setVec_tipocambio(Double vec_tipocambio) {
        this.vec_tipocambio = vec_tipocambio;
    }

    public String getCvt_codigo() {
        return cvt_codigo;
    }

    public void setCvt_codigo(String cvt_codigo) {
        this.cvt_codigo = cvt_codigo;
    }

    public String getCvc_serienumero() {
        return cvc_serienumero;
    }

    public void setCvc_serienumero(String cvc_serienumero) {
        this.cvc_serienumero = cvc_serienumero;
    }

    public String getCvc_fechaemision() {
        return cvc_fechaemision;
    }

    public void setCvc_fechaemision(String cvc_fechaemision) {
        this.cvc_fechaemision = cvc_fechaemision;
    }

    public String getEmp_razonsocial() {
        return emp_razonsocial;
    }

    public void setEmp_razonsocial(String emp_razonsocial) {
        this.emp_razonsocial = emp_razonsocial;
    }

    public String getEnt_nombre() {
        return ent_nombre;
    }

    public void setEnt_nombre(String ent_nombre) {
        this.ent_nombre = ent_nombre;
    }

    public Double getCvc_total() {
        return cvc_total;
    }

    public void setCvc_total(Double cvc_total) {
        this.cvc_total = cvc_total;
    }

    public String getVia_descripcion() {
        return via_descripcion;
    }

    public void setVia_descripcion(String via_descripcion) {
        this.via_descripcion = via_descripcion;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }

}
