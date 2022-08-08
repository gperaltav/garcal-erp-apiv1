/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.basedatos;

import com.garcal.erp.DAO.util.Utility;
import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.ErrorEntity;
import com.garcal.erp.model.ResponseAnswer;
import com.garcal.erp.model.basedatos.Tripulacion;
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
public class TripulacionDAO extends ConnectionDB {

    public static ResponseAnswer insert(Tripulacion tripulacion) {
        ResponseAnswer postResponse = null;

        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM operaciones.fun_tripulacion_insertar ("
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? "
                    + " )";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, tripulacion.getTra_id());
            varPst.setString(2, tripulacion.getTri_licenciacategoria());
            varPst.setString(3, tripulacion.getTri_licencianro());
            varPst.setString(4, tripulacion.getTri_especialidad());
            varPst.setDate(5, Utility.getStringToDate(tripulacion.getTri_licenciafechavencimiento()));
            varPst.setBoolean(6, tripulacion.getTri_inscritossunatiqbf());
            varPst.setString(7, tripulacion.getTri_usucreacion());
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

    public static ResponseAnswer update(Tripulacion tripulacion) {
        ResponseAnswer postResponse = null;

        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM operaciones.fun_tripulacion_actualizar ("
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? "
                    + " )";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, tripulacion.getTra_id());
            varPst.setString(2, tripulacion.getTri_licenciacategoria());
            varPst.setString(3, tripulacion.getTri_licencianro());
            varPst.setString(4, tripulacion.getTri_especialidad());
            varPst.setDate(5, Utility.getStringToDate(tripulacion.getTri_licenciafechavencimiento()));
            varPst.setBoolean(6, tripulacion.getTri_inscritossunatiqbf());
            varPst.setString(7, tripulacion.getTri_usumodificacion());
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
            String varSql = " SELECT * FROM operaciones.fun_tripulacion_borrar(?)";
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

    public static ArrayList<Tripulacion> selectID(Integer idTrabajador) {
        ArrayList<Tripulacion> tripulacionArray = new ArrayList<Tripulacion>();
        Tripulacion tripulacion = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM operaciones.fun_tripulacion_obtener(?)";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, idTrabajador);
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    tripulacion = new Tripulacion();
                    tripulacion.setTra_id(varResult.getInt("tra_id"));
                    tripulacion.setTri_licenciacategoria(varResult.getString("tri_licenciacategoria"));
                    tripulacion.setTri_licencianro(varResult.getString("tri_licencianro"));
                    tripulacion.setTri_especialidad(varResult.getString("tri_especialidad"));
                    tripulacion.setTri_licenciafechavencimiento(Utility.getDateToString(varResult.getDate("tri_licenciafechavencimiento")));
                    tripulacion.setTri_inscritossunatiqbf(varResult.getBoolean("tri_inscritossunatiqbf"));
                    tripulacionArray.add(tripulacion);
                }
            }
        } catch (SQLException e) {
            tripulacion = new Tripulacion();
            tripulacion.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            tripulacionArray.add(tripulacion);
            e.printStackTrace();
        } catch (Exception e) {
            tripulacion = new Tripulacion();
            tripulacion.setErrorEntity(new ErrorEntity("Exception", "" + e));
            tripulacionArray.add(tripulacion);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return tripulacionArray;
        }
    }

}
