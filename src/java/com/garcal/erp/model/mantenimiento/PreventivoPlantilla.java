/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.model.mantenimiento;

import com.garcal.erp.model.ErrorEntity;
import java.util.ArrayList;

/**
 *
 * @author Teresa
 */
public class PreventivoPlantilla {
    
    private Integer ppa_id;
    private Integer emp_id;
    private Integer tar_id;
    private Integer vma_id;
    private Double ppa_avisokm;
    private Double ppa_km;
    private String ppa_usucreacion;
    private String emp_razonsocial;
    private String veh_placa;
    private String ppa_descripcion;
    private String tar_descripcion;
    private Integer veh_id;
    private String vma_nombre;
    
    private ErrorEntity errorEntity = null;
    private ArrayList<PreventivoPlantillaDet> detalle;

    public Integer getPpa_id() {
        return ppa_id;
    }

    public void setPpa_id(Integer ppa_id) {
        this.ppa_id = ppa_id;
    }

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public Integer getTar_id() {
        return tar_id;
    }

    public void setTar_id(Integer tar_id) {
        this.tar_id = tar_id;
    }

    public Integer getVma_id() {
        return vma_id;
    }

    public void setVma_id(Integer vma_id) {
        this.vma_id = vma_id;
    }

    public Double getPpa_avisokm() {
        return ppa_avisokm;
    }

    public void setPpa_avisokm(Double ppa_avisokm) {
        this.ppa_avisokm = ppa_avisokm;
    }

    public Double getPpa_km() {
        return ppa_km;
    }

    public void setPpa_km(Double ppa_km) {
        this.ppa_km = ppa_km;
    }

    public String getEmp_razonsocial() {
        return emp_razonsocial;
    }

    public void setEmp_razonsocial(String emp_razonsocial) {
        this.emp_razonsocial = emp_razonsocial;
    }

    public String getVeh_placa() {
        return veh_placa;
    }

    public void setVeh_placa(String veh_placa) {
        this.veh_placa = veh_placa;
    }

    public String getPpa_usucreacion() {
        return ppa_usucreacion;
    }

    public void setPpa_usucreacion(String ppa_usucreacion) {
        this.ppa_usucreacion = ppa_usucreacion;
    }

    public String getPpa_descripcion() {
        return ppa_descripcion;
    }

    public void setPpa_descripcion(String ppa_descripcion) {
        this.ppa_descripcion = ppa_descripcion;
    }

    public String getTar_descripcion() {
        return tar_descripcion;
    }

    public void setTar_descripcion(String tar_descripcion) {
        this.tar_descripcion = tar_descripcion;
    }

    public Integer getVeh_id() {
        return veh_id;
    }

    public void setVeh_id(Integer veh_id) {
        this.veh_id = veh_id;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }

    public ArrayList<PreventivoPlantillaDet> getDetalle() {
        return detalle;
    }

    public void setDetalle(ArrayList<PreventivoPlantillaDet> detalle) {
        this.detalle = detalle;
    }

    public String getVma_nombre() {
        return vma_nombre;
    }

    public void setVma_nombre(String vma_nombre) {
        this.vma_nombre = vma_nombre;
    }
    
}
