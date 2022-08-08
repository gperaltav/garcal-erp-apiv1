/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.mantenimiento;

import com.garcal.erp.DAO.util.Utility;
import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.ResponseAnswer;
import com.garcal.erp.model.mantenimiento.MantenimientosCab;
import java.sql.Array;
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
public class MantenimientosCabDAO extends ConnectionDB  {
    
   /* public static ResponseAnswer insert(MantenimientosCab mantenimientoscab) {
        ResponseAnswer postResponse = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            
            ArrayList<MantenimientosCab> detail = mantenimientoscab.getDetalle();

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
           
            String varSql = "SELECT * FROM mantenimiento.fun_mantenimientoscab_insertar("
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
            varPst.setInt(1, mantenimientoscab.getEmp_id());
            varPst.setInt(2, mantenimientoscab.getVeh_id());
            varPst.setDate(3, Utility.getStringToDate(mantenimientoscab.getMan_fecha()));
            varPst.setString(4, mantenimientoscab.getUsu_codigo());
            varPst.setString(5, mantenimientoscab.getMan_estado());
            varPst.setString(6, mantenimientoscab.getMan_usucreacion());
            varPst.setInt(7, mantenimientoscab.getMan_numero());
            
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

    }*/
    
}
