/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.model.planificacionviajes;

import com.garcal.erp.model.ErrorEntity;
import java.sql.Date;

/**
 *
 * @author usuario
 */
public class VehiculosPendientesViajes {

    private Integer veh_id;
    private Integer emp_id;
    private String veh_placa;
    private String vcl_id;
    private Date via_fechaviaje;
    private String via_horaviaje;

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

    public String getVcl_id() {
        return vcl_id;
    }

    public void setVcl_id(String vcl_id) {
        this.vcl_id = vcl_id;
    }

    public Date getVia_fechaviaje() {
        return via_fechaviaje;
    }

    public void setVia_fechaviaje(Date via_fechaviaje) {
        this.via_fechaviaje = via_fechaviaje;
    }

    public String getVia_horaviaje() {
        return via_horaviaje;
    }

    public void setVia_horaviaje(String via_horaviaje) {
        this.via_horaviaje = via_horaviaje;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }

}
