/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.basedatos;

import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.ErrorEntity;
import com.garcal.erp.model.basedatos.FormasDeCobro;
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
public class FormasDeCobroDAO extends ConnectionDB {
    
    public static ArrayList<FormasDeCobro> selectAll(Integer idEmpresa) {

        ArrayList<FormasDeCobro> formasDeCobroArray = new ArrayList<FormasDeCobro>();
        FormasDeCobro formasDeCobro = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM caja.fun_formasdecobro_obtener_todo(?)";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, idEmpresa);
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    formasDeCobro = new FormasDeCobro();
                    formasDeCobro.setFdc_codigo(varResult.getString("fdc_codigo"));
                    formasDeCobro.setMon_codigo(varResult.getString("mon_codigo"));
                    formasDeCobro.setFdc_descripcion(varResult.getString("fdc_descripcion"));
                    formasDeCobroArray.add(formasDeCobro);
                }
            }
        } catch (SQLException e) {
            formasDeCobro = new FormasDeCobro();
            formasDeCobro.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            formasDeCobroArray.add(formasDeCobro);
            e.printStackTrace();
        } catch (Exception e) {
            formasDeCobro = new FormasDeCobro();
            formasDeCobro.setErrorEntity(new ErrorEntity("Exception", "" + e));
            formasDeCobroArray.add(formasDeCobro);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return formasDeCobroArray;
        }
    }
    
}
