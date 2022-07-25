/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.basedatos;

import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.ResponseAnswer;
import com.garcal.erp.model.basedatos.UserBack;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.commons.dbutils.DbUtils;

/**
 *
 * @author User
 */
public class UserBackDAO extends ConnectionDB {
    
    public static ResponseAnswer insert(UserBack userBack) {
        ResponseAnswer postResponse = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM public.fun_usuario_login("
                    + "? ,"
                    + "?  "
                    + " ) ";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setString(1, userBack.getUsu_codigo());
            varPst.setString(2, userBack.getUsu_clave());
            varPst.executeQuery();
            varPst.close();

            postResponse = new ResponseAnswer();
            postResponse.setStatus(Boolean.TRUE);
            postResponse.setMessage("insert full");

        } catch (SQLException e) {
            postResponse = new ResponseAnswer();
            postResponse.setStatus(Boolean.FALSE);
            postResponse.setMessage(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            postResponse = new ResponseAnswer();
            postResponse.setStatus(Boolean.FALSE);
            postResponse.setMessage("Exception " + e);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return postResponse;
        }

    }
    
}
