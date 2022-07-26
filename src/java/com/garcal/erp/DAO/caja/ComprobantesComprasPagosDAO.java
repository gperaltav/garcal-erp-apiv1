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
import com.garcal.erp.model.caja.ComprobantesComprasPagos;
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
public class ComprobantesComprasPagosDAO extends ConnectionDB {

    public static ResponseAnswer insert(ComprobantesComprasPagos comprobantesComprasPagos) {
        ResponseAnswer postResponse = null;
        String nroServicio = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM caja.fun_comprobantescompraspagos_insetar("
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
            varPst.setInt(1, comprobantesComprasPagos.getEmp_id());
            varPst.setInt(2, comprobantesComprasPagos.getCcc_id());
            varPst.setString(3, comprobantesComprasPagos.getFdp_codigo());
            varPst.setInt(4, comprobantesComprasPagos.getCbp_id());
            varPst.setDouble(5, comprobantesComprasPagos.getCcp_monto());
            varPst.setString(6, comprobantesComprasPagos.getCcp_nroreferencia());
            varPst.setString(7, comprobantesComprasPagos.getMon_codigo());
            varPst.setString(8, comprobantesComprasPagos.getCcp_descripcion());
            varPst.setDate(9, Utility.getStringToDate(comprobantesComprasPagos.getCcp_fechacancelacion()));
            varPst.setString(10, comprobantesComprasPagos.getCcp_usucreacion());
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

    public static ResponseAnswer update(ComprobantesComprasPagos comprobantesComprasPagos) {
        ResponseAnswer postResponse = null;

        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM caja.fun_comprobantescompraspagos_actualizar ("
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
            varPst.setInt(1, comprobantesComprasPagos.getCcp_id());
            varPst.setInt(2, comprobantesComprasPagos.getEmp_id());
            varPst.setInt(3, comprobantesComprasPagos.getCcc_id());
            varPst.setString(4, comprobantesComprasPagos.getFdp_codigo());
            varPst.setInt(5, comprobantesComprasPagos.getCbp_id());
            varPst.setDouble(6, comprobantesComprasPagos.getCcp_monto());
            varPst.setString(7, comprobantesComprasPagos.getCcp_nroreferencia());
            varPst.setString(8, comprobantesComprasPagos.getMon_codigo());
            varPst.setString(9, comprobantesComprasPagos.getCcp_descripcion());
            varPst.setDate(10, Utility.getStringToDate(comprobantesComprasPagos.getCcp_fechacancelacion()));
            varPst.setString(11, comprobantesComprasPagos.getCcp_usucreacion());
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
            String varSql = "SELECT * FROM caja.fun_comprobantescompraspagos_borrar(?)";
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

    public static ArrayList<ComprobantesComprasPagos> selectID(Integer idccp) {
        ArrayList<ComprobantesComprasPagos> comprobantesComprasPagosArray = new ArrayList<ComprobantesComprasPagos>();
        ComprobantesComprasPagos comprobantesComprasPagos = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM caja.fun_comprobantescompraspagos_obtener_todo(?)";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, idccp);
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    comprobantesComprasPagos = new ComprobantesComprasPagos();
                    comprobantesComprasPagos.setCcp_id(varResult.getInt("emp_id"));
                    comprobantesComprasPagos.setCcc_id(varResult.getInt("ccc_id"));
                    comprobantesComprasPagos.setFdp_codigo(varResult.getString("fdp_codigo"));
                    comprobantesComprasPagos.setCbp_id(varResult.getInt("cbp_id"));
                    comprobantesComprasPagos.setCcp_monto(varResult.getDouble("ccp_monto"));
                    comprobantesComprasPagos.setCcp_nroreferencia(varResult.getString("ccp_nroreferencia"));
                    comprobantesComprasPagos.setMon_codigo(varResult.getString("mon_codigo"));
                    comprobantesComprasPagos.setCcp_descripcion(varResult.getString("ccp_descripcion"));
                    comprobantesComprasPagos.setCcp_fechacancelacion(Utility.getDateToString(varResult.getDate("ccp_fechacancelacion")));
                    comprobantesComprasPagos.setVia_descripcion(varResult.getString("via_descripcion"));
                    comprobantesComprasPagos.setCcp_usucreacion(varResult.getString("ccp_usucreacion"));
                    comprobantesComprasPagosArray.add(comprobantesComprasPagos);
                }
            }
        } catch (SQLException e) {
            comprobantesComprasPagos = new ComprobantesComprasPagos();
            comprobantesComprasPagos.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            comprobantesComprasPagosArray.add(comprobantesComprasPagos);
            e.printStackTrace();
        } catch (Exception e) {
            comprobantesComprasPagos = new ComprobantesComprasPagos();
            comprobantesComprasPagos.setErrorEntity(new ErrorEntity("Exception", "" + e));
            comprobantesComprasPagosArray.add(comprobantesComprasPagos);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return comprobantesComprasPagosArray;
        }
    }

    public static ArrayList<ComprobantesComprasPagos> selectFiltro(ComprobantesComprasPagos comprobantesComprasPagos) {

        ArrayList<ComprobantesComprasPagos> comprobantesComprasPagosArray = new ArrayList<ComprobantesComprasPagos>();

        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM caja.fun_comprobantescompraspagos_obtener_filtro("
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
            varPst.setInt(1, comprobantesComprasPagos.getEmp_id());
            varPst.setString(2, comprobantesComprasPagos.getCct_codigo());
            varPst.setString(3, comprobantesComprasPagos.getCcc_serienumero());
            varPst.setString(4, comprobantesComprasPagos.getFdc_codigo());
            varPst.setString(5, comprobantesComprasPagos.getCcp_nroreferencia());
            varPst.setDate(6, Utility.getStringToDate(comprobantesComprasPagos.getCcp_fechacancelacioninicio()));
            varPst.setDate(7, Utility.getStringToDate(comprobantesComprasPagos.getCcp_fechacancelacionfin()));
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    comprobantesComprasPagos = new ComprobantesComprasPagos();
                    comprobantesComprasPagos.setCcp_id(varResult.getInt("ccp_id"));
                    comprobantesComprasPagos.setCcc_id(varResult.getInt("ccc_id"));
                    comprobantesComprasPagos.setEmp_razonsocial(varResult.getString("emp_razonsocial"));
                    comprobantesComprasPagos.setCcc_fechaemision(Utility.getDateToString(varResult.getDate("ccc_fechaemision")));
                    comprobantesComprasPagos.setCct_codigo(varResult.getString("cct_codigo"));
                    comprobantesComprasPagos.setCct_descripcion(varResult.getString("cct_descripcion"));
                    comprobantesComprasPagos.setCcc_serienumero(varResult.getString("ccc_serienumero"));
                    comprobantesComprasPagos.setEnt_nombre(varResult.getString("ent_nombre"));
                    comprobantesComprasPagos.setCcc_total(varResult.getDouble("ccc_total"));
                    comprobantesComprasPagos.setCce_codigo(varResult.getString("cce_codigo"));
                    comprobantesComprasPagos.setCce_descripcion(varResult.getString("cce_descripcion"));
                    comprobantesComprasPagos.setCcc_mon_codigo(varResult.getString("ccc_mon_codigo"));
                    comprobantesComprasPagos.setCcp_fechacancelacion(Utility.getDateToString(varResult.getDate("ccp_fechacancelacion")));
                    comprobantesComprasPagos.setFdp_codigo(varResult.getString("fdp_codigo"));
                    comprobantesComprasPagos.setFdp_descripcion(varResult.getString("fdp_descripcion"));
                    comprobantesComprasPagos.setCcp_nroreferencia(varResult.getString("ccp_nroreferencia"));
                    comprobantesComprasPagos.setCcp_mon_codigo(varResult.getString("ccp_mon_codigo"));
                    comprobantesComprasPagos.setCcp_tipocambio(varResult.getDouble("ccp_tipocambio"));
                    comprobantesComprasPagos.setCcp_monto(varResult.getDouble("ccp_monto"));
                    comprobantesComprasPagosArray.add(comprobantesComprasPagos);
                }

            }

        } catch (SQLException e) {
            comprobantesComprasPagos = new ComprobantesComprasPagos();
            comprobantesComprasPagos.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            comprobantesComprasPagosArray.add(comprobantesComprasPagos);
            e.printStackTrace();
        } catch (Exception e) {
            comprobantesComprasPagos = new ComprobantesComprasPagos();
            comprobantesComprasPagos.setErrorEntity(new ErrorEntity("Exception", "" + e));
            comprobantesComprasPagosArray.add(comprobantesComprasPagos);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return comprobantesComprasPagosArray;
        }
    }

}
