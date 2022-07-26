/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.model.compras;

import com.garcal.erp.model.ErrorEntity;

/**
 *
 * @author usuario
 */
public class ComprobantescomprasEntregardineroPendiente {

    private String tra_nrodocumento;
    private Integer ccc_id;
    private String ccc_observaciones;
    private String usu_codigo;
    private Double ccc_total;
    private ErrorEntity errorEntity = null;

    public String getTra_nrodocumento() {
        return tra_nrodocumento;
    }

    public void setTra_nrodocumento(String tra_nrodocumento) {
        this.tra_nrodocumento = tra_nrodocumento;
    }

    public Integer getCcc_id() {
        return ccc_id;
    }

    public void setCcc_id(Integer ccc_id) {
        this.ccc_id = ccc_id;
    }

    public String getCcc_observaciones() {
        return ccc_observaciones;
    }

    public void setCcc_observaciones(String ccc_observaciones) {
        this.ccc_observaciones = ccc_observaciones;
    }

    public Double getCcc_total() {
        return ccc_total;
    }

    public void setCcc_total(Double ccc_total) {
        this.ccc_total = ccc_total;
    }

    public String getUsu_codigo() {
        return usu_codigo;
    }

    public void setUsu_codigo(String usu_codigo) {
        this.usu_codigo = usu_codigo;
    }

    public ErrorEntity getErrorEntity() {
        return errorEntity;
    }

    public void setErrorEntity(ErrorEntity errorEntity) {
        this.errorEntity = errorEntity;
    }

}
