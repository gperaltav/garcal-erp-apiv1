/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.planificacionviajes;

import com.garcal.erp.DAO.util.Utility;
import com.garcal.erp.connection.ConnectionDB;

import com.garcal.erp.model.ErrorEntity;
import com.garcal.erp.model.ResponseAnswer;
import com.garcal.erp.model.planificacionviajes.Viajes;
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
public class ViajesDAO extends ConnectionDB {

    public static ResponseAnswer insert(Viajes viajes) {
        ResponseAnswer postResponse = null;

        String nroServicio = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM operaciones.fun_viajes_insertar("
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
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? "
                    + " )";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, viajes.getEmp_id());
            varPst.setInt(2, viajes.getRut_id());
            varPst.setInt(3, viajes.getVeh_idtracto());
            varPst.setInt(4, viajes.getVeh_idremolque());
            varPst.setInt(5, viajes.getEnt_id());
            varPst.setInt(6, viajes.getVia_serie());
            varPst.setInt(7, viajes.getVia_numero());
            varPst.setDate(8, Utility.getStringToDate(viajes.getVia_fechaviaje()));
            varPst.setTime(9, Utility.getStringToTime(viajes.getVia_horaviaje()));
            varPst.setDouble(10, viajes.getVia_subtotal());
            varPst.setDouble(11, viajes.getVia_impuesto());
            varPst.setDouble(12, viajes.getVia_total());
            varPst.setString(13, viajes.getVia_observacion());
            varPst.setString(14, viajes.getVia_usucreacion());
            varPst.setString(15, viajes.getVie_codigo());
            varPst.setString(16, viajes.getUbi_codigoorigen());
            varPst.setString(17, viajes.getUbi_codigodestino());
            varPst.setString(18, viajes.getVfl_codigo());
            varPst.setInt(19, viajes.getPro_id());
            varPst.setInt(20, viajes.getTri_id());
            varPst.setDouble(21, viajes.getVia_cantidad());
            varResult = varPst.executeQuery();
            if (varResult.next()) {
                nroServicio = varResult.getString("fun_viajes_insertar");
            }
            varResult.close();
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

    public static ArrayList<Viajes> selectFilter(Viajes viajes) {
        ArrayList<Viajes> viajesArray = new ArrayList<Viajes>();
        // Trabajadores trabajadores = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM operaciones.fun_viajes_obtener_filtro("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ")";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, viajes.getEmp_id());
            varPst.setDate(2, Utility.getStringToDate(viajes.getVia_fechaviajeinicio()));
            varPst.setDate(3, Utility.getStringToDate(viajes.getVia_fechaviajefin()));
            varPst.setString(4, viajes.getVeh_placa());
            varPst.setString(5, viajes.getUbi_nombreorigen());
            varPst.setString(6, viajes.getUbi_nombredestino());
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    viajes = new Viajes();
                    viajes.setVia_id(varResult.getInt("via_id"));
                    viajes.setEmp_razonsocial(varResult.getString("emp_razonsocial"));
                    viajes.setVia_ordenservicio(varResult.getString("via_ordenservicio"));
                    viajes.setVia_fechaviaje(Utility.getDateToString(varResult.getDate("via_fechaviaje")));
                    viajes.setVia_horaviaje(Utility.getTimeToString(varResult.getTime("via_horaviaje")));
                    viajes.setVeh_semiremolque(varResult.getString("veh_semiremolque"));
                    viajes.setVeh_tracto(varResult.getString("veh_tracto"));
                    viajes.setVeh_conductor(varResult.getString("veh_conductor"));
                    viajes.setVfl_nombre(varResult.getString("vfl_nombre"));
                    // viajes.setVeh_tipoflete(varResult.getString("veh_tipoflete"));
                    viajes.setUbi_nombreorigen(varResult.getString("origen"));
                    viajes.setUbi_nombredestino(varResult.getString("destino"));
                    viajes.setTri_licencianro(varResult.getString("tri_licencianro"));
                    viajes.setVie_nombre(varResult.getString("vie_nombre"));
                    viajes.setVie_codigo(varResult.getString("vie_codigo"));
                    viajesArray.add(viajes);
                }

            }

        } catch (SQLException e) {
            viajes = new Viajes();
            viajes.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            viajesArray.add(viajes);
            e.printStackTrace();
        } catch (Exception e) {
            viajes = new Viajes();
            viajes.setErrorEntity(new ErrorEntity("Exception", "" + e));
            viajesArray.add(viajes);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return viajesArray;
        }

    }

    public static ArrayList<Viajes> selectID(Integer idviajes) {
        ArrayList<Viajes> viajesArray = new ArrayList<Viajes>();
        Viajes viajes = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM operaciones.fun_viajes_obtener(?)";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, idviajes);
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    viajes = new Viajes();
                    viajes.setEmp_id(varResult.getInt("emp_id"));
                    viajes.setRut_id(varResult.getInt("rut_id"));
                    viajes.setVeh_idtracto(varResult.getInt("veh_idtracto"));
                    viajes.setVeh_idremolque(varResult.getInt("veh_idsemiremolque"));
                    viajes.setEnt_id(varResult.getInt("ent_id"));
                    viajes.setVia_serie(varResult.getInt("via_serie"));
                    viajes.setVia_numero(varResult.getInt("via_numero"));
                    viajes.setVia_fechaviaje(Utility.getDateToString(varResult.getDate("via_fechaviaje")));
                    viajes.setVia_horaviaje(Utility.getTimeToString2(varResult.getTime("via_horaviaje")));
                    viajes.setVia_subtotal(varResult.getDouble("via_subtotal"));
                    viajes.setVia_impuesto(varResult.getDouble("via_impuesto"));
                    viajes.setVia_total(varResult.getDouble("via_total"));
                    viajes.setVia_observacion(varResult.getString("via_observacion"));
                    viajes.setTri_id(varResult.getInt("tri_id"));
                    viajes.setUbi_codigoorigen(varResult.getString("origen"));
                    viajes.setUbi_codigodestino(varResult.getString("destino"));
                    viajes.setVfl_codigo(varResult.getString("vfl_codigo"));
                    viajes.setPro_id(varResult.getInt("pro_id"));
                    viajes.setVeh_acople(varResult.getString("veh_acople"));
                    viajes.setVeh_tracto(varResult.getString("veh_tracto"));
                    viajes.setVeh_conductor(varResult.getString("veh_conductor"));
                    viajes.setVeh_flete(varResult.getString("veh_flete"));
                    viajes.setOrigen_nombre(varResult.getString("origen_nombre"));
                    viajes.setOrigen_destino(varResult.getString("origen_destino"));
                    viajes.setPro_descripcion(varResult.getString("pro_descripcion"));
                    viajes.setEnt_nrodocumento(varResult.getString("ent_nrodocumento"));
                    viajes.setEnt_nombre(varResult.getString("ent_nombre"));

                    viajesArray.add(viajes);
                }
            }
        } catch (SQLException e) {
            viajes = new Viajes();
            viajes.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            viajesArray.add(viajes);
            e.printStackTrace();
        } catch (Exception e) {
            viajes = new Viajes();
            viajes.setErrorEntity(new ErrorEntity("Exception", "" + e));
            viajesArray.add(viajes);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return viajesArray;
        }
    }

    public static ResponseAnswer update(Viajes viajes) {

        ResponseAnswer postResponse = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM operaciones.fun_viajes_actualizar ("
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
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "?  "
                    + " )";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, viajes.getVia_id());
            varPst.setInt(2, viajes.getEmp_id());
            varPst.setInt(3, viajes.getRut_id());
            varPst.setInt(4, viajes.getVeh_idtracto());
            varPst.setInt(5, viajes.getVeh_idremolque());
            varPst.setInt(6, viajes.getEnt_id());
            varPst.setInt(7, viajes.getVia_serie());
            varPst.setInt(8, viajes.getVia_numero());
            varPst.setDate(9, Utility.getStringToDate(viajes.getVia_fechaviaje()));
            varPst.setTime(10, Utility.getStringToTime(viajes.getVia_horaviaje()));
            varPst.setDouble(11, viajes.getVia_subtotal());
            varPst.setDouble(12, viajes.getVia_impuesto());
            varPst.setDouble(13, viajes.getVia_total());
            varPst.setString(14, viajes.getVia_observacion());
            varPst.setString(15, viajes.getVia_usumodificacion());
            varPst.setString(16, viajes.getVie_codigo());
            varPst.setString(17, viajes.getUbi_codigoorigen());
            varPst.setString(18, viajes.getUbi_codigodestino());
            varPst.setString(19, viajes.getVfl_codigo());
            varPst.setInt(20, viajes.getPro_id());
            varPst.setInt(21, viajes.getTri_id());
            varPst.setDouble(22, viajes.getVia_cantidad());
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
            String varSql = " SELECT * FROM operaciones.fun_viajes_borrar(?)";
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

    public static ArrayList<Viajes> selectAll() {
        Viajes viajes = new Viajes();
        viajes.setEmp_id(0);
        viajes.setVia_fechaviajeinicio(null);
        viajes.setVia_fechaviajefin(null);
        viajes.setVeh_placa("");
        viajes.setRut_nombre("");
        return selectFilter(viajes);

    }

    public static ResponseAnswer updateCodigo(Viajes viajes) {

        ResponseAnswer postResponse = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM operaciones.fun_viajes_actualizarxcodigo("
                    + "? ,"
                    + "?  "
                    + " )";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, viajes.getVia_id());
            varPst.setString(2, viajes.getVie_codigo());
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

    public static ArrayList<Viajes> selectIDcodigo(Integer idvia) {
        ArrayList<Viajes> viajesArray = new ArrayList<Viajes>();
        Viajes viajes = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM operaciones.fun_viajesxcodigo_get(?)";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, idvia);
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    viajes = new Viajes();
                    viajes.setVie_codigo(varResult.getString("vie_codigo"));
                    viajesArray.add(viajes);
                }
            }
        } catch (SQLException e) {
            viajes = new Viajes();
            viajes.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            viajesArray.add(viajes);
            e.printStackTrace();
        } catch (Exception e) {
            viajes = new Viajes();
            viajes.setErrorEntity(new ErrorEntity("Exception", "" + e));
            viajesArray.add(viajes);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return viajesArray;
        }
    }

}
