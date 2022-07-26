/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.compras;

import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.ErrorEntity;
import com.garcal.erp.model.compras.ComprobantesComprasReferencia;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.apache.commons.dbutils.DbUtils;

/**
 *
 * @author usuario
 */
public class ComprobantesComprasReferenciaDAO extends ConnectionDB {

    public static ArrayList<ComprobantesComprasReferencia> selectAll(Integer idEmpresa) {
        ArrayList<ComprobantesComprasReferencia> comprobantesComprasReferenciaArray = new ArrayList<ComprobantesComprasReferencia>();

        ComprobantesComprasReferencia comprobantesComprasReferencia = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "  SELECT * FROM compras.fun_comprobantescomprasreferencia_obtener(?)";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, idEmpresa);
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    comprobantesComprasReferencia = new ComprobantesComprasReferencia();
                    comprobantesComprasReferencia.setCcr_codigo(varResult.getString("ccr_codigo"));
                    comprobantesComprasReferencia.setCcr_descripcion(varResult.getString("ccr_descripcion"));
                    comprobantesComprasReferencia.setCcr_usucreacion(varResult.getString("ccr_usucreacion"));
                    comprobantesComprasReferenciaArray.add(comprobantesComprasReferencia);
                }
            }
        } catch (SQLException e) {
            comprobantesComprasReferencia = new ComprobantesComprasReferencia();
            comprobantesComprasReferencia.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            comprobantesComprasReferenciaArray.add(comprobantesComprasReferencia);
            e.printStackTrace();
        } catch (Exception e) {
            comprobantesComprasReferencia = new ComprobantesComprasReferencia();
            comprobantesComprasReferencia.setErrorEntity(new ErrorEntity("Exception", "" + e));
            comprobantesComprasReferenciaArray.add(comprobantesComprasReferencia);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return comprobantesComprasReferenciaArray;
        }
    }
}
