/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.mantenimiento;

import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.ErrorEntity;
import com.garcal.erp.model.ResponseAnswer;
import com.garcal.erp.model.mantenimiento.PreventivoPlantilla;
import com.garcal.erp.model.mantenimiento.Tareas;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.apache.commons.dbutils.DbUtils;

/**
 *
 * @author Teresa
 */
public class TareasDAO extends ConnectionDB{
    
    public static ResponseAnswer insert(Tareas tareas) {
        ResponseAnswer postResponse = null;
        String nroServicio = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM mantenimiento.fun_tareas_insertar("
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "?  "
                    + " )";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, tareas.getEmp_id());
            varPst.setString(2, tareas.getTar_codigo());
            varPst.setString(3, tareas.getTar_descripcion());
            varPst.setString(4, tareas.getTar_usucreacion());
            varPst.executeQuery();
            varPst.close();

            postResponse = new ResponseAnswer();
            postResponse.setStatus(Boolean.TRUE);
            postResponse.setMessage("insert full");
            postResponse.setIdCode(nroServicio);

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

    public static ResponseAnswer update(Tareas tareas) {
        ResponseAnswer postResponse = null;

        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM mantenimiento.fun_tareas_actualizar("
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "?  "
                    + " )";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, tareas.getTar_id());
            varPst.setInt(2, tareas.getEmp_id());
            varPst.setString(3, tareas.getTar_codigo());
            varPst.setString(4, tareas.getTar_descripcion());
            varPst.setString(5, tareas.getTar_usucreacion());
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
            String varSql = "SELECT * FROM mantenimiento.fun_tareas_borrar(?)";
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

    public static ArrayList<Tareas> selectID(Integer idtar) {
        ArrayList<Tareas> tareasArray = new ArrayList<Tareas>();
        Tareas tareas = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM mantenimiento.fun_tareas_obtener(?)";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, idtar);
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    tareas = new Tareas();
                    tareas.setEmp_id(varResult.getInt("emp_id"));
                    tareas.setTar_codigo(varResult.getString("tar_codigo"));
                    tareas.setTar_descripcion(varResult.getString("tar_descripcion"));
                    tareas.setTar_activo(varResult.getBoolean("tar_activo"));
                    tareas.setTar_usucreacion(varResult.getString("tar_usucreacion"));
                    tareasArray.add(tareas);

                }
            }
        } catch (SQLException e) {
            tareas = new Tareas();
            tareas.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            tareasArray.add(tareas);
            e.printStackTrace();
        } catch (Exception e) {
            tareas = new Tareas();
            tareas.setErrorEntity(new ErrorEntity("Exception", "" + e));
            tareasArray.add(tareas);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return tareasArray;
        }
    }
     public static ArrayList<Tareas> selectFiltro(Tareas tareas) {
        ArrayList<Tareas> tareasArray = new ArrayList<Tareas>();

        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM mantenimiento.fun_tareas_filtro(?)";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setString(1, tareas.getTar_descripcion());
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    tareas = new Tareas();
                    tareas.setTar_id(varResult.getInt("tar_id"));
                    tareas.setEmp_id(varResult.getInt("emp_id"));
                    tareas.setTar_codigo(varResult.getString("tar_codigo"));
                    tareas.setTar_descripcion(varResult.getString("tar_descripcion"));
                    tareas.setTar_activo(varResult.getBoolean("tar_activo"));
                    tareas.setTar_usucreacion(varResult.getString("tar_usucreacion"));
                    tareasArray.add(tareas); 
                }

            }

        } catch (SQLException e) {
            tareas = new Tareas();
            tareas.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            tareasArray.add(tareas);
            e.printStackTrace();
        } catch (Exception e) {
            tareas = new Tareas();
            tareas.setErrorEntity(new ErrorEntity("Exception", "" + e));
            tareasArray.add(tareas);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return tareasArray;
        }
    }
}
