/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.ventas;

import com.garcal.erp.DAO.util.Utility;
import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.ResponseAnswer;
import com.garcal.erp.model.ventas.ComprobantesVentasCobros;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.commons.dbutils.DbUtils;

/**
 *
 * @author User
 */
public class ComprobantesVentasCobrosDAO extends ConnectionDB {

    public static ResponseAnswer insert(ComprobantesVentasCobros comprobantesventascobros) {
        ResponseAnswer postResponse = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM caja.fun_comprobantesventascobros_insertar("
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "?  "
                    + " )";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, comprobantesventascobros.getEmp_id());
            varPst.setInt(2, comprobantesventascobros.getCvc_id());
            varPst.setString(3, comprobantesventascobros.getFdc_codigo());
            varPst.setDouble(4, comprobantesventascobros.getVec_monto());
            varPst.setString(5, comprobantesventascobros.getVec_nroreferencia());
            varPst.setDate(6, Utility.getStringToDate(comprobantesventascobros.getVec_fechacancelacion()));
            varPst.setString(7, comprobantesventascobros.getVec_descripcion());
            varPst.setString(8, comprobantesventascobros.getMon_codigo());
            varPst.setString(9, comprobantesventascobros.getVec_usucreacion());
            varPst.executeQuery();
            varPst.close();

            postResponse = new ResponseAnswer();
            postResponse.setStatus(Boolean.TRUE);
            postResponse.setMessage("insert full");

        } catch (SQLException e) {
            postResponse = new ResponseAnswer();
            postResponse.setStatus(Boolean.FALSE);
            postResponse.setMessage(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            postResponse = new ResponseAnswer();
            postResponse.setStatus(Boolean.FALSE);
            postResponse.setMessage("Exception " + e);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return postResponse;
        }

    }

}
