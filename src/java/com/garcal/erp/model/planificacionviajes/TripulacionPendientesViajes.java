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
public class TripulacionPendientesViajes {
    
    private Integer emp_id;
    private String tra_nrodocumento;
    private String tri_licencianro;
    private String tra_nombre;
    private Date via_fechaviaje;
    private String via_horaviaje;
    
    private Integer tri_id;

    private ErrorEntity errorEntity = null;

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getTra_nrodocumento() {
        return tra_nrodocumento;
    }

    public void setTra_nrodocumento(String tra_nrodocumento) {
        this.tra_nrodocumento = tra_nrodocumento;
    }

    public String getTri_licencianro() {
        return tri_licencianro;
    }

    public void setTri_licencianro(String tri_licencianro) {
        this.tri_licencianro = tri_licencianro;
    }

    public String getTra_nombre() {
        return tra_nombre;
    }

    public void setTra_nombre(String tra_nombre) {
        this.tra_nombre = tra_nombre;
    }

    public Integer getTri_id() {
        return tri_id;
    }

    public void setTri_id(Integer tri_id) {
        this.tri_id = tri_id;
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
