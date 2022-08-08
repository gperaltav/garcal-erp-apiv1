/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.basedatos;

import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.ErrorEntity;
import com.garcal.erp.model.ResponseAnswer;
import com.garcal.erp.model.basedatos.Ubigeo;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.apache.commons.dbutils.DbUtils;

/**
 *
 * @author Gloria Peralta <gloria.ypv@gmail.com>
 */
public class UbigeoDAO extends ConnectionDB {

    public static ResponseAnswer insert(Ubigeo ubigeo) {
        ResponseAnswer postResponse = null;

        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM public.fun_ubigeos_insertar("
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "?  "
                    + " )";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setString(1, ubigeo.getUbi_codigo());
            varPst.setString(2, ubigeo.getUbi_nombre());
            varPst.setString(3, ubigeo.getUbi_departamento());
            varPst.setString(4, ubigeo.getUbi_provincia());
            varPst.setString(5, ubigeo.getUbi_distrito());
            varPst.setString(6, ubigeo.getUbi_nombrecompleto());
            varPst.setString(7, ubigeo.getUbi_departamentonombre());
            varPst.setString(8, ubigeo.getUbi_provincianombre());
            varPst.setString(9, ubigeo.getUbi_usucreacion());
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

    public static ArrayList<Ubigeo> selectFilter(Ubigeo ubigeo) {
        ArrayList<Ubigeo> ubigeoArray = new ArrayList<Ubigeo>();
        // Trabajadores trabajadores = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM public.fun_ubigeos_filtro(?)";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setString(1, ubigeo.getUbi_provincia());

            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    ubigeo = new Ubigeo();
                    ubigeo.setUbi_codigo(varResult.getString("ubi_codigo"));
                    ubigeo.setUbi_nombre(varResult.getString("ubi_nombre"));
                    ubigeo.setUbi_departamento(varResult.getString("ubi_departamento"));
                    ubigeo.setUbi_distrito(varResult.getString("ubi_distrito"));
                    ubigeo.setUbi_nombrecompleto(varResult.getString("ubi_nombrecompleto"));
                    ubigeo.setUbi_departamentonombre(varResult.getString("ubi_departamentonombre"));
                    ubigeo.setUbi_provincianombre(varResult.getString("ubi_provincianombre"));
                    ubigeoArray.add(ubigeo);
                }

            }

        } catch (SQLException e) {
            ubigeo = new Ubigeo();
            ubigeo.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            ubigeoArray.add(ubigeo);
            e.printStackTrace();
        } catch (Exception e) {
            ubigeo = new Ubigeo();
            ubigeo.setErrorEntity(new ErrorEntity("Exception", "" + e));
            ubigeoArray.add(ubigeo);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return ubigeoArray;
        }

    }

    public static ArrayList<Ubigeo> selectAll(Ubigeo ubigeo) {

        ArrayList<Ubigeo> ubigeoArray = new ArrayList<Ubigeo>();
        //  Ubigeo ubigeo = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM public.fun_ubigeo_obtener(?)";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setString(1, ubigeo.getUbi_nombre());
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    ubigeo = new Ubigeo();
                    ubigeo.setUbi_codigo(varResult.getString("ubi_codigo"));
                    ubigeo.setUbi_nombre(varResult.getString("ubi_nombre"));
                    ubigeo.setUbi_nombrecompleto(varResult.getString("ubi_nombrecompleto"));
                    ubigeoArray.add(ubigeo);
                }
            }
        } catch (SQLException e) {
            ubigeo = new Ubigeo();
            ubigeo.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            ubigeoArray.add(ubigeo);
            e.printStackTrace();
        } catch (Exception e) {
            ubigeo = new Ubigeo();
            ubigeo.setErrorEntity(new ErrorEntity("Exception", "" + e));
            ubigeoArray.add(ubigeo);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return ubigeoArray;
        }
    }

}
