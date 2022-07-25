/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.model.planificacionviajes;

import com.garcal.erp.model.ErrorEntity;


/**
 *
 * @author usuario
 */
public class TripulacionOperarioDocumentos {
    
    private Integer emp_id;
    private String tra_nrodocumento;
    private String tri_licencianro;
    private String tra_nombre;
    private Integer tra_id;
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

    public Integer getTra_id() {
        return tra_id;
    }

    public void setTra_id(Integer tra_id) {
        this.tra_id = tra_id;
    }

   
    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }
    
    
}
