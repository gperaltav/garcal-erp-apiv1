/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.model.ventas;

import com.garcal.erp.model.ErrorEntity;
import java.sql.Date;

/**
 *
 * @author User
 */
public class Guias {
    
    private Integer emp_id;
    private String gui_fechaemision;//time
    private String gti_codigo;
    private String gui_serie;
    private String gui_numero;
    private Integer via_id;
    private Integer gui_entdestinatario;
    private Integer veh_id;
    private Integer veh_idacople;
    private Integer pro_id;
    private String gui_estado;
    private Double gui_peso;
    private String ubi_codigoorigen;
    private String ubi_codigodestino;
    private String gui_observacion;
    private String gui_usucreacion;
    private Integer gui_id;
    private String gui_serienumero;
    private Date gui_fechaemision_inicio;
    private Date gui_fechaemision_fin;
    
    private String gti_descripcion;
    private String emp_razonsocial;
    private String veh_placa;
    private String via_descripcion;
    
            
            
    
    private ErrorEntity errorEntity = null
            
            ;

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        
        this.emp_id = emp_id;
    }

    public String getGui_fechaemision() {
        return gui_fechaemision;
    }

    public void setGui_fechaemision(String gui_fechaemision) {
        this.gui_fechaemision = gui_fechaemision;
    }

   
    
    public String getGti_codigo() {
        return gti_codigo;
    }

    public void setGti_codigo(String gti_codigo) {
        this.gti_codigo = gti_codigo;
    }

    public String getGui_serie() {
        return gui_serie;
    }

    public void setGui_serie(String gui_serie) {
        this.gui_serie = gui_serie;
    }

    public String getGui_numero() {
        return gui_numero;
    }

    public void setGui_numero(String gui_numero) {
        this.gui_numero = gui_numero;
    }

    public Integer getVia_id() {
        return via_id;
    }

    public void setVia_id(Integer via_id){
        
        if(via_id==0){
            via_id=null;
        }
        this.via_id = via_id;
    }

    public Integer getGui_entdestinatario() {
        return gui_entdestinatario;
    }

    public void setGui_entdestinatario(Integer gui_entdestinatario) {
        
        if(gui_entdestinatario==0){
            gui_entdestinatario=null;
        }
        
        this.gui_entdestinatario = gui_entdestinatario;
    }

    public Integer getVeh_id() {
        return veh_id;
    }

    public void setVeh_id(Integer veh_id) {
        
        if(veh_id==0){
            veh_id=null;
        }
        this.veh_id = veh_id;
    }

    public Integer getVeh_idacople() {
        return veh_idacople;
    }

    public void setVeh_idacople(Integer veh_idacople) {
        this.veh_idacople = veh_idacople;
    }

    public Integer getPro_id() {
        return pro_id;
    }

    public void setPro_id(Integer pro_id) {
        
          if(pro_id==0){
            pro_id=null;
        }
        this.pro_id = pro_id;
    }

    public String getGui_estado() {
        return gui_estado;
    }

    public void setGui_estado(String gui_estado) {
        this.gui_estado = gui_estado;
    }

    public Double getGui_peso() {
        return gui_peso;
    }

    public void setGui_peso(Double gui_peso) {
        this.gui_peso = gui_peso;
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

    public String getGui_observacion() {
        return gui_observacion;
    }

    public void setGui_observacion(String gui_observacion) {
        this.gui_observacion = gui_observacion;
    }

    public String getGui_usucreacion() {
        return gui_usucreacion;
    }

    public void setGui_usucreacion(String gui_usucreacion) {
        this.gui_usucreacion = gui_usucreacion;
    }

    public Integer getGui_id() {
        return gui_id;
    }

    public void setGui_id(Integer gui_id) {
        this.gui_id = gui_id;
    }

    public String getGui_serienumero() {
        return gui_serienumero;
    }

    public void setGui_serienumero(String gui_serienumero) {
        this.gui_serienumero = gui_serienumero;
    }

    public Date getGui_fechaemision_inicio() {
        return gui_fechaemision_inicio;
    }

    public void setGui_fechaemision_inicio(Date gui_fechaemision_inicio) {
        this.gui_fechaemision_inicio = gui_fechaemision_inicio;
    }

    public Date getGui_fechaemision_fin() {
        return gui_fechaemision_fin;
    }

    public void setGui_fechaemision_fin(Date gui_fechaemision_fin) {
        this.gui_fechaemision_fin = gui_fechaemision_fin;
    }

    public String getGti_descripcion() {
        return gti_descripcion;
    }

    public void setGti_descripcion(String gti_descripcion) {
        this.gti_descripcion = gti_descripcion;
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

    public String getVia_descripcion() {
        return via_descripcion;
    }

    public void setVia_descripcion(String via_descripcion) {
        this.via_descripcion = via_descripcion;
    }
    

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }
    
    
    
}
