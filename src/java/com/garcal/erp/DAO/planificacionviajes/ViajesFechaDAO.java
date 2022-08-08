/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.planificacionviajes;

import com.garcal.erp.DAO.util.Utility;
import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.ErrorEntity;
import com.garcal.erp.model.planificacionviajes.Viajes;
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
public class ViajesFechaDAO extends ConnectionDB {

    public static ArrayList<Viajes> selectViajesFecha(Viajes viajesfecha) {

        ArrayList<Viajes> viajesfechaArray = new ArrayList<Viajes>();
        //VehiculosPendientesViajes vehiculosPendientesViajes = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM operaciones.fun_viajes_obtener_fecha("
                    + "? ,"
                    + "? "
                    + " )";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, viajesfecha.getEmp_id());
            varPst.setDate(2, Utility.getStringToDate(viajesfecha.getVia_fechaviaje()));

            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    viajesfecha = new Viajes();
                    viajesfecha.setVia_id(varResult.getInt("via_id"));
                    viajesfecha.setVeh_idtracto(varResult.getInt("veh_id"));
                    viajesfecha.setVeh_idremolque(varResult.getInt("veh_idacople"));
                    viajesfecha.setVia_descripcion(varResult.getString("via_descripcion"));
                    viajesfecha.setPro_id(varResult.getInt("pro_id"));
                    viajesfecha.setPro_descripcion(varResult.getString("pro_descripcion"));
                    viajesfechaArray.add(viajesfecha);
                }
            }
        } catch (SQLException e) {
            viajesfecha = new Viajes();
            viajesfecha.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            viajesfechaArray.add(viajesfecha);
            e.printStackTrace();
        } catch (Exception e) {
            viajesfecha = new Viajes();
            viajesfecha.setErrorEntity(new ErrorEntity("Exception", "" + e));
            viajesfechaArray.add(viajesfecha);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return viajesfechaArray;
        }
    }

}
