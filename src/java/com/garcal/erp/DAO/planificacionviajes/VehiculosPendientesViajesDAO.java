/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.planificacionviajes;

import com.garcal.erp.DAO.util.Utility;
import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.ErrorEntity;
import com.garcal.erp.model.planificacionviajes.VehiculosPendientesViajes;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.apache.commons.dbutils.DbUtils;


/**
 *
 * @author usuario
 */
public class VehiculosPendientesViajesDAO  extends ConnectionDB{
    
    public static ArrayList<VehiculosPendientesViajes> selectVehiculosPendientesViajes(VehiculosPendientesViajes vehiculosPendientesViajes) {

        ArrayList<VehiculosPendientesViajes> vehiculosPendientesViajesArray = new ArrayList<VehiculosPendientesViajes>();
        //VehiculosPendientesViajes vehiculosPendientesViajes = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM operaciones.fun_vehiculos_pendientes_viajes("
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? "
                    + " )";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, vehiculosPendientesViajes.getEmp_id());
            varPst.setString(2, vehiculosPendientesViajes.getVeh_placa());
            varPst.setString(3, vehiculosPendientesViajes.getVcl_id());
            varPst.setDate(4, vehiculosPendientesViajes.getVia_fechaviaje());
             varPst.setTime(5, Utility.getStringToTime(vehiculosPendientesViajes.getVia_horaviaje()));
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    vehiculosPendientesViajes = new VehiculosPendientesViajes();
                    vehiculosPendientesViajes.setVeh_id(varResult.getInt("veh_id"));
                    vehiculosPendientesViajes.setEmp_id(varResult.getInt("emp_id"));
                    vehiculosPendientesViajes.setVeh_placa(varResult.getString("veh_placa"));
                    vehiculosPendientesViajesArray.add(vehiculosPendientesViajes);
                }
            }
        } catch (SQLException e) {
            vehiculosPendientesViajes = new VehiculosPendientesViajes();
            vehiculosPendientesViajes.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            vehiculosPendientesViajesArray.add(vehiculosPendientesViajes);
            e.printStackTrace();
        } catch (Exception e) {
            vehiculosPendientesViajes = new VehiculosPendientesViajes();
            vehiculosPendientesViajes.setErrorEntity(new ErrorEntity("Exception", "" + e));
            vehiculosPendientesViajesArray.add(vehiculosPendientesViajes);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return vehiculosPendientesViajesArray;
        }
    }
    
}
