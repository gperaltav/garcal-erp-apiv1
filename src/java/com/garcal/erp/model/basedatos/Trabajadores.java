/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.model.basedatos;

import com.garcal.erp.model.ErrorEntity;
import java.sql.Date;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author User
 */
public class Trabajadores {

    private Integer tra_id;
    private Integer are_id;
    private Integer pue_id;
    private Integer emp_id;

    private String emp_razonsocial;
    private String tra_nombreyapellidos;
    private String tra_nombres;
    private String tra_apellidomaterno;
    private String tra_apellidopaterno;

    private String tra_tipocontrato;
    private String pue_nombre;
    private String tra_nrodocumento;

    private String tra_identificador;
    private String tra_fechanacimiento;
    private String tra_fechaingreso;
    private String tra_fechaingresoplanilla;
    private String tra_fechacese;
    private String tra_usucreacion;

    private String tra_usumodificacion;
    private Date tra_fecmodificacion;

    private ErrorEntity errorEntity = null;

    public Integer getTra_id() {
        return tra_id;
    }

    public void setTra_id(Integer tra_id) {
        this.tra_id = tra_id;
    }

    public Integer getAre_id() {
        return are_id;
    }

    public void setAre_id(Integer are_id) {
        this.are_id = are_id;
    }

    public Integer getPue_id() {
        return pue_id;
    }

    public void setPue_id(Integer pue_id) {
        this.pue_id = pue_id;
    }

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_razonsocial() {
        return emp_razonsocial;
    }

    public void setEmp_razonsocial(String emp_razonsocial) {
        this.emp_razonsocial = emp_razonsocial;
    }

    public String getTra_nombreyapellidos() {
        return tra_nombreyapellidos;
    }

    public void setTra_nombreyapellidos(String tra_nombreyapellidos) {
        this.tra_nombreyapellidos = tra_nombreyapellidos;
    }

    public String getTra_nombres() {
        return tra_nombres;
    }

    public void setTra_nombres(String tra_nombres) {
        this.tra_nombres = tra_nombres;
    }

    public String getTra_apellidomaterno() {
        return tra_apellidomaterno;
    }

    public void setTra_apellidomaterno(String tra_apellidomaterno) {
        this.tra_apellidomaterno = tra_apellidomaterno;
    }

    public String getTra_apellidopaterno() {
        return tra_apellidopaterno;
    }

    public void setTra_apellidopaterno(String tra_apellidopaterno) {
        this.tra_apellidopaterno = tra_apellidopaterno;
    }

    public String getTra_tipocontrato() {
        return tra_tipocontrato;
    }

    public void setTra_tipocontrato(String tra_tipocontrato) {
        this.tra_tipocontrato = tra_tipocontrato;
    }

    public String getPue_nombre() {
        return pue_nombre;
    }

    public void setPue_nombre(String pue_nombre) {
        this.pue_nombre = pue_nombre;
    }

    public String getTra_nrodocumento() {
        return tra_nrodocumento;
    }

    public void setTra_nrodocumento(String tra_nrodocumento) {
        this.tra_nrodocumento = tra_nrodocumento;
    }

    public String getTra_identificador() {
        return tra_identificador;
    }

    public void setTra_identificador(String tra_identificador) {
        this.tra_identificador = tra_identificador;
    }

    public String getTra_fechanacimiento() {
        return tra_fechanacimiento;
    }

    public void setTra_fechanacimiento(String tra_fechanacimiento) {
        this.tra_fechanacimiento = tra_fechanacimiento;
    }

    public String getTra_fechaingreso() {
        return tra_fechaingreso;
    }

    public void setTra_fechaingreso(String tra_fechaingreso) {
        this.tra_fechaingreso = tra_fechaingreso;
    }

    public String getTra_fechaingresoplanilla() {
        return tra_fechaingresoplanilla;
    }

    public void setTra_fechaingresoplanilla(String tra_fechaingresoplanilla) {
        this.tra_fechaingresoplanilla = tra_fechaingresoplanilla;
    }

    public String getTra_fechacese() {
        return tra_fechacese;
    }

    public void setTra_fechacese(String tra_fechacese) {
        this.tra_fechacese = tra_fechacese;
    }

    public String getTra_usucreacion() {
        return tra_usucreacion;
    }

    public void setTra_usucreacion(String tra_usucreacion) {
        this.tra_usucreacion = tra_usucreacion;
    }

    public String getTra_usumodificacion() {
        return tra_usumodificacion;
    }

    public void setTra_usumodificacion(String tra_usumodificacion) {
        this.tra_usumodificacion = tra_usumodificacion;
    }

    public Date getTra_fecmodificacion() {
        return tra_fecmodificacion;
    }

    public void setTra_fecmodificacion(Date tra_fecmodificacion) {
        this.tra_fecmodificacion = tra_fecmodificacion;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }
}
