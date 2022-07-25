/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.basedatos;

import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.ErrorEntity;
import com.garcal.erp.model.basedatos.VehiculosMarcas;
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
public class VehiculosMarcasDAO extends ConnectionDB {

    public static ArrayList<VehiculosMarcas> selectAll(Integer idEmpresa) {
        ArrayList<VehiculosMarcas> vehiculoMarcasArray = new ArrayList<VehiculosMarcas>();
        VehiculosMarcas vehiculoMarcas = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM operaciones.fun_vehiculosmarcas_obtener_todo(?)";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, idEmpresa);

            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    vehiculoMarcas = new VehiculosMarcas();
                    vehiculoMarcas.setVma_id(varResult.getInt("vma_id"));
                    vehiculoMarcas.setVma_nombre(varResult.getString("vma_nombre"));
                    vehiculoMarcasArray.add(vehiculoMarcas);
                }
            }
        } catch (SQLException e) {
            vehiculoMarcas = new VehiculosMarcas();
            vehiculoMarcas.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            vehiculoMarcasArray.add(vehiculoMarcas);
            e.printStackTrace();
        } catch (Exception e) {
            vehiculoMarcas = new VehiculosMarcas();
            vehiculoMarcas.setErrorEntity(new ErrorEntity("Exception", "" + e));
            vehiculoMarcasArray.add(vehiculoMarcas);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return vehiculoMarcasArray;
        }
    }
}
