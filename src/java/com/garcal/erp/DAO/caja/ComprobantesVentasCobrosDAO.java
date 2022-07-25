/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.caja;

import com.garcal.erp.DAO.util.Utility;
import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.ErrorEntity;
import com.garcal.erp.model.ResponseAnswer;
import com.garcal.erp.model.caja.ComprobantesVentasCobros;


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
public class ComprobantesVentasCobrosDAO extends ConnectionDB{
    
    public static ResponseAnswer insert(ComprobantesVentasCobros comprobantesVentasCobros) {
        ResponseAnswer postResponse = null;
        String nroServicio = null;
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
            varPst.setInt(1, comprobantesVentasCobros.getEmp_id());
            varPst.setInt(2, comprobantesVentasCobros.getCvc_id());
            varPst.setString(3, comprobantesVentasCobros.getFdc_codigo());
            varPst.setDouble(4, comprobantesVentasCobros.getVec_monto());
            varPst.setString(5, comprobantesVentasCobros.getVec_nroreferencia());
            varPst.setDate(6, Utility.getStringToDate(comprobantesVentasCobros.getVec_fechacancelacion()));
            varPst.setString(7, comprobantesVentasCobros.getVec_descripcion());
             varPst.setDouble(8, comprobantesVentasCobros.getVec_tipocambio());
            varPst.setString(9, comprobantesVentasCobros.getMon_codigo());
            varPst.setString(10, comprobantesVentasCobros.getVec_usucreacion());
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
   
    public static ResponseAnswer update(ComprobantesVentasCobros comprobantesVentasCobros ) {
        ResponseAnswer postResponse = null;

        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM caja.fun_comprobantesventascobros_actualizar("
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
                    + " ) ";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
             varPst.setInt(1, comprobantesVentasCobros.getVec_id());
            varPst.setInt(2, comprobantesVentasCobros.getEmp_id());
            varPst.setInt(3, comprobantesVentasCobros.getCvc_id());
            varPst.setString(4, comprobantesVentasCobros.getFdc_codigo());
            varPst.setDouble(5, comprobantesVentasCobros.getVec_monto());
            varPst.setString(6, comprobantesVentasCobros.getVec_nroreferencia());
            varPst.setDate(7, Utility.getStringToDate(comprobantesVentasCobros.getVec_fechacancelacion()));
            varPst.setString(8, comprobantesVentasCobros.getVec_descripcion());
            varPst.setDouble(9, comprobantesVentasCobros.getVec_tipocambio());
            varPst.setString(10, comprobantesVentasCobros.getMon_codigo());
            varPst.setString(11, comprobantesVentasCobros.getVec_usucreacion());
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
            String varSql = "SELECT * FROM caja.fun_comprobantesventascobros_borrar(?)";
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
    
    public static ArrayList<ComprobantesVentasCobros> selectID(Integer idvec) {
        ArrayList<ComprobantesVentasCobros> comprobantesVentasCobrosArray = new ArrayList<ComprobantesVentasCobros>();
        ComprobantesVentasCobros  comprobantesVentasCobros= null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM caja.fun_comprobantesventascobros_obtener_todo(?)";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, idvec);
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    comprobantesVentasCobros = new ComprobantesVentasCobros();
                    comprobantesVentasCobros.setEmp_id(varResult.getInt("emp_id"));
                    comprobantesVentasCobros.setCvc_id(varResult.getInt("cvc_id"));
                    comprobantesVentasCobros.setFdc_codigo(varResult.getString("fdc_codigo"));
                    comprobantesVentasCobros.setVec_monto(varResult.getDouble("vec_monto"));
                    comprobantesVentasCobros.setVec_nroreferencia(varResult.getString("vec_nroreferencia"));
                    comprobantesVentasCobros.setVec_fechacancelacion(Utility.getDateToString(varResult.getDate("vec_fechacancelacion")));
                    comprobantesVentasCobros.setVec_descripcion(varResult.getString("vec_descripcion"));
                    comprobantesVentasCobros.setMon_codigo(varResult.getString("mon_codigo"));
                    comprobantesVentasCobros.setVia_descripcion(varResult.getString("via_descripcion"));
                    comprobantesVentasCobros.setVec_usucreacion(varResult.getString("vec_usucreacion"));
                    comprobantesVentasCobrosArray.add(comprobantesVentasCobros);
                }
            }
        } catch (SQLException e) {
            comprobantesVentasCobros = new ComprobantesVentasCobros();
            comprobantesVentasCobros.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            comprobantesVentasCobrosArray.add(comprobantesVentasCobros);
            e.printStackTrace();
        } catch (Exception e) {
            comprobantesVentasCobros = new ComprobantesVentasCobros();
            comprobantesVentasCobros.setErrorEntity(new ErrorEntity("Exception", "" + e));
            comprobantesVentasCobrosArray.add(comprobantesVentasCobros);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return comprobantesVentasCobrosArray;
        }
    }
    
    public static ArrayList<ComprobantesVentasCobros> selectFiltro(ComprobantesVentasCobros comprobantesVentasCobros) {
        
        ArrayList<ComprobantesVentasCobros> comprobantesVentasCobrosArray = new ArrayList<ComprobantesVentasCobros>();
        
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM caja.fun_comprobantesventascobros_obtener_filtro("
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
            varPst.setInt(1, comprobantesVentasCobros.getEmp_id());
            varPst.setString(2, comprobantesVentasCobros.getCvt_codigo());
            varPst.setString(3, comprobantesVentasCobros.getCvc_serienumero());
            varPst.setString(4, comprobantesVentasCobros.getFdc_codigo());
            varPst.setString(5, comprobantesVentasCobros.getVec_nroreferencia());
            varPst.setDate(6, Utility.getStringToDate(comprobantesVentasCobros.getVec_fechacancelacioninicio()));
            varPst.setDate(7, Utility.getStringToDate(comprobantesVentasCobros.getVec_fechacancelacionfin()));
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    comprobantesVentasCobros = new ComprobantesVentasCobros();
                    comprobantesVentasCobros.setVec_id(varResult.getInt("vec_id"));
                    comprobantesVentasCobros.setCvc_id(varResult.getInt("cvc_id"));
                    comprobantesVentasCobros.setEmp_razonsocial(varResult.getString("emp_razonsocial"));
                    comprobantesVentasCobros.setCvc_fechaemision(Utility.getDateToString(varResult.getDate("cvc_fechaemision")));
                    comprobantesVentasCobros.setCct_codigo(varResult.getString("cct_codigo"));
                    comprobantesVentasCobros.setCct_descripcion(varResult.getString("cct_descripcion"));
                    comprobantesVentasCobros.setCvc_serienumero(varResult.getString("cvc_serienumero"));
                    comprobantesVentasCobros.setEnt_nombre(varResult.getString("ent_nombre"));
                    comprobantesVentasCobros.setCvc_total(varResult.getDouble("cvc_total"));
                    comprobantesVentasCobros.setCce_codigo(varResult.getString("cce_codigo"));
                    comprobantesVentasCobros.setCce_descripcion(varResult.getString("cce_descripcion"));
                    comprobantesVentasCobros.setCvc_mon_codigo(varResult.getString("cvc_mon_codigo"));
                    comprobantesVentasCobros.setVec_fechacancelacion(Utility.getDateToString(varResult.getDate("vec_fechacancelacion")));
                    comprobantesVentasCobros.setFdc_codigo(varResult.getString("fdc_codigo"));
                    comprobantesVentasCobros.setFdc_descripcion(varResult.getString("fdc_descripcion"));
                    comprobantesVentasCobros.setVec_nroreferencia(varResult.getString("vec_nroreferencia"));
                    comprobantesVentasCobros.setVec_mon_codigo(varResult.getString("vec_mon_codigo"));
                    comprobantesVentasCobros.setVec_tipocambio(varResult.getDouble("vec_tipocambio"));
                    comprobantesVentasCobros.setVec_monto(varResult.getDouble("vec_monto"));
                    comprobantesVentasCobrosArray.add(comprobantesVentasCobros);
                }

            }

        } catch (SQLException e) {
            comprobantesVentasCobros = new ComprobantesVentasCobros();
            comprobantesVentasCobros.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            comprobantesVentasCobrosArray.add(comprobantesVentasCobros);
            e.printStackTrace();
        } catch (Exception e) {
            comprobantesVentasCobros = new ComprobantesVentasCobros();
            comprobantesVentasCobros.setErrorEntity(new ErrorEntity("Exception", "" + e));
            comprobantesVentasCobrosArray.add(comprobantesVentasCobros);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return comprobantesVentasCobrosArray;
        }
    }
}
