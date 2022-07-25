/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.basedatos;

import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.ErrorEntity;
import com.garcal.erp.model.basedatos.Flete;
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
public class FleteDAO  extends ConnectionDB  {
    
      public static ArrayList<Flete> selectAll( ) {

        ArrayList<Flete> fleteArray = new ArrayList<Flete>();
        Flete flete = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM operaciones.fun_viajesflete_obtener()";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    flete = new Flete();
                    flete.setVfl_codigo(varResult.getString("vfl_codigo"));
                    flete.setVfl_nombre(varResult.getString("vfl_nombre"));
                    fleteArray.add(flete);
                }
            }
        } catch (SQLException e) {
            flete = new Flete();
            flete.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            fleteArray.add(flete);
            e.printStackTrace();
        } catch (Exception e) {
            flete = new Flete();
            flete.setErrorEntity(new ErrorEntity("Exception", "" + e));
            fleteArray.add(flete);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return fleteArray;
        }
    }
    
}
