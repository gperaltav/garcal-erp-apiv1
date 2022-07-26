/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.ventas;

import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.ErrorEntity;
import com.garcal.erp.model.ventas.ComprobatesVentasTipos;
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
public class ComprobatesVentasTiposDAO extends ConnectionDB {

    public static ArrayList<ComprobatesVentasTipos> selectAll(Integer idEmpresa) {
        ArrayList<ComprobatesVentasTipos> comprobatesVentasTiposArray = new ArrayList<ComprobatesVentasTipos>();

        ComprobatesVentasTipos comprobatesVentasTipos = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "  SELECT * FROM ventas.fun_comprobatesventastipos_obtener(?)";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, idEmpresa);
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    comprobatesVentasTipos = new ComprobatesVentasTipos();
                    comprobatesVentasTipos.setCvt_codigo(varResult.getString("cvt_codigo"));
                    comprobatesVentasTipos.setCvt_descripcion(varResult.getString("cvt_descripcion"));
                    comprobatesVentasTipos.setCvt_maxitems(varResult.getInt("cvt_maxitems"));
                    comprobatesVentasTipos.setCvt_codigosunat(varResult.getString("cvt_codigosunat"));
                    comprobatesVentasTipos.setCvt_usucreacion(varResult.getString("cvt_usucreacion"));
                    comprobatesVentasTiposArray.add(comprobatesVentasTipos);
                }
            }
        } catch (SQLException e) {
            comprobatesVentasTipos = new ComprobatesVentasTipos();
            comprobatesVentasTipos.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            comprobatesVentasTiposArray.add(comprobatesVentasTipos);
            e.printStackTrace();
        } catch (Exception e) {
            comprobatesVentasTipos = new ComprobatesVentasTipos();
            comprobatesVentasTipos.setErrorEntity(new ErrorEntity("Exception", "" + e));
            comprobatesVentasTiposArray.add(comprobatesVentasTipos);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return comprobatesVentasTiposArray;
        }
    }

}
