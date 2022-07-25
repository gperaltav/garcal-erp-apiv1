/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.compras;

import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.ErrorEntity;
import com.garcal.erp.model.compras.ComprobantesComprasEstados;

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
public class ComprobantesComprasEstadosDAO extends ConnectionDB {
    
      public static ArrayList<ComprobantesComprasEstados> selectAll(Integer idEmpresa) {
        ArrayList<ComprobantesComprasEstados> comprobantesComprasEstadosArray = new ArrayList<ComprobantesComprasEstados>();
        
        ComprobantesComprasEstados comprobantesComprasEstados = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "  SELECT * FROM compras.fun_comprobantescomprasestados_obtener(?)";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, idEmpresa);
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    comprobantesComprasEstados = new ComprobantesComprasEstados();
                    comprobantesComprasEstados.setCce_codigo(varResult.getString("cce_codigo"));
                    comprobantesComprasEstados.setCce_descripcion(varResult.getString("cce_descripcion"));
                    comprobantesComprasEstados.setCce_usucreacion(varResult.getString("cce_usucreacion"));
                    comprobantesComprasEstadosArray.add(comprobantesComprasEstados);
                }
            }
        } catch (SQLException e) {
            comprobantesComprasEstados = new ComprobantesComprasEstados();
            comprobantesComprasEstados.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            comprobantesComprasEstadosArray.add(comprobantesComprasEstados);
            e.printStackTrace();
        } catch (Exception e) {
            comprobantesComprasEstados = new ComprobantesComprasEstados();
            comprobantesComprasEstados.setErrorEntity(new ErrorEntity("Exception", "" + e));
            comprobantesComprasEstadosArray.add(comprobantesComprasEstados);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return comprobantesComprasEstadosArray;
        }
    }
    
}
