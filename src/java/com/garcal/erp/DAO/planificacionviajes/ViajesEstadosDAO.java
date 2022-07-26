/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.planificacionviajes;

import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.ErrorEntity;
import com.garcal.erp.model.planificacionviajes.ViajesEstados;
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
public class ViajesEstadosDAO extends ConnectionDB {

    public static ArrayList<ViajesEstados> selectAll(Integer idEmpresa) {
        ArrayList<ViajesEstados> viajesEstadosArray = new ArrayList<ViajesEstados>();

        ViajesEstados viajesEstados = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "  SELECT * FROM operaciones.fun_viajesestados_get(?)";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, idEmpresa);
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    viajesEstados = new ViajesEstados();
                    viajesEstados.setVie_codigo(varResult.getString("vie_codigo"));
                    viajesEstados.setVie_nombre(varResult.getString("vie_nombre"));
                    viajesEstados.setVie_usucreacion(varResult.getString("vie_usucreacion"));
                    viajesEstadosArray.add(viajesEstados);
                }
            }
        } catch (SQLException e) {
            viajesEstados = new ViajesEstados();
            viajesEstados.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            viajesEstadosArray.add(viajesEstados);
            e.printStackTrace();
        } catch (Exception e) {
            viajesEstados = new ViajesEstados();
            viajesEstados.setErrorEntity(new ErrorEntity("Exception", "" + e));
            viajesEstadosArray.add(viajesEstados);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return viajesEstadosArray;
        }
    }

}
