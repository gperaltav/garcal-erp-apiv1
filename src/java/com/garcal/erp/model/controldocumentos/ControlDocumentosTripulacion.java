/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.model.controldocumentos;

import com.garcal.erp.model.ErrorEntity;
import java.util.List;
import java.util.Map;

/**
 *
 * @author User
 */
public class ControlDocumentosTripulacion {

    private Integer emp_id;
    private Integer tri_id;
    private Integer ttd_id;
    private String txd_entidademisora;
    private String txd_fechaemision;
    private String txd_fechavencimiento;
    private String txd_usucreacion;

    private String tri_nombre;
    private Integer txd_id;
    private String emp_razonsocial;
    private String tri_nrolicencia;
    private String ttd_nombre;
    private String ttd_color;

    private List<Map> LICENCIAA3;
    private List<Map> LICENCIAA4;
    private List<Map> SCTR;
    private List<Map> REVMEDICA;
    private List<Map> SEGUROVIDALEY;

    private ErrorEntity errorEntity = null;

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public Integer getTri_id() {
        return tri_id;
    }

    public void setTri_id(Integer tri_id) {
        this.tri_id = tri_id;
    }

    public Integer getTtd_id() {
        return ttd_id;
    }

    public void setTtd_id(Integer ttd_id) {
        this.ttd_id = ttd_id;
    }

    public String getTxd_entidademisora() {
        return txd_entidademisora;
    }

    public void setTxd_entidademisora(String txd_entidademisora) {
        this.txd_entidademisora = txd_entidademisora;
    }

    public String getTxd_fechaemision() {
        return txd_fechaemision;
    }

    public void setTxd_fechaemision(String txd_fechaemision) {
        this.txd_fechaemision = txd_fechaemision;
    }

    public String getTxd_fechavencimiento() {
        return txd_fechavencimiento;
    }

    public void setTxd_fechavencimiento(String txd_fechavencimiento) {
        this.txd_fechavencimiento = txd_fechavencimiento;
    }

    public String getTxd_usucreacion() {
        return txd_usucreacion;
    }

    public void setTxd_usucreacion(String txd_usucreacion) {
        this.txd_usucreacion = txd_usucreacion;
    }

    public String getTri_nombre() {
        return tri_nombre;
    }

    public void setTri_nombre(String tri_nombre) {
        this.tri_nombre = tri_nombre;
    }

    public Integer getTxd_id() {
        return txd_id;
    }

    public void setTxd_id(Integer txd_id) {
        this.txd_id = txd_id;
    }

    public String getEmp_razonsocial() {
        return emp_razonsocial;
    }

    public void setEmp_razonsocial(String emp_razonsocial) {
        this.emp_razonsocial = emp_razonsocial;
    }

    public String getTri_nrolicencia() {
        return tri_nrolicencia;
    }

    public void setTri_nrolicencia(String tri_nrolicencia) {
        this.tri_nrolicencia = tri_nrolicencia;
    }

    public String getTtd_nombre() {
        return ttd_nombre;
    }

    public void setTtd_nombre(String ttd_nombre) {
        this.ttd_nombre = ttd_nombre;
    }

    public String getTtd_color() {
        return ttd_color;
    }

    public void setTtd_color(String ttd_color) {
        this.ttd_color = ttd_color;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }

    public List<Map> getLICENCIAA3() {
        return LICENCIAA3;
    }

    public void setLICENCIAA3(List<Map> LICENCIAA3) {
        this.LICENCIAA3 = LICENCIAA3;
    }

    public List<Map> getLICENCIAA4() {
        return LICENCIAA4;
    }

    public void setLICENCIAA4(List<Map> LICENCIAA4) {
        this.LICENCIAA4 = LICENCIAA4;
    }

    public List<Map> getSCTR() {
        return SCTR;
    }

    public void setSCTR(List<Map> SCTR) {
        this.SCTR = SCTR;
    }

    public List<Map> getREVMEDICA() {
        return REVMEDICA;
    }

    public void setREVMEDICA(List<Map> REVMEDICA) {
        this.REVMEDICA = REVMEDICA;
    }

    public List<Map> getSEGUROVIDALEY() {
        return SEGUROVIDALEY;
    }

    public void setSEGUROVIDALEY(List<Map> SEGUROVIDALEY) {
        this.SEGUROVIDALEY = SEGUROVIDALEY;
    }

}
