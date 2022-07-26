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
import com.garcal.erp.model.ventas.ComprobantesVentasCab;
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
public class ComprobantesVentasCabDAO extends ConnectionDB {

    public static ResponseAnswer insert(ComprobantesVentasCab comprobantesventascab) {
        ResponseAnswer postResponse = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM ventas.fun_comprobantesventascab_insertar("
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
            varPst.setInt(1, comprobantesventascab.getEmp_id());
            varPst.setInt(2, comprobantesventascab.getEnt_id());
            varPst.setString(3, comprobantesventascab.getCvc_serie());
            varPst.setString(4, comprobantesventascab.getCvc_numero());
            varPst.setDate(5, Utility.getStringToDate(comprobantesventascab.getCvc_fechaemision()));
            varPst.setDate(6, Utility.getStringToDate(comprobantesventascab.getCvc_fechavencimiento()));
            varPst.setDouble(7, comprobantesventascab.getCvc_subtotal());
            varPst.setDouble(8, comprobantesventascab.getCvc_impuesto());
            varPst.setDouble(9, comprobantesventascab.getCvc_total());
            varPst.setString(10, comprobantesventascab.getCvt_codigo());
            varPst.setString(11, comprobantesventascab.getCve_codigo());
            varPst.setString(12, comprobantesventascab.getMon_codigo());
            varPst.setDouble(13, comprobantesventascab.getCve_tipocambio());
            varPst.setObject(14, comprobantesventascab.getCvc_idreferencia(), Types.INTEGER);
            varPst.setString(15, comprobantesventascab.getCvc_observaciones());
            varPst.setString(16, comprobantesventascab.getCvc_observacionesopcional());
            varPst.setInt(17, comprobantesventascab.getGui_idremitente());
            varPst.setInt(18, comprobantesventascab.getGui_idtransportisa());
            varPst.setInt(19, comprobantesventascab.getVia_id());
            varPst.setString(20, comprobantesventascab.getUsu_codigo());
            varPst.setString(21, comprobantesventascab.getCvc_usucreacion());
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

    public static ResponseAnswer update(ComprobantesVentasCab comprobantesventascab) {

        ResponseAnswer postResponse = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM ventas.fun_comprobantesventascab_actualizar("
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
            varPst.setInt(1, comprobantesventascab.getCvc_id());
            varPst.setInt(2, comprobantesventascab.getEmp_id());
            varPst.setInt(3, comprobantesventascab.getEnt_id());
            varPst.setString(4, comprobantesventascab.getCvc_serie());
            varPst.setString(5, comprobantesventascab.getCvc_numero());
            varPst.setDate(6, Utility.getStringToDate(comprobantesventascab.getCvc_fechaemision()));
            varPst.setDate(7, Utility.getStringToDate(comprobantesventascab.getCvc_fechavencimiento()));
            varPst.setDouble(8, comprobantesventascab.getCvc_subtotal());
            varPst.setDouble(9, comprobantesventascab.getCvc_impuesto());
            varPst.setDouble(10, comprobantesventascab.getCvc_total());
            varPst.setString(11, comprobantesventascab.getCvt_codigo());
            varPst.setString(12, comprobantesventascab.getCve_codigo());
            varPst.setString(13, comprobantesventascab.getMon_codigo());
            varPst.setDouble(14, comprobantesventascab.getCve_tipocambio());
            varPst.setObject(15, comprobantesventascab.getCvc_idreferencia(), Types.INTEGER);
            varPst.setString(16, comprobantesventascab.getCvc_observaciones());
            varPst.setString(17, comprobantesventascab.getCvc_observacionesopcional());
            varPst.setInt(18, comprobantesventascab.getGui_idremitente());
            varPst.setInt(19, comprobantesventascab.getGui_idtransportisa());
            varPst.setInt(20, comprobantesventascab.getVia_id());
            varPst.setString(21, comprobantesventascab.getUsu_codigo());
            varPst.setString(22, comprobantesventascab.getCvc_usucreacion());
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
            String varSql = " SELECT * FROM ventas.fun_comprobantesventascab_borrar(?)";
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

    public static ArrayList<ComprobantesVentasCab> selectID(Integer idcomprobanteventas) {
        ArrayList<ComprobantesVentasCab> comprobantesventascabArray = new ArrayList<ComprobantesVentasCab>();
        ComprobantesVentasCab comprobantesventascab = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM ventas.fun_comprobantesventascab_obtener(?)";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, idcomprobanteventas);
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    comprobantesventascab = new ComprobantesVentasCab();
                    comprobantesventascab.setEmp_id(varResult.getInt("emp_id"));
                    comprobantesventascab.setEnt_id(varResult.getInt("ent_id"));
                    comprobantesventascab.setCvc_serie(varResult.getString("cvc_serie"));
                    comprobantesventascab.setCvc_numero(varResult.getString("cvc_numero"));
                    comprobantesventascab.setCvc_fechaemision(Utility.getDateToString(varResult.getDate("cvc_fechaemision")));
                    comprobantesventascab.setCvc_fechavencimiento(Utility.getDateToString(varResult.getDate("cvc_fechavencimiento")));
                    comprobantesventascab.setCvc_subtotal(varResult.getDouble("cvc_subtotal"));
                    comprobantesventascab.setCvc_impuesto(varResult.getDouble("cvc_impuesto"));
                    comprobantesventascab.setCvc_total(varResult.getDouble("cvc_total"));
                    comprobantesventascab.setCvt_codigo(varResult.getString("cvt_codigo"));
                    comprobantesventascab.setCve_codigo(varResult.getString("cve_codigo"));
                    comprobantesventascab.setMon_codigo(varResult.getString("mon_codigo"));
                    comprobantesventascab.setCve_tipocambio(varResult.getDouble("cve_tipocambio"));
                    comprobantesventascab.setCvc_idreferencia(varResult.getInt("cvc_idreferencia"));
                    comprobantesventascab.setCvc_observaciones(varResult.getString("cvc_observaciones"));
                    comprobantesventascab.setCvc_observacionesopcional(varResult.getString("cvc_observacionesopcional"));
                    comprobantesventascab.setGui_idremitente(varResult.getInt("gui_idremitente"));
                    comprobantesventascab.setGui_idtransportisa(varResult.getInt("gui_idtransportisa"));
                    comprobantesventascab.setVia_id(varResult.getInt("via_id"));
                    comprobantesventascab.setUsu_codigo(varResult.getString("usu_codigo"));
                    comprobantesventascab.setVia_descripcion(varResult.getString("via_descripcion"));
                    comprobantesventascab.setCvc_usucreacion(varResult.getString("cvc_usucreacion"));
                    comprobantesventascabArray.add(comprobantesventascab);
                }
            }
        } catch (SQLException e) {
            comprobantesventascab = new ComprobantesVentasCab();
            comprobantesventascab.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            comprobantesventascabArray.add(comprobantesventascab);
            e.printStackTrace();
        } catch (Exception e) {
            comprobantesventascab = new ComprobantesVentasCab();
            comprobantesventascab.setErrorEntity(new ErrorEntity("Exception", "" + e));
            comprobantesventascabArray.add(comprobantesventascab);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return comprobantesventascabArray;

        }
    }

    public static ArrayList<ComprobantesVentasCab> selectComprobantesVentasCab(ComprobantesVentasCab comprobantesVentasCab) {

        ArrayList<ComprobantesVentasCab> comprobantesVentasCabArray = new ArrayList<ComprobantesVentasCab>();

        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM  ventas.fun_comprobantesventas_obtener_filtro("
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "?  "
                    + " )";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, comprobantesVentasCab.getEmp_id());
            varPst.setString(2, comprobantesVentasCab.getCvt_codigo());
            varPst.setString(3, comprobantesVentasCab.getCvc_serienumero());
            varPst.setString(4, comprobantesVentasCab.getCve_codigo());
            varPst.setDate(5, comprobantesVentasCab.getCvc_fechaemisioninicio());
            varPst.setDate(6, comprobantesVentasCab.getCvc_fechaemisionfin());
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    comprobantesVentasCab = new ComprobantesVentasCab();
                    comprobantesVentasCab.setCvc_id(varResult.getInt("cvc_id"));
                    comprobantesVentasCab.setEmp_razonsocial(varResult.getString("emp_razonsocial"));
                    comprobantesVentasCab.setCvc_fechaemision(Utility.getDateToString(varResult.getDate("cvc_fechaemision")));
                    comprobantesVentasCab.setCvt_codigo(varResult.getString("cvt_codigo"));
                    comprobantesVentasCab.setCvt_descripcion(varResult.getString("cvt_descripcion"));
                    comprobantesVentasCab.setCvc_serienumero(varResult.getString("cvc_serienumero"));
                    comprobantesVentasCab.setEnt_nombre(varResult.getString("ent_nombre"));
                    comprobantesVentasCab.setCvc_subtotal(varResult.getDouble("cvc_subtotal"));
                    comprobantesVentasCab.setCvc_impuesto(varResult.getDouble("cvc_impuesto"));
                    comprobantesVentasCab.setCvc_total(varResult.getDouble("cvc_total"));
                    comprobantesVentasCab.setCve_codigo(varResult.getString("cve_codigo"));
                    comprobantesVentasCab.setCve_descripcion(varResult.getString("cve_descripcion"));
                    comprobantesVentasCab.setMon_codigo(varResult.getString("mon_codigo"));
                    comprobantesVentasCab.setCvc_comprobantereferencia(varResult.getString("cvc_comprobantereferencia"));
                    comprobantesVentasCabArray.add(comprobantesVentasCab);
                }
            }
        } catch (SQLException e) {
            comprobantesVentasCab = new ComprobantesVentasCab();
            comprobantesVentasCab.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            comprobantesVentasCabArray.add(comprobantesVentasCab);
            e.printStackTrace();
        } catch (Exception e) {
            comprobantesVentasCab = new ComprobantesVentasCab();
            comprobantesVentasCab.setErrorEntity(new ErrorEntity("Exception", "" + e));
            comprobantesVentasCabArray.add(comprobantesVentasCab);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return comprobantesVentasCabArray;
        }
    }

    public static ArrayList<ComprobantesVentasCab> selectIDBucar(Integer idcomprobanteventas) {
        ArrayList<ComprobantesVentasCab> comprobantesventascabArray = new ArrayList<ComprobantesVentasCab>();
        ComprobantesVentasCab comprobantesventascab = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM ventas.fun_comprobantesventascab_bucar(?)";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, idcomprobanteventas);
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    comprobantesventascab = new ComprobantesVentasCab();
                    comprobantesventascab.setCvc_serie(varResult.getString("cvc_serie"));
                    comprobantesventascab.setCvc_numero(varResult.getString("cvc_numero"));
                    comprobantesventascab.setCvt_codigo(varResult.getString("cvt_codigo"));
                    comprobantesventascab.setCve_codigo(varResult.getString("cve_codigo"));
                    comprobantesventascab.setMon_codigo(varResult.getString("mon_codigo"));
                    comprobantesventascabArray.add(comprobantesventascab);
                }
            }
        } catch (SQLException e) {
            comprobantesventascab = new ComprobantesVentasCab();
            comprobantesventascab.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            comprobantesventascabArray.add(comprobantesventascab);
            e.printStackTrace();
        } catch (Exception e) {
            comprobantesventascab = new ComprobantesVentasCab();
            comprobantesventascab.setErrorEntity(new ErrorEntity("Exception", "" + e));
            comprobantesventascabArray.add(comprobantesventascab);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return comprobantesventascabArray;

        }
    }
}
