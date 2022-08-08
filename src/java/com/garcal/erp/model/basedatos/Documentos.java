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
public class Documentos {

    private Integer emp_id;
    private String dti_referencia_uso;

    private String dti_id;
    private String dti_nombre;

    private ErrorEntity errorEntity = null;

    public String getDti_id() {
        return dti_id;
    }

    public void setDti_id(String dti_id) {
        this.dti_id = dti_id;
    }

    public String getDti_nombre() {
        return dti_nombre;
    }

    public void setDti_nombre(String dti_nombre) {
        this.dti_nombre = dti_nombre;
    }

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getDti_referencia_uso() {
        return dti_referencia_uso;
    }

    public void setDti_referencia_uso(String dti_referencia_uso) {
        this.dti_referencia_uso = dti_referencia_uso;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }

}
