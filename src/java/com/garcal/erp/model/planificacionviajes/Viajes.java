/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.model.planificacionviajes;

import com.garcal.erp.model.ErrorEntity;

/**
 *
 * @author User
 */
public class Viajes {

    private Integer via_id;
    private Integer emp_id;
    private Integer rut_id;
    private Integer veh_idtracto;//veh_idtracto veh_id
    private Integer veh_idremolque; //veh_idremolque ves_id
    private Integer ent_id;
    private Integer via_serie;
    private Integer via_numero;

    private String via_fechaviaje;
    private String via_horaviaje;

    private Double via_subtotal;
    private Double via_impuesto;
    private Double via_total;
    private String via_observacion;
    private String via_usucreacion;
    private String via_usumodificacion;

    private String via_fechaviajeinicio;
    private String via_fechaviajefin;

    private String veh_placa;
    private String rut_nombre;

    private String emp_razonsocial;
    private String via_ordenservicio;
    private String veh_semiremolque;
    private String veh_tracto;
    private String veh_conductor;
    private String ubi_codigoorigen;
    private String ubi_codigodestino;
    private String ubi_nombreorigen;
    private String ubi_nombredestino;

    private String vie_codigo;
    private String vfl_codigo;
    private String vfl_nombre;
    private Integer tri_id;
    private Integer pro_id;

    private String veh_acople;
    private String veh_flete;
    private String origen_nombre;
    private String origen_destino;
    private String pro_descripcion;
    private String ent_nrodocumento;
    private String ent_nombre;
    private String via_descripcion;

    private String tri_licencianro;
    private Double via_cantidad;
    private String vie_nombre;

    private ErrorEntity errorEntity = null;

    public Integer getVia_id() {
        return via_id;
    }

    public void setVia_id(Integer via_id) {
        this.via_id = via_id;
    }

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public Integer getRut_id() {
        return rut_id;
    }

    public void setRut_id(Integer rut_id) {
        this.rut_id = rut_id;
    }

    public Integer getVeh_idtracto() {
        return veh_idtracto;
    }

    public void setVeh_idtracto(Integer veh_idtracto) {
        this.veh_idtracto = veh_idtracto;
    }

    public Integer getVeh_idremolque() {
        return veh_idremolque;
    }

    public void setVeh_idremolque(Integer veh_idremolque) {
        this.veh_idremolque = veh_idremolque;
    }

    public Integer getEnt_id() {
        return ent_id;
    }

    public void setEnt_id(Integer ent_id) {
        this.ent_id = ent_id;
    }

    public Integer getVia_serie() {
        return via_serie;
    }

    public void setVia_serie(Integer via_serie) {
        this.via_serie = via_serie;
    }

    public Integer getVia_numero() {
        return via_numero;
    }

    public void setVia_numero(Integer via_numero) {
        this.via_numero = via_numero;
    }

    public String getVia_fechaviaje() {
        return via_fechaviaje;
    }

    public void setVia_fechaviaje(String via_fechaviaje) {
        this.via_fechaviaje = via_fechaviaje;
    }

    public String getVia_horaviaje() {
        return via_horaviaje;
    }

    public void setVia_horaviaje(String via_horaviaje) {
        this.via_horaviaje = via_horaviaje;
    }

    public Double getVia_subtotal() {
        return via_subtotal;
    }

    public void setVia_subtotal(Double via_subtotal) {
        this.via_subtotal = via_subtotal;
    }

    public Double getVia_impuesto() {
        return via_impuesto;
    }

    public void setVia_impuesto(Double via_impuesto) {
        this.via_impuesto = via_impuesto;
    }

    public Double getVia_total() {
        return via_total;
    }

    public void setVia_total(Double via_total) {
        this.via_total = via_total;
    }

    public String getVia_observacion() {
        return via_observacion;
    }

    public void setVia_observacion(String via_observacion) {
        this.via_observacion = via_observacion;
    }

    public String getVia_usucreacion() {
        return via_usucreacion;
    }

    public void setVia_usucreacion(String via_usucreacion) {
        this.via_usucreacion = via_usucreacion;
    }

    public String getVia_usumodificacion() {
        return via_usumodificacion;
    }

    public void setVia_usumodificacion(String via_usumodificacion) {
        this.via_usumodificacion = via_usumodificacion;
    }

    public String getVia_fechaviajeinicio() {
        return via_fechaviajeinicio;
    }

    public void setVia_fechaviajeinicio(String via_fechaviajeinicio) {
        this.via_fechaviajeinicio = via_fechaviajeinicio;
    }

    public String getVia_fechaviajefin() {
        return via_fechaviajefin;
    }

    public void setVia_fechaviajefin(String via_fechaviajefin) {
        this.via_fechaviajefin = via_fechaviajefin;
    }

    public String getVeh_placa() {
        return veh_placa;
    }

    public void setVeh_placa(String veh_placa) {
        this.veh_placa = veh_placa;
    }

    public String getRut_nombre() {
        return rut_nombre;
    }

    public void setRut_nombre(String rut_nombre) {
        this.rut_nombre = rut_nombre;
    }

    public String getEmp_razonsocial() {
        return emp_razonsocial;
    }

    public void setEmp_razonsocial(String emp_razonsocial) {
        this.emp_razonsocial = emp_razonsocial;
    }

    public String getVia_ordenservicio() {
        return via_ordenservicio;
    }

    public void setVia_ordenservicio(String via_ordenservicio) {
        this.via_ordenservicio = via_ordenservicio;
    }

    public String getVeh_semiremolque() {
        return veh_semiremolque;
    }

    public void setVeh_semiremolque(String veh_semiremolque) {
        this.veh_semiremolque = veh_semiremolque;
    }

    public String getVeh_tracto() {
        return veh_tracto;
    }

    public void setVeh_tracto(String veh_tracto) {
        this.veh_tracto = veh_tracto;
    }

    public String getVeh_conductor() {
        return veh_conductor;
    }

    public void setVeh_conductor(String veh_conductor) {
        this.veh_conductor = veh_conductor;
    }

    public String getUbi_codigoorigen() {
        return ubi_codigoorigen;
    }

    public void setUbi_codigoorigen(String ubi_codigoorigen) {
        this.ubi_codigoorigen = ubi_codigoorigen;
    }

    public String getUbi_codigodestino() {
        return ubi_codigodestino;
    }

    public void setUbi_codigodestino(String ubi_codigodestino) {
        this.ubi_codigodestino = ubi_codigodestino;
    }

    public String getVie_codigo() {
        return vie_codigo;
    }

    public void setVie_codigo(String vie_codigo) {
        this.vie_codigo = vie_codigo;
    }

    public String getVfl_codigo() {
        return vfl_codigo;
    }

    public void setVfl_codigo(String vfl_codigo) {
        this.vfl_codigo = vfl_codigo;
    }

    public String getVfl_nombre() {
        return vfl_nombre;
    }

    public void setVfl_nombre(String vfl_nombre) {
        this.vfl_nombre = vfl_nombre;
    }

    public Integer getTri_id() {
        return tri_id;
    }

    public void setTri_id(Integer tri_id) {
        this.tri_id = tri_id;
    }

    public Integer getPro_id() {
        return pro_id;
    }

    public void setPro_id(Integer pro_id) {
        this.pro_id = pro_id;
    }

    public String getUbi_nombreorigen() {
        return ubi_nombreorigen;
    }

    public void setUbi_nombreorigen(String ubi_nombreorigen) {
        this.ubi_nombreorigen = ubi_nombreorigen;
    }

    public String getUbi_nombredestino() {
        return ubi_nombredestino;
    }

    public void setUbi_nombredestino(String ubi_nombredestino) {
        this.ubi_nombredestino = ubi_nombredestino;
    }

    public String getVeh_acople() {
        return veh_acople;
    }

    public void setVeh_acople(String veh_acople) {
        this.veh_acople = veh_acople;
    }

    public String getVeh_flete() {
        return veh_flete;
    }

    public void setVeh_flete(String veh_flete) {
        this.veh_flete = veh_flete;
    }

    public String getOrigen_nombre() {
        return origen_nombre;
    }

    public void setOrigen_nombre(String origen_nombre) {
        this.origen_nombre = origen_nombre;
    }

    public String getOrigen_destino() {
        return origen_destino;
    }

    public void setOrigen_destino(String origen_destino) {
        this.origen_destino = origen_destino;
    }

    public String getPro_descripcion() {
        return pro_descripcion;
    }

    public void setPro_descripcion(String pro_descripcion) {
        this.pro_descripcion = pro_descripcion;
    }

    public String getEnt_nrodocumento() {
        return ent_nrodocumento;
    }

    public void setEnt_nrodocumento(String ent_nrodocumento) {
        this.ent_nrodocumento = ent_nrodocumento;
    }

    public String getEnt_nombre() {
        return ent_nombre;
    }

    public void setEnt_nombre(String ent_nombre) {
        this.ent_nombre = ent_nombre;
    }

    public String getVia_descripcion() {
        return via_descripcion;
    }

    public void setVia_descripcion(String via_descripcion) {
        this.via_descripcion = via_descripcion;
    }

    public String getTri_licencianro() {
        return tri_licencianro;
    }

    public void setTri_licencianro(String tri_licencianro) {
        this.tri_licencianro = tri_licencianro;
    }

    public Double getVia_cantidad() {
        return via_cantidad;
    }

    public void setVia_cantidad(Double via_cantidad) {
        this.via_cantidad = via_cantidad;
    }

    public String getVie_nombre() {
        return vie_nombre;
    }

    public void setVie_nombre(String vie_nombre) {
        this.vie_nombre = vie_nombre;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }

}
