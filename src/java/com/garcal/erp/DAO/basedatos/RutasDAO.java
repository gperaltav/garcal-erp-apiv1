/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.basedatos;

import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.ErrorEntity;
import com.garcal.erp.model.ResponseAnswer;
import com.garcal.erp.model.basedatos.Rutas;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.apache.commons.dbutils.DbUtils;

/**
 *
 * @author User
 */
public class RutasDAO extends ConnectionDB {

    public static ResponseAnswer insert(Rutas rutas) {
        ResponseAnswer postResponse = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM operaciones.fun_rutas_insertar("
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "?  "
                    + " )";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setString(1, rutas.getRut_nombre());
            varPst.setInt(2, rutas.getNod_idorigen());
            varPst.setInt(3, rutas.getNod_iddestino());
            varPst.setString(4, rutas.getRut_usucreacion());
            varPst.setInt(5, rutas.getEmp_id());
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

    public static ResponseAnswer update(Rutas rutas) {
        ResponseAnswer postResponse = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM operaciones.fun_rutas_actualizar ("
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "?  "
                    + " )";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, rutas.getRut_id());
            varPst.setString(2, rutas.getRut_nombre());
            varPst.setInt(3, rutas.getNod_idorigen());
            varPst.setInt(4, rutas.getNod_iddestino());
            varPst.setString(5, rutas.getRut_usumodificacion());
            varPst.setInt(6, rutas.getEmp_id());
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

    public static ResponseAnswer delete(Integer id) {
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        ResponseAnswer postResponse = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM operaciones.fun_rutas_borrar(?)";
            System.out.println(varSql);

            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, id);
            varPst.execute();
            varPst.close();

            postResponse = new ResponseAnswer();
            postResponse.setStatus(Boolean.TRUE);
            postResponse.setMessage("delete full");

        } catch (SQLException e) {
            postResponse = new ResponseAnswer();
            postResponse.setStatus(Boolean.FALSE);
            postResponse.setMessage(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            postResponse = new ResponseAnswer();
            postResponse.setStatus(Boolean.FALSE);
            postResponse.setMessage(e.getMessage());
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return postResponse;
        }
    }

    public static ArrayList<Rutas> selectAll(Integer idEmpresa) {

        ArrayList<Rutas> rutasArray = new ArrayList<Rutas>();
        Rutas rutas = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM operaciones.fun_rutas_obtener_todo(?)";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, idEmpresa);
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    rutas = new Rutas();
                    rutas.setRut_id(varResult.getInt("rut_id"));
                    rutas.setRut_nombre(varResult.getString("rut_nombre"));
                    rutas.setNod_idorigen(varResult.getInt("nod_idorigen"));
                    rutas.setNod_iddestino(varResult.getInt("nod_iddestino"));
                    rutasArray.add(rutas);
                }
            }
        } catch (SQLException e) {
            rutas = new Rutas();
            rutas.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            rutasArray.add(rutas);
            e.printStackTrace();
        } catch (Exception e) {
            rutas = new Rutas();
            rutas.setErrorEntity(new ErrorEntity("Exception", "" + e));
            rutasArray.add(rutas);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return rutasArray;
        }
    }
    
 

}
