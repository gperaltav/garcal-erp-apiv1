/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.compras;

import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.ResponseAnswer;
import com.garcal.erp.model.compras.ComprobantesComprasDet;
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
public class ComprobantesComprasDetDAO extends ConnectionDB{
    
    public static ResponseAnswer insert(ComprobantesComprasDet comprobantescomprasdet) {
        ResponseAnswer postResponse = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM compras.fun_comprobantescomprasdet_insertar("
                    + "? ,"
                    + "? ,"
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
            varPst.setInt(1, comprobantescomprasdet.getEmp_id());
            varPst.setInt(2, comprobantescomprasdet.getCcc_id());
            varPst.setObject(3, null);
            varPst.setObject(4, null);
            varPst.setObject(5, null);
            varPst.setObject(6, null);
            varPst.setString(7, comprobantescomprasdet.getCcd_serie());
            varPst.setDouble(8, comprobantescomprasdet.getCcd_cantidad());
            varPst.setDouble(9, comprobantescomprasdet.getCcd_preciounitario());
            varPst.setDouble(10, comprobantescomprasdet.getCcd_subtotal());
            varPst.setString(11, comprobantescomprasdet.getUni_unidad());
            varPst.setString(12, comprobantescomprasdet.getCcd_usucreacion());
          
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
