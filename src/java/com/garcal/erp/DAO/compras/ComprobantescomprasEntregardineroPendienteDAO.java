/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.compras;

import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.ErrorEntity;
import com.garcal.erp.model.compras.ComprobantescomprasEntregardineroPendiente;
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
public class ComprobantescomprasEntregardineroPendienteDAO extends ConnectionDB {

    public static ArrayList<ComprobantescomprasEntregardineroPendiente> selectFiltro(ComprobantescomprasEntregardineroPendiente comprobantescomprasEntregardineroPendiente) {

        ArrayList<ComprobantescomprasEntregardineroPendiente> comprobantescomprasEntregardineroPendienteArray = new ArrayList<ComprobantescomprasEntregardineroPendiente>();

        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM compras.fun_comprobantescompras_obtener_entregardinero_pendiente(?)";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setString(1, comprobantescomprasEntregardineroPendiente.getTra_nrodocumento());
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    comprobantescomprasEntregardineroPendiente = new ComprobantescomprasEntregardineroPendiente();
                    comprobantescomprasEntregardineroPendiente.setCcc_id(varResult.getInt("ccc_id"));
                    comprobantescomprasEntregardineroPendiente.setCcc_observaciones(varResult.getString("ccc_observaciones"));
                    comprobantescomprasEntregardineroPendiente.setCcc_total(varResult.getDouble("ccc_total"));
                    comprobantescomprasEntregardineroPendiente.setUsu_codigo(varResult.getString("usu_codigo"));
                    comprobantescomprasEntregardineroPendienteArray.add(comprobantescomprasEntregardineroPendiente);
                }

            }

        } catch (SQLException e) {
            comprobantescomprasEntregardineroPendiente = new ComprobantescomprasEntregardineroPendiente();
            comprobantescomprasEntregardineroPendiente.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            comprobantescomprasEntregardineroPendienteArray.add(comprobantescomprasEntregardineroPendiente);
            e.printStackTrace();
        } catch (Exception e) {
            comprobantescomprasEntregardineroPendiente = new ComprobantescomprasEntregardineroPendiente();
            comprobantescomprasEntregardineroPendiente.setErrorEntity(new ErrorEntity("Exception", "" + e));
            comprobantescomprasEntregardineroPendienteArray.add(comprobantescomprasEntregardineroPendiente);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return comprobantescomprasEntregardineroPendienteArray;
        }
    }

}
