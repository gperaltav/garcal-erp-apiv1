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
public class MantenimientosCab {

    private Integer emp_id;
    private Integer veh_id;
    private String man_fecha;
    private String usu_codigo;
    private String man_estado;
    private String man_usucreacion;
    private Integer man_numero;
    private Integer man_id;

    private Integer tar_id;
    private String mad_descripcion;
    private String mad_observacion;
    private String mad_estado;
    private String mad_usucreacion;
    
    private String man_usumodificacion;
    private String man_fecmodificacion;

    private ArrayList<MantenimientosDet> detalle;
    
    private ErrorEntity errorEntity = null;

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

    public String getMan_fecha() {
        return man_fecha;
    }

    public void setMan_fecha(String man_fecha) {
        this.man_fecha = man_fecha;
    }

    public String getUsu_codigo() {
        return usu_codigo;
    }

    public void setUsu_codigo(String usu_codigo) {
        this.usu_codigo = usu_codigo;
    }

    public String getMan_estado() {
        return man_estado;
    }

    public void setMan_estado(String man_estado) {
        this.man_estado = man_estado;
    }

    public String getMan_usucreacion() {
        return man_usucreacion;
    }

    public void setMan_usucreacion(String man_usucreacion) {
        this.man_usucreacion = man_usucreacion;
    }

    public Integer getMan_numero() {
        return man_numero;
    }

    public void setMan_numero(Integer man_numero) {
        this.man_numero = man_numero;
    }

    public Integer getMan_id() {
        return man_id;
    }

    public void setMan_id(Integer man_id) {
        this.man_id = man_id;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }

    public Integer getTar_id() {
        return tar_id;
    }

    public void setTar_id(Integer tar_id) {
        this.tar_id = tar_id;
    }

    public String getMad_descripcion() {
        return mad_descripcion;
    }

    public void setMad_descripcion(String mad_descripcion) {
        this.mad_descripcion = mad_descripcion;
    }

    public String getMad_observacion() {
        return mad_observacion;
    }

    public void setMad_observacion(String mad_observacion) {
        this.mad_observacion = mad_observacion;
    }

    public String getMad_estado() {
        return mad_estado;
    }

    public void setMad_estado(String mad_estado) {
        this.mad_estado = mad_estado;
    }

    public String getMad_usucreacion() {
        return mad_usucreacion;
    }

    public void setMad_usucreacion(String mad_usucreacion) {
        this.mad_usucreacion = mad_usucreacion;
    }

    public ArrayList<MantenimientosDet> getDetalle() {
        return detalle;
    }

    public void setDetalle(ArrayList<MantenimientosDet> detalle) {
        this.detalle = detalle;
    }

    public String getMan_usumodificacion() {
        return man_usumodificacion;
    }

    public void setMan_usumodificacion(String man_usumodificacion) {
        this.man_usumodificacion = man_usumodificacion;
    }

    public String getMan_fecmodificacion() {
        return man_fecmodificacion;
    }

    public void setMan_fecmodificacion(String man_fecmodificacion) {
        this.man_fecmodificacion = man_fecmodificacion;
    }
    
    

}
