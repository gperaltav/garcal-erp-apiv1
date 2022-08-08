/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.basedatos;

import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.basedatos.Contratos;
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
public class ContratosDAO extends ConnectionDB {

    public static ArrayList<Contratos> selectAll(Integer idEmpresa) {
        ArrayList<Contratos> contratosArray = new ArrayList<Contratos>();
        Contratos contratos = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM rrhh.fun_get_tiposcontrato_all(?)";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, idEmpresa);
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    contratos = new Contratos();
                    contratos.setTco_id(varResult.getString("tco_id"));
                    contratos.setTco_nombre(varResult.getString("tco_nombre"));
                    contratosArray.add(contratos);
                }
            }
        } catch (SQLException e) {
            contratos = new Contratos();
            contratos.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            contratosArray.add(contratos);
            e.printStackTrace();
        } catch (Exception e) {
            contratos = new Contratos();
            contratos.setErrorEntity(new ErrorEntity("Exception", "" + e));
            contratosArray.add(contratos);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return contratosArray;
        }
    }

}
