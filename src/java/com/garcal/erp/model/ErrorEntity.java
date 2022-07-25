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
public class ErrorEntity {

    private String field = null;
    private String message = null;

    public ErrorEntity(String field, String message) {
        this.field = field;
        this.message = message;
    }

    public ErrorEntity() {
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
