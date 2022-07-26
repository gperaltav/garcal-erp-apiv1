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
import com.garcal.erp.model.compras.ComprobantesComprasDet;
import java.sql.Array;
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
public class ComprobantesComprasDAO extends ConnectionDB {

    public static ResponseAnswer insert(ComprobantesComprasCab comprobantescomprascab) {
        ResponseAnswer postResponse = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {

            varConn = connectionDB();

            ArrayList<ComprobantesComprasDet> detail = comprobantescomprascab.getDetalle();

            ArrayList<Integer> proId = new ArrayList();
            ArrayList<Integer> viaId = new ArrayList();
            ArrayList<Integer> vehId = new ArrayList();
            ArrayList<Integer> traId = new ArrayList();

            ArrayList<String> serie = new ArrayList();
            ArrayList<Double> cantidad = new ArrayList();
            ArrayList<Double> precioUnitario = new ArrayList();
            ArrayList<Double> subTotal = new ArrayList();
            ArrayList<String> unidad = new ArrayList();

            if (detail != null) {
                for (int i = 0; i < detail.size(); i++) {
                    proId.add(detail.get(i).getPro_id());
                    viaId.add(detail.get(i).getVia_id());
                    vehId.add(detail.get(i).getVeh_id());
                    traId.add(detail.get(i).getTra_id());
                    serie.add(detail.get(i).getCcd_serie());
                    cantidad.add(detail.get(i).getCcd_cantidad());
                    precioUnitario.add(detail.get(i).getCcd_preciounitario());
                    subTotal.add(detail.get(i).getCcd_subtotal());
                    unidad.add(detail.get(i).getUni_unidad());
                }
            }

            Array arrayProId = varConn.createArrayOf("int4", proId.toArray());
            Array arrayViaId = varConn.createArrayOf("int4", viaId.toArray());
            Array arrayVehId = varConn.createArrayOf("int4", vehId.toArray());
            Array arrayTraId = varConn.createArrayOf("int8", traId.toArray());
            Array arraySerie = varConn.createArrayOf("varchar", serie.toArray());
            Array arrayCantidad = varConn.createArrayOf("float8", cantidad.toArray());
            Array arrayPrecioUnitario = varConn.createArrayOf("float8", precioUnitario.toArray());
            Array arraySubtotal = varConn.createArrayOf("float8", subTotal.toArray());
            Array arrayUnidad = varConn.createArrayOf("varchar", unidad.toArray());

            String varSql = "SELECT * FROM compras.fun_comprobantescomprascab_insertar("
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
                    + "?  ,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,?,?,?,?,?,?,?,?,?"
                    + " )";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, comprobantescomprascab.getEmp_id());
            varPst.setObject(2, comprobantescomprascab.getEnt_id(), Types.INTEGER);
            varPst.setString(3, comprobantescomprascab.getCcc_serie());
            varPst.setString(4, comprobantescomprascab.getCcc_numero());
            varPst.setDate(5, Utility.getStringToDate(comprobantescomprascab.getCcc_fechaemision()));
            varPst.setDouble(6, comprobantescomprascab.getCcc_subtotal());
            varPst.setDouble(7, comprobantescomprascab.getCcc_impuesto());
            varPst.setDouble(8, comprobantescomprascab.getCcc_total());
            varPst.setString(9, comprobantescomprascab.getCct_codigo());
            varPst.setString(10, comprobantescomprascab.getCce_codigo());
            varPst.setString(11, comprobantescomprascab.getMon_codigo());
            varPst.setString(12, comprobantescomprascab.getCcc_observaciones());
            varPst.setObject(13, comprobantescomprascab.getCcc_idreferencia(), Types.INTEGER);
            varPst.setDouble(14, comprobantescomprascab.getCcc_tipocambio());
            varPst.setBoolean(15, comprobantescomprascab.getCcc_generamovimiento());
            varPst.setDate(16, Utility.getStringToDate(comprobantescomprascab.getCcc_fechaingreso()));
            varPst.setDate(17, comprobantescomprascab.getCcc_periodoregistro());

            varPst.setString(18, comprobantescomprascab.getUsu_codigo());
            varPst.setString(19, comprobantescomprascab.getCcc_usucreacion());

            varPst.setArray(20, arrayProId);
            varPst.setArray(21, arrayViaId);
            varPst.setArray(22, arrayVehId);
            varPst.setArray(23, arrayTraId);
            varPst.setArray(24, arraySerie);
            varPst.setArray(25, arrayCantidad);
            varPst.setArray(26, arrayPrecioUnitario);
            varPst.setArray(27, arraySubtotal);
            varPst.setArray(28, arrayUnidad);

            varPst.setString(29, comprobantescomprascab.getCcr_codigo());

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

    public static ArrayList<ComprobantesComprasCab> selectComprobantesComprasCab(ComprobantesComprasCab comprobantescomprascab) {

        ArrayList<ComprobantesComprasCab> comprobantescomprascabArray = new ArrayList<ComprobantesComprasCab>();

        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM compras.fun_comprobantescompras_obtener_filtro("
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "?  "
                    + " )";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, comprobantescomprascab.getEmp_id());
            varPst.setString(2, comprobantescomprascab.getCct_codigo());
            varPst.setString(3, comprobantescomprascab.getCcc_serienumero());
            varPst.setString(4, comprobantescomprascab.getCce_codigo());
            varPst.setDate(5, Utility.getStringToDate(comprobantescomprascab.getCcc_fechaemisioninicio()));
            varPst.setDate(6, Utility.getStringToDate(comprobantescomprascab.getCcc_fechaemisionfin()));
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    comprobantescomprascab = new ComprobantesComprasCab();
                    comprobantescomprascab.setCcc_id(varResult.getInt("ccc_id"));
                    comprobantescomprascab.setEmp_razonsocial(varResult.getString("emp_razonsocial"));
                    comprobantescomprascab.setCcc_fechaemision(Utility.getDateToString(varResult.getDate("ccc_fechaemision")));
                    comprobantescomprascab.setCct_codigo(varResult.getString("cct_codigo"));
                    comprobantescomprascab.setCct_descripcion(varResult.getString("cct_descripcion"));
                    comprobantescomprascab.setCcc_serienumero(varResult.getString("ccc_serienumero"));
                    comprobantescomprascab.setEnt_nombre(varResult.getString("ent_nombre"));
                    comprobantescomprascab.setCcc_subtotal(varResult.getDouble("ccc_subtotal"));
                    comprobantescomprascab.setCcc_impuesto(varResult.getDouble("ccc_impuesto"));
                    comprobantescomprascab.setCcc_total(varResult.getDouble("ccc_total"));
                    comprobantescomprascab.setCce_codigo(varResult.getString("cce_codigo"));
                    comprobantescomprascab.setCce_descripcion(varResult.getString("cce_descripcion"));
                    comprobantescomprascab.setMon_codigo(varResult.getString("mon_codigo"));
                    comprobantescomprascab.setCcr_codigo(varResult.getString("ccr_codigo"));
                    comprobantescomprascab.setCcr_descripcion(varResult.getString("ccr_descripcion"));
                    comprobantescomprascab.setCcc_comprobantereferencia(varResult.getString("ccc_comprobantereferencia"));
                    comprobantescomprascabArray.add(comprobantescomprascab);
                }
            }
        } catch (SQLException e) {
            comprobantescomprascab = new ComprobantesComprasCab();
            comprobantescomprascab.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            comprobantescomprascabArray.add(comprobantescomprascab);
            e.printStackTrace();
        } catch (Exception e) {
            comprobantescomprascab = new ComprobantesComprasCab();
            comprobantescomprascab.setErrorEntity(new ErrorEntity("Exception", "" + e));
            comprobantescomprascabArray.add(comprobantescomprascab);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return comprobantescomprascabArray;
        }
    }

}
