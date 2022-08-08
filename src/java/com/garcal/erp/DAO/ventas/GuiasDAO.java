/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.ventas;

import com.garcal.erp.DAO.util.Utility;
import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.ErrorEntity;
import com.garcal.erp.model.ResponseAnswer;
import com.garcal.erp.model.ventas.Guias;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.time.LocalDate;
import java.util.ArrayList;
import org.apache.commons.dbutils.DbUtils;

/**
 *
 * @author User
 */
public class GuiasDAO extends ConnectionDB {

    public static ResponseAnswer insert(Guias guias) {
        ResponseAnswer postResponse = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM ventas.fun_guias_insertar("
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
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
            varPst.setInt(1, guias.getEmp_id());
            varPst.setDate(2, Utility.getStringToDate(guias.getGui_fechaemision()));
            varPst.setString(3, guias.getGti_codigo());
            varPst.setString(4, guias.getGui_serie());
            varPst.setString(5, guias.getGui_numero());
            varPst.setObject(6, guias.getVia_id(), Types.INTEGER);
            varPst.setObject(7, guias.getGui_entdestinatario(), Types.INTEGER);
            varPst.setObject(8, guias.getVeh_id(), Types.INTEGER);
            varPst.setObject(9, guias.getVeh_idacople(), Types.INTEGER);
            varPst.setObject(10, guias.getPro_id(), Types.INTEGER);
            varPst.setString(11, guias.getGui_estado());
            varPst.setDouble(12, guias.getGui_peso());
            varPst.setString(13, guias.getUbi_codigoorigen());
            varPst.setString(14, guias.getUbi_codigodestino());
            varPst.setString(15, guias.getGui_observacion());
            varPst.setString(16, guias.getGui_usucreacion());
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

    public static ResponseAnswer update(Guias guias) {

        ResponseAnswer postResponse = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM ventas.fun_guias_actualizar ("
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
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
            varPst.setInt(1, guias.getGui_id());
            varPst.setInt(2, guias.getEmp_id());
            varPst.setDate(3, Utility.getStringToDate(guias.getGui_fechaemision()));
            varPst.setString(4, guias.getGti_codigo());
            varPst.setString(5, guias.getGui_serie());
            varPst.setString(6, guias.getGui_numero());
            varPst.setObject(7, guias.getVia_id(), Types.INTEGER);
            varPst.setObject(8, guias.getGui_entdestinatario(), Types.INTEGER);
            varPst.setObject(9, guias.getVeh_id(), Types.INTEGER);
            varPst.setObject(10, guias.getVeh_idacople(), Types.INTEGER);
            varPst.setObject(11, guias.getPro_id(), Types.INTEGER);
            varPst.setString(12, guias.getGui_estado());
            varPst.setDouble(13, guias.getGui_peso());
            varPst.setString(14, guias.getUbi_codigoorigen());
            varPst.setString(15, guias.getUbi_codigodestino());
            varPst.setString(16, guias.getGui_observacion());
            varPst.setString(17, guias.getGui_usucreacion());
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
            String varSql = " SELECT * FROM ventas.fun_guias_borrar(?)";
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

    public static ArrayList<Guias> selectID(Integer idguias) {
        ArrayList<Guias> guiasArray = new ArrayList<Guias>();
        Guias guias = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM ventas.fun_guias_obtener(?)";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, idguias);
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    guias = new Guias();
                    guias.setEmp_id(varResult.getInt("emp_id"));
                    guias.setGui_fechaemision(Utility.getDateToString(varResult.getDate("gui_fechaemision")));
                    guias.setGti_codigo(varResult.getString("gti_codigo"));
                    guias.setGui_serie(varResult.getString("gui_serie"));
                    guias.setGui_numero(varResult.getString("gui_numero"));
                    guias.setVia_id(varResult.getInt("via_id"));
                    guias.setGui_entdestinatario(varResult.getInt("gui_entdestinatario"));
                    guias.setVeh_id(varResult.getInt("veh_id"));
                    guias.setVeh_idacople(varResult.getInt("veh_idacople"));
                    guias.setPro_id(varResult.getInt("pro_id"));
                    guias.setGui_estado(varResult.getString("gui_estado"));
                    guias.setGui_peso(varResult.getDouble("gui_peso"));
                    guias.setUbi_codigoorigen(varResult.getString("ubi_codigoorigen"));
                    guias.setUbi_codigodestino(varResult.getString("ubi_codigodestino"));
                    guias.setGui_observacion(varResult.getString("gui_observacion"));
                    guias.setGui_usucreacion(varResult.getString("gui_usucreacion"));
                    guias.setVia_descripcion(varResult.getString("via_descripcion"));
                    guiasArray.add(guias);
                }
            }
        } catch (SQLException e) {
            guias = new Guias();
            guias.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            guiasArray.add(guias);
            e.printStackTrace();
        } catch (Exception e) {
            guias = new Guias();
            guias.setErrorEntity(new ErrorEntity("Exception", "" + e));
            guiasArray.add(guias);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return guiasArray;

        }
    }

    public static ArrayList<Guias> selectGuias(Guias guias) {

        ArrayList<Guias> guiasArray = new ArrayList<Guias>();

        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM ventas.fun_guias_obtener_filtro("
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "?  "
                    + " )";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, guias.getEmp_id());
            varPst.setString(2, guias.getGti_codigo());
            varPst.setString(3, guias.getGui_serienumero());
            varPst.setDate(4, guias.getGui_fechaemision_inicio());
            varPst.setDate(5, guias.getGui_fechaemision_fin());
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    guias = new Guias();
                    guias.setGui_id(varResult.getInt("gui_id"));
                    guias.setGti_descripcion(varResult.getString("gti_descripcion"));
                    guias.setEmp_razonsocial(varResult.getString("emp_razonsocial"));
                    guias.setGui_fechaemision(Utility.getDateToString(varResult.getDate("gui_fechaemision")));
                    guias.setGui_serienumero(varResult.getString("gui_serienumero"));
                    guias.setVeh_placa(varResult.getString("veh_placa"));
                    guias.setVia_descripcion(varResult.getString("via_descripcion"));
                    guias.setGui_estado(varResult.getString("gui_estado"));
                    guias.setVia_descripcion(varResult.getString("via_descripcion"));
                    guiasArray.add(guias);
                }
            }
        } catch (SQLException e) {
            guias = new Guias();
            guias.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            guiasArray.add(guias);
            e.printStackTrace();
        } catch (Exception e) {
            guias = new Guias();
            guias.setErrorEntity(new ErrorEntity("Exception", "" + e));
            guiasArray.add(guias);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return guiasArray;
        }
    }

    public static ArrayList<Guias> selectAll() {
        Guias guias = new Guias();
        guias.setEmp_id(0);
        guias.setGti_codigo("");
        guias.setGui_serienumero("");
        guias.setGui_fechaemision_inicio(null);//revisar fecha 
        guias.setGui_fechaemision_fin(null);
        return selectGuias(guias);

    }
}
