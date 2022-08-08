/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.basedatos;

import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.ErrorEntity;
import com.garcal.erp.model.basedatos.VehiculosClases;
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
public class VehiculosClasesDAO extends ConnectionDB {

    public static ArrayList<VehiculosClases> selectAll(Integer idEmpresa) {
        ArrayList<VehiculosClases> vehiculosClasesArray = new ArrayList<VehiculosClases>();
        VehiculosClases vehiculosClases = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM operaciones.fun_vehiculosclases_obtener_todo(?)";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, idEmpresa);

            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    vehiculosClases = new VehiculosClases();
                    vehiculosClases.setVcl_id(varResult.getString("vcl_id"));
                    vehiculosClases.setVcl_nombre(varResult.getString("vcl_nombre"));
                    vehiculosClasesArray.add(vehiculosClases);
                }
            }
        } catch (SQLException e) {
            vehiculosClases = new VehiculosClases();
            vehiculosClases.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            vehiculosClasesArray.add(vehiculosClases);
            e.printStackTrace();
        } catch (Exception e) {
            vehiculosClases = new VehiculosClases();
            vehiculosClases.setErrorEntity(new ErrorEntity("Exception", "" + e));
            vehiculosClasesArray.add(vehiculosClases);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return vehiculosClasesArray;
        }
    }
}
