/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.model.mantenimiento;

import com.garcal.erp.model.ErrorEntity;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Teresa
 */
public class ProgramacionMantenimiento {
    
    private Integer pma_id;
    private Integer tar_id;
    private Integer emp_id;
    private Integer veh_id;
    private Double pma_avisokm;
    private Double pma_km;
    private String pma_fechamantenimiento;
    private Double pma_ultimokm;
    private String pma_usucreacion;
    private String veh_placa;
    private String emp_razonsocial;
    private String tar_cantidad;
    private String  tar_descripcion;
    
    
    private ErrorEntity errorEntity = null;
    
    private ArrayList<ProgramacionMantenimientoDet> detalle;
    
   
    public Integer getPma_id() {
        return pma_id;
    }

    public void setPma_id(Integer pma_id) {
        this.pma_id = pma_id;
    }

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public Integer getVeh_id() {
        return veh_id;
    }

    public void setVeh_id(Integer veh_id) {
        this.veh_id = veh_id;
    }

    public Double getPma_avisokm() {
        return pma_avisokm;
    }

    public void setPma_avisokm(Double pma_avisokm) {
        this.pma_avisokm = pma_avisokm;
    }

    public Double getPma_km() {
        return pma_km;
    }

    public void setPma_km(Double pma_km) {
        this.pma_km = pma_km;
    }

    public String getPma_fechamantenimiento() {
        return pma_fechamantenimiento;
    }

    public void setPma_fechamantenimiento(String pma_fechamantenimiento) {
        this.pma_fechamantenimiento = pma_fechamantenimiento;
    }

    public Double getPma_ultimokm() {
        return pma_ultimokm;
    }

    public void setPma_ultimokm(Double pma_ultimokm) {
        this.pma_ultimokm = pma_ultimokm;
    }

    public String getPma_usucreacion() {
        return pma_usucreacion;
    }

    public Integer getTar_id() {
        return tar_id;
    }

    public void setTar_id(Integer tar_id) {
        this.tar_id = tar_id;
    }
    
    public void setPma_usucreacion(String pma_usucreacion) {
        this.pma_usucreacion = pma_usucreacion;
    }

    public String getVeh_placa() {
        return veh_placa;
    }

    public void setVeh_placa(String veh_placa) {
        this.veh_placa = veh_placa;
    }

    public String getEmp_razonsocial() {
        return emp_razonsocial;
    }

    public void setEmp_razonsocial(String emp_razonsocial) {
        this.emp_razonsocial = emp_razonsocial;
    }

    public String getTar_cantidad() {
        return tar_cantidad;
    }

    public void setTar_cantidad(String tar_cantidad) {
        this.tar_cantidad = tar_cantidad;
    }

    public String getTar_descripcion() {
        return tar_descripcion;
    }

    public void setTar_descripcion(String tar_descripcion) {
        this.tar_descripcion = tar_descripcion;
    }
    
    
    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }

    public ArrayList<ProgramacionMantenimientoDet> getDetalle() {
        return detalle;
    }

    public void setDetalle(ArrayList<ProgramacionMantenimientoDet> detalle) {
        this.detalle = detalle;
    }
    
    
}
