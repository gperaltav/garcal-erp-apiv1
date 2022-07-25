/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.basedatos;

import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.ErrorEntity;
import com.garcal.erp.model.basedatos.VehiculosTipos;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.apache.commons.dbutils.DbUtils;

/**
 *
 * @author Gloria Peralta <gloria.ypv@gmail.com>
 */
public class VehiculosTiposDAO extends ConnectionDB {

    public static ArrayList<VehiculosTipos> selectAll(Integer idEmpresa) {
        ArrayList<VehiculosTipos> vehiculosTiposArray = new ArrayList<VehiculosTipos>();
        VehiculosTipos vehiculosTipos = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM operaciones.fun_vehiculostipos_obtener_todo(?)";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, idEmpresa);

            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    vehiculosTipos = new VehiculosTipos();
                    vehiculosTipos.setVti_id(varResult.getString("vti_id"));
                    vehiculosTipos.setVti_nombre(varResult.getString("vti_nombre"));
                    vehiculosTiposArray.add(vehiculosTipos);
                }
            }
        } catch (SQLException e) {
            vehiculosTipos = new VehiculosTipos();
            vehiculosTipos.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            vehiculosTiposArray.add(vehiculosTipos);
            e.printStackTrace();
        } catch (Exception e) {
            vehiculosTipos = new VehiculosTipos();
            vehiculosTipos.setErrorEntity(new ErrorEntity("Exception", "" + e));
            vehiculosTiposArray.add(vehiculosTipos);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return vehiculosTiposArray;
        }
    }
}
