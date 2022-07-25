/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.basedatos;

import com.garcal.erp.connection.ConnectionDB;

import com.garcal.erp.model.ErrorEntity;
import com.garcal.erp.model.basedatos.Puestos;
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
public class PuestosDAO extends ConnectionDB {

    public static ArrayList<Puestos> selectAll(Integer idEmpresa) {
        ArrayList<Puestos> puestosArray = new ArrayList<Puestos>();
        Puestos puestos = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM rrhh.fun_get_puestos_all(?)";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, idEmpresa);
            ;

            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    puestos = new Puestos();
                    puestos.setPue_id(varResult.getInt("pue_id"));
                    puestos.setPue_nombre(varResult.getString("pue_nombre"));
                    puestosArray.add(puestos);
                }
            }
        } catch (SQLException e) {
            puestos = new Puestos();
            puestos.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            puestosArray.add(puestos);
            e.printStackTrace();
        } catch (Exception e) {
            puestos = new Puestos();
            puestos.setErrorEntity(new ErrorEntity("Exception", "" + e));
            puestosArray.add(puestos);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return puestosArray;
        }
    }

}
