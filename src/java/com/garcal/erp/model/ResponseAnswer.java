/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.model;

/**
 *
 * @author Gloria Peralta <gloria.ypv@gmail.com>
 */
public class ResponseAnswer {

    private Boolean status = null;
    private String message = null;
    private Object error = null;
    private Integer idValue = null;
    private String idCode=null;
    private ErrorEntity errorEntity = null;
    private Integer ccc_idreferencia=null;

    public ResponseAnswer() {
    }

    public ResponseAnswer(Boolean status, Object error) {
        this.status = status;
        this.error = error;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getIdValue() {
        return idValue;
    }

    public void setIdValue(Integer idValue) {
        this.idValue = idValue;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    
    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }
    public void setCcc_idreferencia(Integer ccc_idreferencia) {
    this.ccc_idreferencia = ccc_idreferencia == 0 ? null : ccc_idreferencia;
}
}
