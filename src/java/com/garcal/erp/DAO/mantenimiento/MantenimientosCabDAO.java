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
import com.garcal.erp.model.mantenimiento.MantenimientosDet;
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
    
  public static ResponseAnswer insert(MantenimientosCab mantenimientoscab) {
        ResponseAnswer postResponse = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            
            ArrayList<MantenimientosDet> detail = mantenimientoscab.getDetalle();

            ArrayList<Integer> tar_id = new ArrayList();
            ArrayList<String> mad_descripcion = new ArrayList();
            ArrayList<String> mad_observacion = new ArrayList();
            ArrayList<String> mad_estado = new ArrayList();
           

            if (detail != null) {
                for (int i = 0; i < detail.size(); i++) {
                    tar_id.add(detail.get(i).getTar_id());
                    mad_descripcion.add(detail.get(i).getMad_descripcion());
                    mad_observacion.add(detail.get(i).getMad_observacion ());
                    mad_estado.add(detail.get(i).getMad_estado());

                }
            }

            Array arrayTar_id= varConn.createArrayOf("int4", tar_id.toArray());
            Array arrayMad_descripcion = varConn.createArrayOf("varchar", mad_descripcion.toArray());
            Array arrayMad_observacion = varConn.createArrayOf("varchar", mad_observacion.toArray());
            Array arrayMad_estado = varConn.createArrayOf("varchar", mad_estado.toArray());
         
            String varSql = "SELECT * FROM mantenimiento.fun_mantenimientoscab_insertar("
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
            varPst.setInt(1, mantenimientoscab.getEmp_id());
            varPst.setInt(2, mantenimientoscab.getVeh_id());
            varPst.setDate(3, Utility.getStringToDate(mantenimientoscab.getMan_fecha()));
            varPst.setString(4, mantenimientoscab.getUsu_codigo());
            varPst.setString(5, mantenimientoscab.getMan_usucreacion());
            varPst.setInt(6, mantenimientoscab.getMan_numero());
            
            varPst.setArray(7, arrayTar_id);
            varPst.setArray(8, arrayMad_descripcion);
            varPst.setArray(9, arrayMad_observacion);
            varPst.setArray(10, arrayMad_estado);
        
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
  
  public static ResponseAnswer update(MantenimientosCab mantenimientoscab) {
        ResponseAnswer postResponse = null;

        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM  mantenimiento.fun_mantenimientoscab_actualizar ("
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "?  "
                    + " )";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, mantenimientoscab.getMan_id());
            varPst.setString(2, mantenimientoscab.getMan_estado());
            varPst.setString(3, mantenimientoscab.getMan_usumodificacion());
            varPst.setDate(4, Utility.getStringToDate( mantenimientoscab.getMan_fecmodificacion()));
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
  
    
}
