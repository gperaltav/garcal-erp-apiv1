/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.basedatos;

import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.basedatos.Documentos;
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
public class DocumentosDAO extends ConnectionDB {

    public static ArrayList<Documentos> selectAll(Documentos documentos) {
        ArrayList<Documentos> documentosArray = new ArrayList<Documentos>();
        // Documentos documentos = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM public.fun_get_documentostipos_all(?,?)";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, documentos.getEmp_id());
            varPst.setString(2, documentos.getDti_referencia_uso());

            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    documentos = new Documentos();
                    documentos.setDti_id(varResult.getString("dti_id"));
                    documentos.setDti_nombre(varResult.getString("dti_nombre"));
                    documentosArray.add(documentos);
                }
            }
        } catch (SQLException e) {
            documentos = new Documentos();
            documentos.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            documentosArray.add(documentos);
            e.printStackTrace();
        } catch (Exception e) {
            documentos = new Documentos();
            documentos.setErrorEntity(new ErrorEntity("Exception", "" + e));
            documentosArray.add(documentos);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return documentosArray;
        }
    }

}
