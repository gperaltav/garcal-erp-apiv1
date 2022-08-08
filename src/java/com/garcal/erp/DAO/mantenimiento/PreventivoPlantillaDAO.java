/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.mantenimiento;


import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.ErrorEntity;
import com.garcal.erp.model.ResponseAnswer;
import com.garcal.erp.model.mantenimiento.PreventivoPlantilla;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.apache.commons.dbutils.DbUtils;

/**
 *
 * @author Teresa
 */
public class PreventivoPlantillaDAO extends ConnectionDB{
    
    public static ResponseAnswer insert(PreventivoPlantilla preventivoplantilla) {
        ResponseAnswer postResponse = null;
        String nroServicio = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM mantenimiento.fun_preventivoplantilla_insertar("
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "?  "
                    + " )";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, preventivoplantilla.getEmp_id());
            varPst.setInt(2, preventivoplantilla.getTar_id());
            varPst.setInt(3, preventivoplantilla.getVma_id());
            varPst.setDouble(4, preventivoplantilla.getPpa_avisokm());
            varPst.setDouble(5, preventivoplantilla.getPpa_km());
            varPst.setString(6, preventivoplantilla.getPpa_usucreacion());

            varPst.executeQuery();
            varPst.close();

            postResponse = new ResponseAnswer();
            postResponse.setStatus(Boolean.TRUE);
            postResponse.setMessage("insert full");
            postResponse.setIdCode(nroServicio);

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

    public static ResponseAnswer update(PreventivoPlantilla preventivoplantilla) {
        ResponseAnswer postResponse = null;

        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM mantenimiento.fun_preventivoplantilla_actualizar("
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
            varPst.setInt(1, preventivoplantilla.getPpa_id());
            varPst.setInt(2, preventivoplantilla.getEmp_id());
            varPst.setInt(3, preventivoplantilla.getTar_id());
            varPst.setInt(4, preventivoplantilla.getVma_id());
            varPst.setDouble(5, preventivoplantilla.getPpa_avisokm());
            varPst.setDouble(6, preventivoplantilla.getPpa_km());
            varPst.setString(7, preventivoplantilla.getPpa_usucreacion());

            varPst.executeQuery();
            varPst.close();

            postResponse = new ResponseAnswer();
            postResponse.setStatus(Boolean.TRUE);
            postResponse.setMessage("update full");

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

    public static ResponseAnswer delete(Integer id) {
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        ResponseAnswer postResponse = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM mantenimiento.fun_preventivoplantilla_borrar(?)";
            System.out.println(varSql);

            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, id);
            varPst.execute();
            varPst.close();

            postResponse = new ResponseAnswer();
            postResponse.setStatus(Boolean.TRUE);
            postResponse.setMessage("delete full");

        } catch (SQLException e) {
            postResponse = new ResponseAnswer();
            postResponse.setStatus(Boolean.FALSE);
            postResponse.setMessage(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            postResponse = new ResponseAnswer();
            postResponse.setStatus(Boolean.FALSE);
            postResponse.setMessage(e.getMessage());
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return postResponse;
        }
    }

    public static ArrayList<PreventivoPlantilla> selectID(Integer idppa) {
        ArrayList<PreventivoPlantilla> preventivoplantillaArray = new ArrayList<PreventivoPlantilla>();
        PreventivoPlantilla preventivoplantilla = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM mantenimiento.fun_preventivoplantilla_obtener(?)";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, idppa);
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    preventivoplantilla = new PreventivoPlantilla();
                    preventivoplantilla.setEmp_id(varResult.getInt("emp_id"));
                    preventivoplantilla.setTar_id(varResult.getInt("tar_id"));
                    preventivoplantilla.setVma_id(varResult.getInt("vma_id"));
                    preventivoplantilla.setPpa_avisokm(varResult.getDouble("ppa_avisokm"));
                    preventivoplantilla.setPpa_km(varResult.getDouble("ppa_km"));
                    preventivoplantilla.setPpa_usucreacion(varResult.getString("ppa_usucreacion"));
                    preventivoplantillaArray.add(preventivoplantilla);

                }
            }
        } catch (SQLException e) {
            preventivoplantilla = new PreventivoPlantilla();
            preventivoplantilla.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            preventivoplantillaArray.add(preventivoplantilla);
            e.printStackTrace();
        } catch (Exception e) {
            preventivoplantilla = new PreventivoPlantilla();
            preventivoplantilla.setErrorEntity(new ErrorEntity("Exception", "" + e));
            preventivoplantillaArray.add(preventivoplantilla);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return preventivoplantillaArray;
        }
    }
}
