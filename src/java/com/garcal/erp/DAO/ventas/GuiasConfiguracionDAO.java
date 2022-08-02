/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.ventas;

import com.garcal.erp.DAO.util.Utility;
import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.ResponseAnswer;
import com.garcal.erp.model.ventas.GuiasConfiguracion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import org.apache.commons.dbutils.DbUtils;

/**
 *
 * @author usuario
 */
public class GuiasConfiguracionDAO extends ConnectionDB{
    
    public static ResponseAnswer insert(GuiasConfiguracion guiasconfiguracion) {
        ResponseAnswer postResponse = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM  ventas.fun_guiasconfiguracion_insertar("
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
            varPst.setInt(1, guiasconfiguracion.getEmp_id());
            varPst.setString(2, guiasconfiguracion.getGti_codigo());
            varPst.setString(3, guiasconfiguracion.getGco_serie());
            varPst.setInt(4, guiasconfiguracion.getVeh_id());
            varPst.setBoolean(5, guiasconfiguracion.getGco_activo());
            varPst.setInt(6, guiasconfiguracion.getGco_numeromin());
            varPst.setInt(7, guiasconfiguracion.getGco_numeromax());
            varPst.setString(8, guiasconfiguracion.getGco_usucreacion());
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
     public static ResponseAnswer update(GuiasConfiguracion guiasconfiguracion) {

        ResponseAnswer postResponse = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM ventas.fun_guiasconfiguracion_actualizar("
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
            varPst.setInt(1, guiasconfiguracion.getGco_id());
            varPst.setInt(2, guiasconfiguracion.getEmp_id());
            varPst.setString(3, guiasconfiguracion.getGti_codigo());
            varPst.setString(4, guiasconfiguracion.getGco_serie());
            varPst.setInt(5, guiasconfiguracion.getVeh_id());
            varPst.setBoolean(6, guiasconfiguracion.getGco_activo());
            varPst.setInt(7, guiasconfiguracion.getGco_numeromin());
            varPst.setInt(8, guiasconfiguracion.getGco_numeromax());
            varPst.setString(9, guiasconfiguracion.getGco_usucreacion());
            varPst.executeQuery();
            varPst.close();

            postResponse = new ResponseAnswer();
            postResponse.setStatus(Boolean.TRUE);
            postResponse.setMessage("update full");

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
