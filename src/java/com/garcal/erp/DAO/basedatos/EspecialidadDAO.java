/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.basedatos;

import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.basedatos.Especialidad;
import com.garcal.erp.model.ErrorEntity;
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
public class EspecialidadDAO extends ConnectionDB {

    public static ArrayList<Especialidad> selectAll(Integer idEmpresa) {
        ArrayList<Especialidad> especialidadArray = new ArrayList<Especialidad>();
        Especialidad especialidad = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM operaciones.fun_tripulacionespecialidad_obtener_todo(?)";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, idEmpresa);

            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    especialidad = new Especialidad();
                    especialidad.setTes_id(varResult.getInt("tes_id"));
                    especialidad.setTes_nombre(varResult.getString("tes_nombre"));
                    especialidadArray.add(especialidad);
                }
            }
        } catch (SQLException e) {
            especialidad = new Especialidad();
            especialidad.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            especialidadArray.add(especialidad);
            e.printStackTrace();
        } catch (Exception e) {
            especialidad = new Especialidad();
            especialidad.setErrorEntity(new ErrorEntity("Exception", "" + e));
            especialidadArray.add(especialidad);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return especialidadArray;
        }
    }

}
