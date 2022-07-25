/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.compras;

import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.ErrorEntity;
import com.garcal.erp.model.compras.ComprobantesComprasTipos;

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
public class ComprobantesComprasTiposDAO extends ConnectionDB{

       public static ArrayList<ComprobantesComprasTipos> selectAll(Integer idEmpresa) {
        ArrayList<ComprobantesComprasTipos> comprobantesComprasTiposArray = new ArrayList<ComprobantesComprasTipos>();
        
        ComprobantesComprasTipos comprobantesComprasTipos = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "  SELECT * FROM compras.fun_comprobantescomprastipos_obtener(?)";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, idEmpresa);
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                     comprobantesComprasTipos = new ComprobantesComprasTipos();
                    comprobantesComprasTipos.setCct_codigo(varResult.getString("cct_codigo"));
                    comprobantesComprasTipos.setCct_descripcion(varResult.getString("cct_descripcion"));
                    comprobantesComprasTipos.setCct_codigosunat(varResult.getString("cct_codigosunat"));
                    comprobantesComprasTipos.setCct_usucreacion(varResult.getString("cct_usucreacion"));
                    comprobantesComprasTiposArray.add(comprobantesComprasTipos);
                }
            }
        } catch (SQLException e) {
            comprobantesComprasTipos = new ComprobantesComprasTipos();
            comprobantesComprasTipos.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            comprobantesComprasTiposArray.add(comprobantesComprasTipos);
            e.printStackTrace();
        } catch (Exception e) {
            comprobantesComprasTipos = new ComprobantesComprasTipos();
            comprobantesComprasTipos.setErrorEntity(new ErrorEntity("Exception", "" + e));
            comprobantesComprasTiposArray.add(comprobantesComprasTipos);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return comprobantesComprasTiposArray;
        }
    }
    
}
