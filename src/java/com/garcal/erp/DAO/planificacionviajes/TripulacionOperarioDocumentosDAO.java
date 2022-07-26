/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.planificacionviajes;

import com.garcal.erp.DAO.util.Utility;
import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.ErrorEntity;
import com.garcal.erp.model.planificacionviajes.TripulacionOperarioDocumentos;

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
public class TripulacionOperarioDocumentosDAO extends ConnectionDB {

    public static ArrayList<TripulacionOperarioDocumentos> selectTripulacionOperarioDocumentos(TripulacionOperarioDocumentos tripulacionOperarioDocumentos) {

        ArrayList<TripulacionOperarioDocumentos> tripulacionOperarioDocumentosArray = new ArrayList<TripulacionOperarioDocumentos>();
        //VehiculosPendientesViajes vehiculosPendientesViajes = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM  operaciones.fun_tripulacionxoperario_filtro("
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "?  "
                    + " )";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, tripulacionOperarioDocumentos.getEmp_id());
            varPst.setString(2, tripulacionOperarioDocumentos.getTra_nrodocumento());
            varPst.setString(3, tripulacionOperarioDocumentos.getTra_nombre());
            varPst.setString(4, tripulacionOperarioDocumentos.getTri_licencianro());

            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    tripulacionOperarioDocumentos = new TripulacionOperarioDocumentos();
                    tripulacionOperarioDocumentos.setTra_id(varResult.getInt("tra_id"));
                    tripulacionOperarioDocumentos.setTra_nrodocumento(varResult.getString("tra_nrodocumento"));
                    tripulacionOperarioDocumentos.setTri_licencianro(varResult.getString("tri_licencianro"));
                    tripulacionOperarioDocumentos.setTra_nombre(varResult.getString("tra_nombre"));
                    tripulacionOperarioDocumentosArray.add(tripulacionOperarioDocumentos);
                }
            }
        } catch (SQLException e) {
            tripulacionOperarioDocumentos = new TripulacionOperarioDocumentos();
            tripulacionOperarioDocumentos.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            tripulacionOperarioDocumentosArray.add(tripulacionOperarioDocumentos);
            e.printStackTrace();
        } catch (Exception e) {
            tripulacionOperarioDocumentos = new TripulacionOperarioDocumentos();
            tripulacionOperarioDocumentos.setErrorEntity(new ErrorEntity("Exception", "" + e));
            tripulacionOperarioDocumentosArray.add(tripulacionOperarioDocumentos);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return tripulacionOperarioDocumentosArray;
        }
    }

}
