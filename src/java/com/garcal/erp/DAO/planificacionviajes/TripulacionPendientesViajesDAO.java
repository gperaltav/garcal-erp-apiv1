/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.planificacionviajes;

import com.garcal.erp.DAO.util.Utility;
import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.ErrorEntity;
import com.garcal.erp.model.planificacionviajes.TripulacionPendientesViajes;
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
public class TripulacionPendientesViajesDAO extends ConnectionDB {

    public static ArrayList<TripulacionPendientesViajes> selectTripulacionPendientesViajes(TripulacionPendientesViajes tripulacionPendientesViajes) {

        ArrayList<TripulacionPendientesViajes> tripulacionPendientesViajesArray = new ArrayList<TripulacionPendientesViajes>();
        //VehiculosPendientesViajes vehiculosPendientesViajes = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM operaciones.fun_tripulacion_pendientes_viajes("
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? "
                    + " )";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, tripulacionPendientesViajes.getEmp_id());
            varPst.setString(2, tripulacionPendientesViajes.getTra_nrodocumento());
            varPst.setString(3, tripulacionPendientesViajes.getTri_licencianro());
            varPst.setString(4, tripulacionPendientesViajes.getTra_nombre());
            varPst.setDate(5, tripulacionPendientesViajes.getVia_fechaviaje());
            varPst.setTime(6, Utility.getStringToTime(tripulacionPendientesViajes.getVia_horaviaje()));

            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    tripulacionPendientesViajes = new TripulacionPendientesViajes();
                    tripulacionPendientesViajes.setEmp_id(varResult.getInt("emp_id"));
                    tripulacionPendientesViajes.setTri_id(varResult.getInt("tri_id"));
                    tripulacionPendientesViajes.setTra_nrodocumento(varResult.getString("tra_nrodocumento"));
                    tripulacionPendientesViajes.setTri_licencianro(varResult.getString("tri_licencianro"));
                    tripulacionPendientesViajes.setTra_nombre(varResult.getString("tra_nombre"));
                    tripulacionPendientesViajesArray.add(tripulacionPendientesViajes);
                }
            }
        } catch (SQLException e) {
            tripulacionPendientesViajes = new TripulacionPendientesViajes();
            tripulacionPendientesViajes.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            tripulacionPendientesViajesArray.add(tripulacionPendientesViajes);
            e.printStackTrace();
        } catch (Exception e) {
            tripulacionPendientesViajes = new TripulacionPendientesViajes();
            tripulacionPendientesViajes.setErrorEntity(new ErrorEntity("Exception", "" + e));
            tripulacionPendientesViajesArray.add(tripulacionPendientesViajes);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return tripulacionPendientesViajesArray;
        }
    }

}
