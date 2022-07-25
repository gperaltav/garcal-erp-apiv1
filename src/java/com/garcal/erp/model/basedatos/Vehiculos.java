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
public class Vehiculos {

    private Integer veh_id;
    private Integer emp_id;

    private String veh_placa;

    private Integer vma_id;
    private Integer vmo_id;
    private String vti_id;
    private String vcl_id;
    private Integer veh_anno;

    private String veh_usucreacion;
    private String veh_serie;
    private String veh_mtc;
    private Double veh_cargautil;
    private Double veh_kilometraje;

    private String emp_razonsocial;
    private String vcl_nombre;
    private String vti_nombre;
    private String vma_nombre;
    private String vmo_nombre;

    private Integer veh_anno_inicio;
    private Integer veh_anno_fin;

    private ErrorEntity errorEntity = null;

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

    public Integer getVma_id() {
        return vma_id;
    }

    public void setVma_id(Integer vma_id) {
        this.vma_id = vma_id;
    }

    public Integer getVmo_id() {
        return vmo_id;
    }

    public void setVmo_id(Integer vmo_id) {
        this.vmo_id = vmo_id;
    }

    public String getVti_id() {
        return vti_id;
    }

    public void setVti_id(String vti_id) {
        this.vti_id = vti_id;
    }

    public String getVcl_id() {
        return vcl_id;
    }

    public void setVcl_id(String vcl_id) {
        this.vcl_id = vcl_id;
    }

    public Integer getVeh_anno() {
        return veh_anno;
    }

    public void setVeh_anno(Integer veh_anno) {
        this.veh_anno = veh_anno;
    }

    public String getVeh_usucreacion() {
        return veh_usucreacion;
    }

    public void setVeh_usucreacion(String veh_usucreacion) {
        this.veh_usucreacion = veh_usucreacion;
    }

    public String getVeh_serie() {
        return veh_serie;
    }

    public void setVeh_serie(String veh_serie) {
        this.veh_serie = veh_serie;
    }

    public String getVeh_mtc() {
        return veh_mtc;
    }

    public void setVeh_mtc(String veh_mtc) {
        this.veh_mtc = veh_mtc;
    }

    public Double getVeh_cargautil() {
        return veh_cargautil;
    }

    public void setVeh_cargautil(Double veh_cargautil) {
        this.veh_cargautil = veh_cargautil;
    }

    public Double getVeh_kilometraje() {
        return veh_kilometraje;
    }

    public void setVeh_kilometraje(Double veh_kilometraje) {
        this.veh_kilometraje = veh_kilometraje;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }

    public String getVcl_nombre() {
        return vcl_nombre;
    }

    public void setVcl_nombre(String vcl_nombre) {
        this.vcl_nombre = vcl_nombre;
    }

    public String getVti_nombre() {
        return vti_nombre;
    }

    public void setVti_nombre(String vti_nombre) {
        this.vti_nombre = vti_nombre;
    }

    public String getVma_nombre() {
        return vma_nombre;
    }

    public void setVma_nombre(String vma_nombre) {
        this.vma_nombre = vma_nombre;
    }

    public String getVmo_nombre() {
        return vmo_nombre;
    }

    public void setVmo_nombre(String vmo_nombre) {
        this.vmo_nombre = vmo_nombre;
    }

    public String getEmp_razonsocial() {
        return emp_razonsocial;
    }

    public void setEmp_razonsocial(String emp_razonsocial) {
        this.emp_razonsocial = emp_razonsocial;
    }

    public Integer getVeh_anno_inicio() {
        return veh_anno_inicio;
    }

    public void setVeh_anno_inicio(Integer veh_anno_inicio) {
        this.veh_anno_inicio = veh_anno_inicio;
    }

    public Integer getVeh_anno_fin() {
        return veh_anno_fin;
    }

    public void setVeh_anno_fin(Integer veh_anno_fin) {
        this.veh_anno_fin = veh_anno_fin;
    }

}
