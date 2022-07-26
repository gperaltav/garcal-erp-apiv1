/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.ventas;

import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.ErrorEntity;
import com.garcal.erp.model.ventas.ComprobantesVentasEstados;
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
public class ComprobantesVentasEstadosDAO extends ConnectionDB {

    public static ArrayList<ComprobantesVentasEstados> selectAll(Integer idEmpresa) {

        ArrayList<ComprobantesVentasEstados> comprobantesVentasEstadosArray = new ArrayList<ComprobantesVentasEstados>();
        ComprobantesVentasEstados comprobantesVentasEstados = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "  SELECT * FROM ventas.fun_comprobantesventasestados_obtener(?)";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, idEmpresa);
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    comprobantesVentasEstados = new ComprobantesVentasEstados();
                    comprobantesVentasEstados.setCve_codigo(varResult.getString("cve_codigo"));
                    comprobantesVentasEstados.setCve_descripcion(varResult.getString("cve_descripcion"));
                    comprobantesVentasEstados.setCve_usucreacion(varResult.getString("cve_usucreacion"));
                    comprobantesVentasEstadosArray.add(comprobantesVentasEstados);
                }
            }
        } catch (SQLException e) {
            comprobantesVentasEstados = new ComprobantesVentasEstados();
            comprobantesVentasEstados.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            comprobantesVentasEstadosArray.add(comprobantesVentasEstados);
            e.printStackTrace();
        } catch (Exception e) {
            comprobantesVentasEstados = new ComprobantesVentasEstados();
            comprobantesVentasEstados.setErrorEntity(new ErrorEntity("Exception", "" + e));
            comprobantesVentasEstadosArray.add(comprobantesVentasEstados);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return comprobantesVentasEstadosArray;
        }
    }

}
