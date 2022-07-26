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
public class Entidad {

    private Integer emp_id;
    private String ubi_codigo;
    private String ent_nombre;
    private String dti_id;
    private String ent_nrodocumento;

    private String ent_apellidopaterno;
    private String ent_apellidomaterno;
    private Boolean ent_activo;
    private Integer zon_id;
    private String ent_direccion;

    private String ent_telefono;
    private String ent_celular;
    private String ent_paginaweb;
    private String ent_correo;
    private String ent_contacto;

    private String ent_sexo;
    private String ent_usucreacion;
    private Boolean ent_personanatural;

    private String emp_razonsocial;

    private Integer ent_id;
    private Integer pro_id;

    private String ext_id;
    private String fdp_id;

    private String pro_descripcion;

    private String fdp_descri;
    private Integer fpd_diasvencimiento;

    private Boolean ent_estadocontribuyente;
    private Boolean ent_condicioncontribuyente;

    //private String ent_fecreacion;
    // private String ent_usumodificacion;
    // private Double ent_fecmodificacion;
    private ErrorEntity errorEntity = null;

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getUbi_codigo() {
        return ubi_codigo;
    }

    public void setUbi_codigo(String ubi_codigo) {
        this.ubi_codigo = ubi_codigo;
    }

    public String getEnt_nombre() {
        return ent_nombre;
    }

    public void setEnt_nombre(String ent_nombre) {
        this.ent_nombre = ent_nombre;
    }

    public String getDti_id() {
        return dti_id;
    }

    public void setDti_id(String dti_id) {
        this.dti_id = dti_id;
    }

    public String getEnt_nrodocumento() {
        return ent_nrodocumento;
    }

    public void setEnt_nrodocumento(String ent_nrodocumento) {
        this.ent_nrodocumento = ent_nrodocumento;
    }

    public String getEnt_apellidopaterno() {
        return ent_apellidopaterno;
    }

    public void setEnt_apellidopaterno(String ent_apellidopaterno) {
        this.ent_apellidopaterno = ent_apellidopaterno;
    }

    public String getEnt_apellidomaterno() {
        return ent_apellidomaterno;
    }

    public void setEnt_apellidomaterno(String ent_apellidomaterno) {
        this.ent_apellidomaterno = ent_apellidomaterno;
    }

    public Boolean getEnt_activo() {
        return ent_activo;
    }

    public void setEnt_activo(Boolean ent_activo) {
        this.ent_activo = ent_activo;
    }

    public Integer getZon_id() {
        return zon_id;
    }

    public void setZon_id(Integer zon_id) {
        this.zon_id = zon_id;
    }

    public String getEnt_direccion() {
        return ent_direccion;
    }

    public void setEnt_direccion(String ent_direccion) {
        this.ent_direccion = ent_direccion;
    }

    public String getEnt_telefono() {
        return ent_telefono;
    }

    public void setEnt_telefono(String ent_telefono) {
        this.ent_telefono = ent_telefono;
    }

    public String getEnt_celular() {
        return ent_celular;
    }

    public void setEnt_celular(String ent_celular) {
        this.ent_celular = ent_celular;
    }

    public String getEnt_paginaweb() {
        return ent_paginaweb;
    }

    public void setEnt_paginaweb(String ent_paginaweb) {
        this.ent_paginaweb = ent_paginaweb;
    }

    public String getEnt_correo() {
        return ent_correo;
    }

    public void setEnt_correo(String ent_correo) {
        this.ent_correo = ent_correo;
    }

    public String getEnt_contacto() {
        return ent_contacto;
    }

    public void setEnt_contacto(String ent_contacto) {
        this.ent_contacto = ent_contacto;
    }

    public String getEnt_sexo() {
        return ent_sexo;
    }

    public void setEnt_sexo(String ent_sexo) {
        this.ent_sexo = ent_sexo;
    }

    public Boolean getEnt_personanatural() {
        return ent_personanatural;
    }

    public void setEnt_personanatural(Boolean ent_personanatural) {
        this.ent_personanatural = ent_personanatural;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }

    public String getEnt_usucreacion() {
        return ent_usucreacion;
    }

    public void setEnt_usucreacion(String ent_usucreacion) {
        this.ent_usucreacion = ent_usucreacion;
    }

    public Integer getEnt_id() {
        return ent_id;
    }

    public void setEnt_id(Integer ent_id) {
        this.ent_id = ent_id;
    }

    public String getExt_id() {
        return ext_id;
    }

    public void setExt_id(String ext_id) {
        this.ext_id = ext_id;
    }

    public String getFdp_id() {
        return fdp_id;
    }

    public void setFdp_id(String fdp_id) {
        this.fdp_id = fdp_id;
    }

    public Integer getPro_id() {
        return pro_id;
    }

    public void setPro_id(Integer pro_id) {
        this.pro_id = pro_id;
    }

    public String getEmp_razonsocial() {
        return emp_razonsocial;
    }

    public void setEmp_razonsocial(String emp_razonsocial) {
        this.emp_razonsocial = emp_razonsocial;
    }

    public String getPro_descripcion() {
        return pro_descripcion;
    }

    public void setPro_descripcion(String pro_descripcion) {
        this.pro_descripcion = pro_descripcion;
    }

    public String getFdp_descri() {
        return fdp_descri;
    }

    public void setFdp_descri(String fdp_descri) {
        this.fdp_descri = fdp_descri;
    }

    public Integer getFpd_diasvencimiento() {
        return fpd_diasvencimiento;
    }

    public void setFpd_diasvencimiento(Integer fpd_diasvencimiento) {
        this.fpd_diasvencimiento = fpd_diasvencimiento;
    }

    public Boolean getEnt_estadocontribuyente() {
        return ent_estadocontribuyente;
    }

    public void setEnt_estadocontribuyente(Boolean ent_estadocontribuyente) {
        this.ent_estadocontribuyente = ent_estadocontribuyente;
    }

    public Boolean getEnt_condicioncontribuyente() {
        return ent_condicioncontribuyente;
    }

    public void setEnt_condicioncontribuyente(Boolean ent_condicioncontribuyente) {
        this.ent_condicioncontribuyente = ent_condicioncontribuyente;
    }

}
