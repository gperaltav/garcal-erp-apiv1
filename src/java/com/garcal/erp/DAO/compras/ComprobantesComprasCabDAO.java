/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.compras;

import com.garcal.erp.DAO.util.Utility;
import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.ErrorEntity;
import com.garcal.erp.model.ResponseAnswer;
import com.garcal.erp.model.compras.ComprobantesComprasCab;
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
 * @author User
 */
public class ComprobantesComprasCabDAO extends ConnectionDB {

    public static ResponseAnswer insert(ComprobantesComprasCab comprobantesComprascab) {
        ResponseAnswer postResponse = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM compras.fun_comprobantescomprascab_insertarr("
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
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "?  "
                    + " )";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, comprobantesComprascab.getEmp_id());
            varPst.setInt(2, comprobantesComprascab.getEnt_id());
            varPst.setString(3, comprobantesComprascab.getCcc_serie());
            varPst.setString(4, comprobantesComprascab.getCcc_numero());
            varPst.setDate(5, Utility.getStringToDate(comprobantesComprascab.getCcc_fechaemision()));
            varPst.setDouble(6, comprobantesComprascab.getCcc_subtotal());
            varPst.setDouble(7, comprobantesComprascab.getCcc_impuesto());
            varPst.setDouble(8, comprobantesComprascab.getCcc_total());
            varPst.setString(9, comprobantesComprascab.getCct_codigo());
            varPst.setString(10, comprobantesComprascab.getCce_codigo());
            varPst.setString(11, comprobantesComprascab.getMon_codigo());
            varPst.setString(12, comprobantesComprascab.getCcc_observaciones());
            varPst.setObject(13, comprobantesComprascab.getCcc_idreferencia(), Types.INTEGER);
            varPst.setDouble(14, comprobantesComprascab.getCcc_tipocambio());
            varPst.setBoolean(15, comprobantesComprascab.getCcc_generamovimiento());
            varPst.setDate(16, Utility.getStringToDate(comprobantesComprascab.getCcc_fechaingreso()));
            varPst.setDate(17, Utility.getStringToDate(comprobantesComprascab.getCcc_periodoregistro()));
            varPst.setString(18, comprobantesComprascab.getUsu_codigo());
            varPst.setString(19, comprobantesComprascab.getCcc_usucreacion());
            varPst.setObject(20, comprobantesComprascab.getPro_id(), Types.INTEGER);
            varPst.setObject(21, comprobantesComprascab.getVia_id(), Types.INTEGER);
            varPst.setObject(22, comprobantesComprascab.getVeh_id(), Types.INTEGER);
            varPst.setObject(23, comprobantesComprascab.getTra_id(), Types.INTEGER);
            varPst.setString(24, comprobantesComprascab.getCcd_serie());
            varPst.setDouble(25, comprobantesComprascab.getCcd_cantidad());
            varPst.setDouble(26, comprobantesComprascab.getCcd_preciounitario());
            varPst.setDouble(27, comprobantesComprascab.getCcd_subtotal());
            varPst.setString(28, comprobantesComprascab.getUni_unidad());
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

    public static ResponseAnswer delete(Integer id) {
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        ResponseAnswer postResponse = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM  compras.fun_comprobantescomprascab_borrar(?,?)";
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

    public static ResponseAnswer update(ComprobantesComprasCab comprobantesComprascab) {
        ResponseAnswer postResponse = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM compras.fun_comprobantescompracab_actualizar ("
                    + "? ,"
                    + "?  "
                    + " )";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, comprobantesComprascab.getCcc_id());
            varPst.setString(2, comprobantesComprascab.getCce_codigo());
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
    
    public static ArrayList<ComprobantesComprasCab> selectAll(Integer id) {
        ArrayList<ComprobantesComprasCab> comprobantesComprascabArray = new ArrayList<ComprobantesComprasCab>();

        ComprobantesComprasCab comprobantesComprascab = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM compras.fun_comprobantescomprascab_get(?)";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, id);
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    comprobantesComprascab = new ComprobantesComprasCab();
                    comprobantesComprascab.setEmp_id(varResult.getInt("emp_id"));
                    comprobantesComprascab.setEnt_id(varResult.getInt("ent_id"));
                    comprobantesComprascab.setCcc_serie(varResult.getString("ccc_serie"));
                    comprobantesComprascab.setCcc_numero(varResult.getString("ccc_numero"));
                    comprobantesComprascab.setCcc_fechaemision(Utility.getDateToString(varResult.getDate("ccc_fechaemision")));
                    comprobantesComprascab.setCcc_subtotal(varResult.getDouble("ccc_subtotal"));
                    comprobantesComprascab.setCcc_impuesto(varResult.getDouble("ccc_impuesto"));
                    comprobantesComprascab.setCcc_total(varResult.getDouble("ccc_total"));
                    comprobantesComprascab.setCct_codigo(varResult.getString("cct_codigo"));
                    comprobantesComprascab.setCce_codigo(varResult.getString("cce_codigo"));
                    comprobantesComprascab.setMon_codigo(varResult.getString("mon_codigo"));
                    comprobantesComprascab.setCcc_observaciones(varResult.getString("ccc_observaciones"));
                    comprobantesComprascab.setCcc_idreferencia(varResult.getInt("ccc_idreferencia"));
                    comprobantesComprascab.setCcc_tipocambio(varResult.getDouble("ccc_tipocambio"));
                    comprobantesComprascab.setCcc_generamovimiento(varResult.getBoolean("ccc_generamovimiento"));
                    comprobantesComprascab.setCcc_fechaingreso(Utility.getDateToString(varResult.getDate("ccc_fechaingreso")));
                    comprobantesComprascab.setCcc_periodoregistro(Utility.getDateToString(varResult.getDate("ccc_periodoregistro")));
                    comprobantesComprascab.setUsu_codigo(varResult.getString("usu_codigo"));
                    comprobantesComprascab.setCcc_usucreacion(varResult.getString("ccc_usucreacion"));
                    comprobantesComprascab.setCcr_codigo(varResult.getString("ccr_codigo"));
                    comprobantesComprascab.setTra_id(varResult.getInt("tra_id"));
                    comprobantesComprascabArray.add(comprobantesComprascab);
                }
            }
        } catch (SQLException e) {
            comprobantesComprascab = new ComprobantesComprasCab();
            comprobantesComprascab.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            comprobantesComprascabArray.add(comprobantesComprascab);
            e.printStackTrace();
        } catch (Exception e) {
            comprobantesComprascab = new ComprobantesComprasCab();
            comprobantesComprascab.setErrorEntity(new ErrorEntity("Exception", "" + e));
            comprobantesComprascabArray.add(comprobantesComprascab);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return comprobantesComprascabArray;
        }
    }
    

}
