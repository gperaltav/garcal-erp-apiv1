/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.ventas;

import com.garcal.erp.DAO.util.Utility;
import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.ErrorEntity;
import com.garcal.erp.model.ResponseAnswer;
import com.garcal.erp.model.ventas.GuiasConfiguracion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
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
     
     public static ArrayList<GuiasConfiguracion> selectAll(Integer id) {

        ArrayList<GuiasConfiguracion> guiasconfiguracionArray = new ArrayList<GuiasConfiguracion>();
        GuiasConfiguracion guiasconfiguracion = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM ventas.fun_guiasconfiguracion_obtener(?)";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, id);
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    guiasconfiguracion = new GuiasConfiguracion();
                    guiasconfiguracion.setEmp_id(varResult.getInt("emp_id"));
                    guiasconfiguracion.setGti_codigo(varResult.getString("gti_codigo"));
                    guiasconfiguracion.setGco_serie(varResult.getString("gco_serie"));
                    guiasconfiguracion.setVeh_id(varResult.getInt("veh_id"));
                    guiasconfiguracion.setGco_activo(varResult.getBoolean("gco_activo"));
                    guiasconfiguracion.setGco_numeromin(varResult.getInt("gco_numeromin"));
                    guiasconfiguracion.setGco_numeromax(varResult.getInt("gco_numeromax"));
                    guiasconfiguracion.setGco_usucreacion(varResult.getString("gco_usucreacion"));
                    guiasconfiguracionArray.add(guiasconfiguracion);
                }
            }
        } catch (SQLException e) {
            guiasconfiguracion = new GuiasConfiguracion();
            guiasconfiguracion.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            guiasconfiguracionArray.add(guiasconfiguracion);
            e.printStackTrace();
        } catch (Exception e) {
            guiasconfiguracion = new GuiasConfiguracion();
            guiasconfiguracion.setErrorEntity(new ErrorEntity("Exception", "" + e));
            guiasconfiguracionArray.add(guiasconfiguracion);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return guiasconfiguracionArray;
        }
    }
    
     public static ArrayList<GuiasConfiguracion> select(GuiasConfiguracion guiasconfiguracion) {

        ArrayList<GuiasConfiguracion> guiasconfiguracionArray = new ArrayList<GuiasConfiguracion>();

        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM ventas.fun_guiasconfiguracion_obtener_filtro(?)";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setString(1, guiasconfiguracion.getVeh_placa());
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    guiasconfiguracion = new GuiasConfiguracion();
                    guiasconfiguracion.setGco_id(varResult.getInt("gco_id"));
                    guiasconfiguracion.setEmp_id(varResult.getInt("emp_id"));
                     guiasconfiguracion.setGti_codigo(varResult.getString("gti_codigo"));
                    guiasconfiguracion.setGco_serie(varResult.getString("gco_serie"));
                    guiasconfiguracion.setVeh_id(varResult.getInt("veh_id"));
                    guiasconfiguracion.setGco_activo(varResult.getBoolean("gco_activo"));
                    guiasconfiguracion.setGco_numeromin(varResult.getInt("gco_numeromin"));
                    guiasconfiguracion.setGco_numeromax(varResult.getInt("gco_numeromax"));
                    guiasconfiguracion.setGco_usucreacion(varResult.getString("gco_usucreacion"));
                    guiasconfiguracionArray.add(guiasconfiguracion);
                }
            }
        } catch (SQLException e) {
            guiasconfiguracion = new GuiasConfiguracion();
            guiasconfiguracion.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            guiasconfiguracionArray.add(guiasconfiguracion);
            e.printStackTrace();
        } catch (Exception e) {
            guiasconfiguracion = new GuiasConfiguracion();
            guiasconfiguracion.setErrorEntity(new ErrorEntity("Exception", "" + e));
            guiasconfiguracionArray.add(guiasconfiguracion);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return guiasconfiguracionArray;
        }
    }
    
    
    
}
