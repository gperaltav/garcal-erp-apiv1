/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.model.ventas;

import com.garcal.erp.model.ErrorEntity;

/**
 *
 * @author usuario
 */
public class GuiasConfiguracion {
    
    private Integer emp_id;
    private String gti_codigo;
    private String gco_serie;
    private Integer veh_id;
    private Boolean gco_activo;
    private Integer gco_numeromin;
    private Integer gco_numeromax;
    private String gco_usucreacion;
    private Integer gco_id;
    private String veh_placa;
    private ErrorEntity errorEntity = null;

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getGti_codigo() {
        return gti_codigo;
    }

    public void setGti_codigo(String gti_codigo) {
        this.gti_codigo = gti_codigo;
    }

    public String getGco_serie() {
        return gco_serie;
    }

    public void setGco_serie(String gco_serie) {
        this.gco_serie = gco_serie;
    }

    public Integer getVeh_id() {
        return veh_id;
    }

    public void setVeh_id(Integer veh_id) {
        this.veh_id = veh_id;
    }

    public Boolean getGco_activo() {
        return gco_activo;
    }

    public void setGco_activo(Boolean gco_activo) {
        this.gco_activo = gco_activo;
    }

    public Integer getGco_numeromin() {
        return gco_numeromin;
    }

    public void setGco_numeromin(Integer gco_numeromin) {
        this.gco_numeromin = gco_numeromin;
    }

    public Integer getGco_numeromax() {
        return gco_numeromax;
    }

    public void setGco_numeromax(Integer gco_numeromax) {
        this.gco_numeromax = gco_numeromax;
    }

    public String getGco_usucreacion() {
        return gco_usucreacion;
    }

    public void setGco_usucreacion(String gco_usucreacion) {
        this.gco_usucreacion = gco_usucreacion;
    }

    public Integer getGco_id() {
        return gco_id;
    }

    public void setGco_id(Integer gco_id) {
        this.gco_id = gco_id;
    }

    public String getVeh_placa() {
        return veh_placa;
    }

    public void setVeh_placa(String veh_placa) {
        this.veh_placa = veh_placa;
    }
    

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }
    
    
    
}
