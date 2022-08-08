/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.basedatos;

import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.basedatos.Empresas;
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
public class EmpresasDAO extends ConnectionDB {

    public static ArrayList<Empresas> selectAll() {
        ArrayList<Empresas> empresasArray = new ArrayList<Empresas>();
        Empresas empresas = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM public.fun_get_empresas_all()";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    empresas = new Empresas();
                    empresas.setEmp_id(varResult.getInt("emp_id"));
                    empresas.setEmp_razonsocial(varResult.getString("emp_razonsocial"));
                    empresasArray.add(empresas);
                }
            }
        } catch (SQLException e) {
            empresas = new Empresas();
            empresas.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            empresasArray.add(empresas);
            e.printStackTrace();
        } catch (Exception e) {
            empresas = new Empresas();
            empresas.setErrorEntity(new ErrorEntity("Exception", "" + e));
            empresasArray.add(empresas);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return empresasArray;
        }
    }

}
