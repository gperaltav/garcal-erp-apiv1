/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.basedatos;

import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.ErrorEntity;
import com.garcal.erp.model.ResponseAnswer;
import com.garcal.erp.model.basedatos.Vehiculos;
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
public class VehiculosDAO extends ConnectionDB {

    public static ResponseAnswer insert(Vehiculos vehiculos) {
        ResponseAnswer postResponse = null;

        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM operaciones.fun_vehiculos_insertar ("
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
                    + "? "
                    + " )";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, vehiculos.getEmp_id());
            varPst.setString(2, vehiculos.getVeh_placa());
            varPst.setInt(3, vehiculos.getVma_id());
            varPst.setInt(4, vehiculos.getVmo_id());
            varPst.setString(5, vehiculos.getVti_id());
            varPst.setString(6, vehiculos.getVcl_id());
            varPst.setInt(7, vehiculos.getVeh_anno());
            varPst.setString(8, vehiculos.getVeh_usucreacion());
            varPst.setString(9, vehiculos.getVeh_serie());
            varPst.setString(10, vehiculos.getVeh_mtc());
            varPst.setDouble(11, vehiculos.getVeh_cargautil());
            varPst.setDouble(12, vehiculos.getVeh_kilometraje());
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

    public static ResponseAnswer update(Vehiculos vehiculos) {
        ResponseAnswer postResponse = null;

        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM operaciones.fun_vehiculos_actualizar ("
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
                    + "? "
                    + " )";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, vehiculos.getVeh_id());
            varPst.setString(2, vehiculos.getVeh_placa());
            varPst.setInt(3, vehiculos.getVma_id());
            varPst.setInt(4, vehiculos.getVmo_id());
            varPst.setString(5, vehiculos.getVti_id());
            varPst.setString(6, vehiculos.getVcl_id());
            varPst.setInt(7, vehiculos.getVeh_anno());
            varPst.setString(8, vehiculos.getVeh_usucreacion());
            varPst.setString(9, vehiculos.getVeh_serie());
            varPst.setString(10, vehiculos.getVeh_mtc());
            varPst.setDouble(11, vehiculos.getVeh_cargautil());
            varPst.setDouble(12, vehiculos.getVeh_kilometraje());
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
            String varSql = " SELECT * FROM operaciones.fun_vehiculos_borrar(?)";
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

    public static ArrayList<Vehiculos> selectID(Integer idTrabajador) {
        ArrayList<Vehiculos> vehiculosArray = new ArrayList<Vehiculos>();
        Vehiculos vehiculos = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM operaciones.fun_vehiculos_obtener(?)";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, idTrabajador);
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    vehiculos = new Vehiculos();
                    vehiculos.setVeh_id(varResult.getInt("veh_id"));
                    vehiculos.setEmp_id(varResult.getInt("emp_id"));
                    vehiculos.setVeh_placa(varResult.getString("veh_placa"));
                    vehiculos.setVma_id(varResult.getInt("vma_id"));
                    vehiculos.setVmo_id(varResult.getInt("vmo_id"));
                    vehiculos.setVti_id(varResult.getString("vti_id"));
                    vehiculos.setVcl_id(varResult.getString("vcl_id"));
                    vehiculos.setVeh_anno(varResult.getInt("veh_anno"));
                    vehiculos.setVeh_serie(varResult.getString("veh_serie"));
                    vehiculos.setVeh_mtc(varResult.getString("veh_mtc"));
                    vehiculos.setVeh_cargautil(varResult.getDouble("veh_cargautil"));
                    vehiculos.setVeh_kilometraje(varResult.getDouble("veh_kilometraje"));
                    vehiculosArray.add(vehiculos);
                }
            }
        } catch (SQLException e) {
            vehiculos = new Vehiculos();
            vehiculos.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            vehiculosArray.add(vehiculos);
            e.printStackTrace();
        } catch (Exception e) {
            vehiculos = new Vehiculos();
            vehiculos.setErrorEntity(new ErrorEntity("Exception", "" + e));
            vehiculosArray.add(vehiculos);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return vehiculosArray;
        }
    }

    public static ArrayList<Vehiculos> selectFilter(Vehiculos vehiculos) {
        ArrayList<Vehiculos> vehiculosArray = new ArrayList<Vehiculos>();
        // Trabajadores trabajadores = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM operaciones.fun_vehiculos_obtener_filtro("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ")";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, vehiculos.getEmp_id());
            varPst.setString(2, vehiculos.getVeh_placa());
            varPst.setString(3, vehiculos.getVma_nombre());
            varPst.setString(4, vehiculos.getVmo_nombre());
            varPst.setInt(5, vehiculos.getVeh_anno_inicio());
            varPst.setInt(6, vehiculos.getVeh_anno_fin());

            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    vehiculos = new Vehiculos();
                    vehiculos.setVeh_id(varResult.getInt("veh_id"));
                    vehiculos.setEmp_razonsocial(varResult.getString("emp_razonsocial"));
                    vehiculos.setVeh_placa(varResult.getString("veh_placa"));
                    vehiculos.setVcl_nombre(varResult.getString("vcl_nombre"));
                    vehiculos.setVti_nombre(varResult.getString("vti_nombre"));
                    vehiculos.setVma_nombre(varResult.getString("vma_nombre"));
                    vehiculos.setVmo_nombre(varResult.getString("vmo_nombre"));
                    vehiculos.setVeh_anno(varResult.getInt("veh_anno"));
                    vehiculos.setVeh_serie(varResult.getString("veh_serie"));
                    vehiculos.setVeh_mtc(varResult.getString("veh_mtc"));
                    vehiculos.setVeh_cargautil(varResult.getDouble("veh_cargautil"));
                    vehiculos.setVeh_kilometraje(varResult.getDouble("veh_kilometraje"));
                    vehiculosArray.add(vehiculos);
                }

            }

        } catch (SQLException e) {
            vehiculos = new Vehiculos();
            vehiculos.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            vehiculosArray.add(vehiculos);
            e.printStackTrace();
        } catch (Exception e) {
            vehiculos = new Vehiculos();
            vehiculos.setErrorEntity(new ErrorEntity("Exception", "" + e));
            vehiculosArray.add(vehiculos);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return vehiculosArray;
        }

    }

    public static ArrayList<Vehiculos> selectAll() {
        Vehiculos vehiculos = new Vehiculos();
        vehiculos.setEmp_id(0);
        vehiculos.setVeh_placa("");
        vehiculos.setVma_nombre("");
        vehiculos.setVmo_nombre("");
        vehiculos.setVeh_anno_inicio(0);
        vehiculos.setVeh_anno_fin(0);

        return selectFilter(vehiculos);

    }
}
