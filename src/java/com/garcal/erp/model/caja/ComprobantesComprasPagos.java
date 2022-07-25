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
public class ComprobantesComprasPagos {
    
    private Integer emp_id;
    private Integer ccp_id;
    private Integer ccc_id;
    private String fdp_codigo;
    private Integer cbp_id;
    private Double ccp_monto;
    private String ccp_nroreferencia;
    private String mon_codigo;
    private String ccp_descripcion;
    private String ccp_fechacancelacion;
    private String ccp_usucreacion;    
    
    private String cct_codigo;
    private String ccc_serienumero;
    private String fdc_codigo;
    private String ccp_fechacancelacioninicio;
    private String ccp_fechacancelacionfin;
    
    private String emp_razonsocial;
    private String ccc_fechaemision;
    private String cct_descripcion;
    private String ent_nombre;
    private Double ccc_total;
    private String cce_codigo;
    private String cce_descripcion;
    private String ccc_mon_codigo;
    private String fdp_descripcion;
    private String ccp_mon_codigo;
    private Double ccp_tipocambio;
    private String via_descripcion;
    
    private ErrorEntity errorEntity = null;

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public Integer getCcp_id() {
        return ccp_id;
    }

    public void setCcp_id(Integer ccp_id) {
        this.ccp_id = ccp_id;
    }

    public Integer getCcc_id() {
        return ccc_id;
    }

    public void setCcc_id(Integer ccc_id) {
        this.ccc_id = ccc_id;
    }

    public String getFdp_codigo() {
        return fdp_codigo;
    }

    public void setFdp_codigo(String fdp_codigo) {
        this.fdp_codigo = fdp_codigo;
    }

    public Integer getCbp_id() {
        return cbp_id;
    }

    public void setCbp_id(Integer cbp_id) {
        this.cbp_id = cbp_id;
    }

    public Double getCcp_monto() {
        return ccp_monto;
    }

    public void setCcp_monto(Double ccp_monto) {
        this.ccp_monto = ccp_monto;
    }

    public String getCcp_nroreferencia() {
        return ccp_nroreferencia;
    }

    public void setCcp_nroreferencia(String ccp_nroreferencia) {
        this.ccp_nroreferencia = ccp_nroreferencia;
    }

    public String getMon_codigo() {
        return mon_codigo;
    }

    public void setMon_codigo(String mon_codigo) {
        this.mon_codigo = mon_codigo;
    }

    public String getCcp_descripcion() {
        return ccp_descripcion;
    }

    public void setCcp_descripcion(String ccp_descripcion) {
        this.ccp_descripcion = ccp_descripcion;
    }

    public String getCcp_fechacancelacion() {
        return ccp_fechacancelacion;
    }

    public void setCcp_fechacancelacion(String ccp_fechacancelacion) {
        this.ccp_fechacancelacion = ccp_fechacancelacion;
    }

    public String getCcp_usucreacion() {
        return ccp_usucreacion;
    }

    public void setCcp_usucreacion(String ccp_usucreacion) {
        this.ccp_usucreacion = ccp_usucreacion;
    }

    public String getCct_codigo() {
        return cct_codigo;
    }

    public void setCct_codigo(String cct_codigo) {
        this.cct_codigo = cct_codigo;
    }

    public String getCcc_serienumero() {
        return ccc_serienumero;
    }

    public void setCcc_serienumero(String ccc_serienumero) {
        this.ccc_serienumero = ccc_serienumero;
    }

    public String getFdc_codigo() {
        return fdc_codigo;
    }

    public void setFdc_codigo(String fdc_codigo) {
        this.fdc_codigo = fdc_codigo;
    }

    public String getCcp_fechacancelacioninicio() {
        return ccp_fechacancelacioninicio;
    }

    public void setCcp_fechacancelacioninicio(String ccp_fechacancelacioninicio) {
        this.ccp_fechacancelacioninicio = ccp_fechacancelacioninicio;
    }

    public String getCcp_fechacancelacionfin() {
        return ccp_fechacancelacionfin;
    }

    public void setCcp_fechacancelacionfin(String ccp_fechacancelacionfin) {
        this.ccp_fechacancelacionfin = ccp_fechacancelacionfin;
    }

    public String getEmp_razonsocial() {
        return emp_razonsocial;
    }

    public void setEmp_razonsocial(String emp_razonsocial) {
        this.emp_razonsocial = emp_razonsocial;
    }

    public String getCcc_fechaemision() {
        return ccc_fechaemision;
    }

    public void setCcc_fechaemision(String ccc_fechaemision) {
        this.ccc_fechaemision = ccc_fechaemision;
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

    public Double getCcc_total() {
        return ccc_total;
    }

    public void setCcc_total(Double ccc_total) {
        this.ccc_total = ccc_total;
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

    public String getCcc_mon_codigo() {
        return ccc_mon_codigo;
    }

    public void setCcc_mon_codigo(String ccc_mon_codigo) {
        this.ccc_mon_codigo = ccc_mon_codigo;
    }

    public String getFdp_descripcion() {
        return fdp_descripcion;
    }

    public void setFdp_descripcion(String fdp_descripcion) {
        this.fdp_descripcion = fdp_descripcion;
    }

    public String getCcp_mon_codigo() {
        return ccp_mon_codigo;
    }

    public void setCcp_mon_codigo(String ccp_mon_codigo) {
        this.ccp_mon_codigo = ccp_mon_codigo;
    }

    public Double getCcp_tipocambio() {
        return ccp_tipocambio;
    }

    public void setCcp_tipocambio(Double ccp_tipocambio) {
        this.ccp_tipocambio = ccp_tipocambio;
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
