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
 * @author Gloria Peralta <gloria.ypv@gmail.com>
 */
public class ControlDocumentosVehiculos {

    private Integer vxd_id;
    private Integer veh_id;
    private Integer emp_id;
    private String emp_razonsocial;
    private String veh_placa;
    private Integer vtd_id;
    private String vtd_nombre;
    private String vxd_fechavencimiento;
    private String color;
    private String vxd_entidademisora;
    private String vxd_fechaemision;
    private String vxd_usucreacion;

    private String vcl_nombre;

    private List<Map> CITV12m;
    private List<Map> CITV6m;
    private List<Map> SOAT;
    private List<Map> POLIZA;
    private List<Map> ELEMPELIGROSOS;
    private List<Map> BONIFICACION;
    private List<Map> HERMETECIDAD;
    private List<Map> MTCMERCANCIAS;
    private List<Map> MTCMATPEL;

    private ErrorEntity errorEntity = null;

    public Integer getVxd_id() {
        return vxd_id;
    }

    public void setVxd_id(Integer vxd_id) {
        this.vxd_id = vxd_id;
    }

    public Integer getVeh_id() {
        return veh_id;
    }

    public void setVeh_id(Integer veh_id) {
        this.veh_id = veh_id;
    }

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getVeh_placa() {
        return veh_placa;
    }

    public void setVeh_placa(String veh_placa) {
        this.veh_placa = veh_placa;
    }

    public Integer getVtd_id() {
        return vtd_id;
    }

    public void setVtd_id(Integer vtd_id) {
        this.vtd_id = vtd_id;
    }

    public String getVtd_nombre() {
        return vtd_nombre;
    }

    public void setVtd_nombre(String vtd_nombre) {
        this.vtd_nombre = vtd_nombre;
    }

    public String getVxd_fechavencimiento() {
        return vxd_fechavencimiento;
    }

    public void setVxd_fechavencimiento(String vxd_fechavencimiento) {
        this.vxd_fechavencimiento = vxd_fechavencimiento;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEmp_razonsocial() {
        return emp_razonsocial;
    }

    public void setEmp_razonsocial(String emp_razonsocial) {
        this.emp_razonsocial = emp_razonsocial;
    }

    public List<Map> getCITV12m() {
        return CITV12m;
    }

    public void setCITV12m(List<Map> CITV12m) {
        this.CITV12m = CITV12m;
    }

    public List<Map> getCITV6m() {
        return CITV6m;
    }

    public void setCITV6m(List<Map> CITV6m) {
        this.CITV6m = CITV6m;
    }

    public List<Map> getSOAT() {
        return SOAT;
    }

    public void setSOAT(List<Map> SOAT) {
        this.SOAT = SOAT;
    }

    public List<Map> getPOLIZA() {
        return POLIZA;
    }

    public void setPOLIZA(List<Map> POLIZA) {
        this.POLIZA = POLIZA;
    }

    public List<Map> getELEMPELIGROSOS() {
        return ELEMPELIGROSOS;
    }

    public void setELEMPELIGROSOS(List<Map> ELEMPELIGROSOS) {
        this.ELEMPELIGROSOS = ELEMPELIGROSOS;
    }

    public List<Map> getBONIFICACION() {
        return BONIFICACION;
    }

    public void setBONIFICACION(List<Map> BONIFICACION) {
        this.BONIFICACION = BONIFICACION;
    }

    public List<Map> getHERMETECIDAD() {
        return HERMETECIDAD;
    }

    public void setHERMETECIDAD(List<Map> HERMETECIDAD) {
        this.HERMETECIDAD = HERMETECIDAD;
    }

    public List<Map> getMTCMERCANCIAS() {
        return MTCMERCANCIAS;
    }

    public void setMTCMERCANCIAS(List<Map> MTCMERCANCIAS) {
        this.MTCMERCANCIAS = MTCMERCANCIAS;
    }

    public List<Map> getMTCMATPEL() {
        return MTCMATPEL;
    }

    public void setMTCMATPEL(List<Map> MTCMATPEL) {
        this.MTCMATPEL = MTCMATPEL;
    }

    public String getVxd_entidademisora() {
        return vxd_entidademisora;
    }

    public void setVxd_entidademisora(String vxd_entidademisora) {
        this.vxd_entidademisora = vxd_entidademisora;
    }

    public String getVxd_fechaemision() {
        return vxd_fechaemision;
    }

    public void setVxd_fechaemision(String vxd_fechaemision) {
        this.vxd_fechaemision = vxd_fechaemision;
    }

    public String getVxd_usucreacion() {
        return vxd_usucreacion;
    }

    public void setVxd_usucreacion(String vxd_usucreacion) {
        this.vxd_usucreacion = vxd_usucreacion;
    }

    public String getVcl_nombre() {
        return vcl_nombre;
    }

    public void setVcl_nombre(String vcl_nombre) {
        this.vcl_nombre = vcl_nombre;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }

}
