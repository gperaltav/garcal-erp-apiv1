/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.mantenimiento;

import com.garcal.erp.DAO.util.Utility;
import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.ErrorEntity;
import com.garcal.erp.model.ResponseAnswer;
import com.garcal.erp.model.mantenimiento.ProgramacionMantenimiento;
import com.garcal.erp.model.mantenimiento.ProgramacionMantenimientoDet;
import java.sql.Array;
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
public class ProgramacionMantenimientoDAO extends ConnectionDB{
  
    public static ResponseAnswer insert(ProgramacionMantenimiento programacionmantenimiento) {
        ResponseAnswer postResponse = null;
        String nroServicio = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            ArrayList<ProgramacionMantenimientoDet> detail = programacionmantenimiento.getDetalle();

            ArrayList<Integer> tar_id = new ArrayList();
            ArrayList<Double> pma_avisokm = new ArrayList();
            ArrayList<Double> pma_km = new ArrayList();

            if (detail != null) {
                for (int i = 0; i < detail.size(); i++) {
                    tar_id.add(detail.get(i).getTar_id());
                    pma_avisokm.add(detail.get(i).getPma_avisokm());
                    pma_km.add(detail.get(i).getPma_km());

                }
            }

            Array arrayTar_id = varConn.createArrayOf("int4", tar_id.toArray());
            Array arrayPma_avisokm = varConn.createArrayOf("float8", pma_avisokm.toArray());
            Array arrayPma_km = varConn.createArrayOf("float8", pma_km.toArray());

            String varSql = "SELECT * FROM mantenimiento.fun_programacionmantenimiento_insertar("
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
            varPst.setInt(1, programacionmantenimiento.getEmp_id());
            varPst.setInt(2, programacionmantenimiento.getVeh_id());

            varPst.setArray(3, arrayTar_id);
            varPst.setArray(4, arrayPma_avisokm);
            varPst.setArray(5, arrayPma_km);

            varPst.setDate(6, Utility.getStringToDate(programacionmantenimiento.getPma_fechamantenimiento()));
            varPst.setDouble(7, programacionmantenimiento.getPma_ultimokm());
            varPst.setString(8, programacionmantenimiento.getPma_usucreacion());
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

    public static ResponseAnswer update(ProgramacionMantenimiento programacionmantenimiento) {
        ResponseAnswer postResponse = null;

        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM mantenimiento.fun_programacionmantenimiento_actualizar("
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
            varPst.setInt(1, programacionmantenimiento.getPma_id());
            varPst.setInt(2, programacionmantenimiento.getEmp_id());
            varPst.setInt(3, programacionmantenimiento.getTar_id());
            varPst.setInt(4, programacionmantenimiento.getVeh_id());
            varPst.setDouble(5, programacionmantenimiento.getPma_avisokm());
            varPst.setDouble(6, programacionmantenimiento.getPma_km());
            varPst.setDate(7, Utility.getStringToDate(programacionmantenimiento.getPma_fechamantenimiento()));
            varPst.setDouble(8, programacionmantenimiento.getPma_ultimokm());
            varPst.setString(9, programacionmantenimiento.getPma_usucreacion());
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
            String varSql = "SELECT * FROM mantenimiento.fun_programacionmantenimiento_borrar(?)";
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

    public static ArrayList<ProgramacionMantenimiento> selectFiltro(ProgramacionMantenimiento programacionmantenimiento) {
        ArrayList<ProgramacionMantenimiento> programacionmantenimientoArray = new ArrayList<ProgramacionMantenimiento>();

        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM mantenimiento.fun_programacionmantenimiento_obtener_filtro("
                    + "? ,"
                    + "?  "
                    + " )";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, programacionmantenimiento.getEmp_id());
            varPst.setString(2, programacionmantenimiento.getVeh_placa());
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    programacionmantenimiento = new ProgramacionMantenimiento();
                    programacionmantenimiento.setEmp_razonsocial(varResult.getString("emp_razonsocial"));
                    programacionmantenimiento.setVeh_placa(varResult.getString("veh_placa"));
                    programacionmantenimiento.setTar_cantidad(varResult.getString("tar_cantidad"));
                    programacionmantenimientoArray.add(programacionmantenimiento);
                }

            }

        } catch (SQLException e) {
            programacionmantenimiento = new ProgramacionMantenimiento();
            programacionmantenimiento.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            programacionmantenimientoArray.add(programacionmantenimiento);
            e.printStackTrace();
        } catch (Exception e) {
            programacionmantenimiento = new ProgramacionMantenimiento();
            programacionmantenimiento.setErrorEntity(new ErrorEntity("Exception", "" + e));
            programacionmantenimientoArray.add(programacionmantenimiento);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return programacionmantenimientoArray;
        }
    }

    public static ArrayList<ProgramacionMantenimiento> selectAll(Integer id) {

        ArrayList<ProgramacionMantenimiento> programacionmantenimientoArray = new ArrayList<ProgramacionMantenimiento>();
        ProgramacionMantenimiento programacionmantenimiento = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM mantenimiento.fun_programacionmantenimiento_obtener(?)";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, id);
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    programacionmantenimiento = new ProgramacionMantenimiento();
                    programacionmantenimiento.setEmp_id(varResult.getInt("emp_id"));
                    programacionmantenimiento.setTar_id(varResult.getInt("tar_id"));
                    programacionmantenimiento.setVeh_id(varResult.getInt("veh_id"));
                    programacionmantenimiento.setPma_avisokm(varResult.getDouble("pma_avisokm"));
                    programacionmantenimiento.setPma_km(varResult.getDouble("pma_km"));
                    programacionmantenimiento.setPma_fechamantenimiento(Utility.getDateToString(varResult.getDate("pma_fechamantenimiento")));
                    programacionmantenimiento.setPma_ultimokm(varResult.getDouble("pma_ultimokm"));
                    programacionmantenimiento.setPma_usucreacion(varResult.getString("pma_usucreacion"));
                    programacionmantenimientoArray.add(programacionmantenimiento);
                }
            }
        } catch (SQLException e) {
            programacionmantenimiento = new ProgramacionMantenimiento();
            programacionmantenimiento.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            programacionmantenimientoArray.add(programacionmantenimiento);
            e.printStackTrace();
        } catch (Exception e) {
            programacionmantenimiento = new ProgramacionMantenimiento();
            programacionmantenimiento.setErrorEntity(new ErrorEntity("Exception", "" + e));
            programacionmantenimientoArray.add(programacionmantenimiento);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return programacionmantenimientoArray;
        }
    }
    
    public static ArrayList<ProgramacionMantenimiento> selectPro(ProgramacionMantenimiento programacionmantenimiento) {
        ArrayList<ProgramacionMantenimiento> programacionmantenimientoArray = new ArrayList<ProgramacionMantenimiento>();

        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM mantenimiento.fun_programacionmantenimiento_obtenerr("
                    + "? ,"
                    + "?  "
                    + " )";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setString(1, programacionmantenimiento.getTar_descripcion());
            varPst.setString(2, programacionmantenimiento.getVeh_placa());
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    programacionmantenimiento = new ProgramacionMantenimiento();
                    programacionmantenimiento.setPma_avisokm(varResult.getDouble("pma_avisokm"));
                    programacionmantenimiento.setPma_km(varResult.getDouble("pma_km"));
                    programacionmantenimiento.setPma_fechamantenimiento(Utility.getDateToString(varResult.getDate("pma_fechamantenimiento")));
                    programacionmantenimiento.setPma_ultimokm(varResult.getDouble("pma_ultimokm"));
                    programacionmantenimientoArray.add(programacionmantenimiento);
                }

            }

        } catch (SQLException e) {
            programacionmantenimiento = new ProgramacionMantenimiento();
            programacionmantenimiento.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            programacionmantenimientoArray.add(programacionmantenimiento);
            e.printStackTrace();
        } catch (Exception e) {
            programacionmantenimiento = new ProgramacionMantenimiento();
            programacionmantenimiento.setErrorEntity(new ErrorEntity("Exception", "" + e));
            programacionmantenimientoArray.add(programacionmantenimiento);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return programacionmantenimientoArray;
        }
    }

    

}
