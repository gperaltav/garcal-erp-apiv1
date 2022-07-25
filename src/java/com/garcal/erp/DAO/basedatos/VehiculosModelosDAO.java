/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.basedatos;

import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.ErrorEntity;
import com.garcal.erp.model.basedatos.VehiculosModelos;
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
public class VehiculosModelosDAO extends ConnectionDB {

    public static ArrayList<VehiculosModelos> selectAll(Integer idEmpresa) {
        ArrayList<VehiculosModelos> vehiculoModelosArray = new ArrayList<VehiculosModelos>();
        VehiculosModelos vehiculoModelos = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM operaciones.fun_vehiculosmodelos_obtener_todo(?)";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, idEmpresa);

            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    vehiculoModelos = new VehiculosModelos();
                    vehiculoModelos.setVmo_id(varResult.getInt("vmo_id"));
                    vehiculoModelos.setVmo_nombre(varResult.getString("vmo_nombre"));
                    vehiculoModelosArray.add(vehiculoModelos);
                }
            }
        } catch (SQLException e) {
            vehiculoModelos = new VehiculosModelos();
            vehiculoModelos.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            vehiculoModelosArray.add(vehiculoModelos);
            e.printStackTrace();
        } catch (Exception e) {
            vehiculoModelos = new VehiculosModelos();
            vehiculoModelos.setErrorEntity(new ErrorEntity("Exception", "" + e));
            vehiculoModelosArray.add(vehiculoModelos);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return vehiculoModelosArray;
        }
    }
}
