/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.basedatos;

import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.ErrorEntity;
import com.garcal.erp.model.basedatos.FormasDePago;
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
public class FormasDePagoDAO extends ConnectionDB {

    public static ArrayList<FormasDePago> selectAll(Integer idEmpresa) {

        ArrayList<FormasDePago> formasDePagosArray = new ArrayList<FormasDePago>();
        FormasDePago formasDePagos = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM caja.fun_formasdepago_obtener_todo(?)";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, idEmpresa);
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    formasDePagos = new FormasDePago();
                    formasDePagos.setFdp_id(varResult.getString("fdp_id"));
                    formasDePagos.setMon_id(varResult.getString("mon_id"));
                    formasDePagos.setFdp_descripcion(varResult.getString("fdp_descripcion"));
                    formasDePagos.setFpd_diasvencimentos(varResult.getInt("fpd_diasvencimiento"));
                    formasDePagosArray.add(formasDePagos);
                }
            }
        } catch (SQLException e) {
            formasDePagos = new FormasDePago();
            formasDePagos.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            formasDePagosArray.add(formasDePagos);
            e.printStackTrace();
        } catch (Exception e) {
            formasDePagos = new FormasDePago();
            formasDePagos.setErrorEntity(new ErrorEntity("Exception", "" + e));
            formasDePagosArray.add(formasDePagos);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return formasDePagosArray;
        }
    }

}
