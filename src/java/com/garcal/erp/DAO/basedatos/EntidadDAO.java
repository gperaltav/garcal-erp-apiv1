/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.basedatos;

import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.basedatos.Entidad;
import com.garcal.erp.model.ErrorEntity;
import com.garcal.erp.model.ResponseAnswer;
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
public class EntidadDAO extends ConnectionDB {

    public static ResponseAnswer insert(Entidad entidad) {
        ResponseAnswer postResponse = null;

        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        Integer idTrabajador = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM public.fun_entidad_insertar("
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
                    + "? ,"
                    + "? ,"
                    + "? "
                    + " )";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, entidad.getEmp_id());
            varPst.setString(2, entidad.getUbi_codigo());
            varPst.setString(3, entidad.getEnt_nombre());
            varPst.setString(4, entidad.getDti_id());
            varPst.setString(5, entidad.getEnt_nrodocumento());
            varPst.setString(6, entidad.getEnt_apellidopaterno());
            varPst.setString(7, entidad.getEnt_apellidomaterno());
            varPst.setBoolean(8, entidad.getEnt_activo());
            varPst.setInt(9, entidad.getZon_id());
            varPst.setString(10, entidad.getEnt_direccion());
            varPst.setString(11, entidad.getEnt_telefono());
            varPst.setString(12, entidad.getEnt_celular());
            varPst.setString(13, entidad.getEnt_paginaweb());
            varPst.setString(14, entidad.getEnt_correo());
            varPst.setString(15, entidad.getEnt_contacto());
            varPst.setString(16, entidad.getEnt_sexo());
            varPst.setString(17, entidad.getEnt_usucreacion());
            varPst.setBoolean(18, entidad.getEnt_personanatural());
            varPst.setBoolean(19, entidad.getEnt_estadocontribuyente());
            varPst.setBoolean(20, entidad.getEnt_condicioncontribuyente());
            varPst.setString(21, entidad.getExt_id());
            varPst.setInt(22, entidad.getPro_id());
            varPst.setString(23, entidad.getFdp_id());
            varPst.setInt(24, entidad.getFpd_diasvencimiento());

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

    public static ResponseAnswer update(Entidad entidad) {
        ResponseAnswer postResponse = null;

        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM public.fun_entidad_actualizar ("
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
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "?"
                    + " )";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, entidad.getEnt_id());
            varPst.setInt(2, entidad.getEmp_id());
            varPst.setString(3, entidad.getUbi_codigo());
            varPst.setString(4, entidad.getEnt_nombre());
            varPst.setString(5, entidad.getDti_id());
            varPst.setString(6, entidad.getEnt_nrodocumento());
            varPst.setString(7, entidad.getEnt_apellidopaterno());
            varPst.setString(8, entidad.getEnt_apellidomaterno());
            varPst.setBoolean(9, entidad.getEnt_activo());
            varPst.setInt(10, entidad.getZon_id());
            varPst.setString(11, entidad.getEnt_direccion());
            varPst.setString(12, entidad.getEnt_telefono());
            varPst.setString(13, entidad.getEnt_celular());
            varPst.setString(14, entidad.getEnt_paginaweb());
            varPst.setString(15, entidad.getEnt_correo());
            varPst.setString(16, entidad.getEnt_contacto());
            varPst.setString(17, entidad.getEnt_sexo());
            varPst.setBoolean(18, entidad.getEnt_personanatural());
            varPst.setBoolean(19, entidad.getEnt_estadocontribuyente());
            varPst.setBoolean(20, entidad.getEnt_condicioncontribuyente());
            varPst.setString(21, entidad.getEnt_usucreacion());
            varPst.setString(22, entidad.getExt_id());
            varPst.setInt(23, entidad.getPro_id());
            varPst.setString(24, entidad.getFdp_id());
            varPst.setInt(25, entidad.getFpd_diasvencimiento());
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

    public static ResponseAnswer delete(Entidad entidad) {
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        ResponseAnswer postResponse = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM public.fun_entidad_borrar(?,?,?)";
            System.out.println(varSql);

            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, entidad.getEnt_id());
            varPst.setString(2, entidad.getExt_id());
            varPst.setInt(3, entidad.getEmp_id());
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

    public static ArrayList<Entidad> selectID(Integer idEntidad, Entidad entidad) {
        ArrayList<Entidad> entidadArray = new ArrayList<Entidad>();
        // Entidad entidad = null; 
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();

            String varSql = " SELECT * FROM public.fun_entidad_obtener(?,?,?)";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, idEntidad);
            varPst.setInt(2, entidad.getEmp_id());
            varPst.setString(3, entidad.getExt_id());
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    entidad = new Entidad();
                    entidad.setEnt_id(varResult.getInt("ent_id"));
                    entidad.setEmp_id(varResult.getInt("emp_id"));
                    entidad.setUbi_codigo(varResult.getString("ubi_codigo"));
                    entidad.setEnt_nombre(varResult.getString("ent_nombre"));
                    entidad.setDti_id(varResult.getString("dti_id"));
                    entidad.setEnt_nrodocumento(varResult.getString("ent_nrodocumento"));
                    entidad.setEnt_apellidopaterno(varResult.getString("ent_apellidopaterno"));
                    entidad.setEnt_apellidomaterno(varResult.getString("ent_apellidomaterno"));
                    entidad.setEnt_activo(varResult.getBoolean("ent_activo"));
                    entidad.setZon_id(varResult.getInt("zon_id"));
                    entidad.setEnt_direccion(varResult.getString("ent_direccion"));
                    entidad.setEnt_telefono(varResult.getString("ent_telefono"));
                    entidad.setEnt_celular(varResult.getString("ent_celular"));
                    entidad.setEnt_paginaweb(varResult.getString("ent_paginaweb"));
                    entidad.setEnt_correo(varResult.getString("ent_correo"));
                    entidad.setEnt_contacto(varResult.getString("ent_contacto"));
                    entidad.setEnt_sexo(varResult.getString("ent_sexo"));
                    entidad.setEnt_personanatural(varResult.getBoolean("ent_personanatural"));
                    entidad.setExt_id(varResult.getString("ext_id"));
                    entidad.setFdp_id(varResult.getString("fdp_id") == null ? "" : varResult.getString("fdp_id"));
                    entidad.setPro_id(varResult.getInt("pro_id"));
                    entidad.setFpd_diasvencimiento(varResult.getInt("fdp_diasvencimiento"));
                    entidad.setEnt_estadocontribuyente(varResult.getBoolean("ent_estadocontribuyente"));
                    entidad.setEnt_condicioncontribuyente(varResult.getBoolean("ent_condicioncontribuyente"));
                    
                    entidadArray.add(entidad);
                    
                    
                }
            }
        } catch (SQLException e) {
            entidad = new Entidad();
            entidad.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            entidadArray.add(entidad);
            e.printStackTrace();
        } catch (Exception e) {
            entidad = new Entidad();
            entidad.setErrorEntity(new ErrorEntity("Exception", "" + e));
            entidadArray.add(entidad);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return entidadArray;
        }
    }

    public static ArrayList<Entidad> selectFilter(Entidad entidad) {
        ArrayList<Entidad> entidadArray = new ArrayList<Entidad>();
        // Trabajadores trabajadores = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM public.fun_entidad_obtener_filtro ("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "? "
                    + ")";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setString(1, entidad.getExt_id());
            varPst.setInt(2, entidad.getEmp_id());
            varPst.setString(3, entidad.getEnt_nombre());
            varPst.setString(4, entidad.getEnt_nrodocumento());
            varPst.setString(5, entidad.getFdp_id());
            varPst.setString(6, entidad.getPro_descripcion());

            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    entidad = new Entidad();
                    entidad.setEnt_id(varResult.getInt("ent_id"));
                    entidad.setExt_id(varResult.getString("ext_id"));
                    entidad.setEmp_id(varResult.getInt("emp_id"));
                    entidad.setEmp_razonsocial(varResult.getString("emp_razonsocial"));
                    entidad.setEnt_nombre(varResult.getString("ent_nombre"));
                    entidad.setDti_id(varResult.getString("dti_id"));
                    entidad.setEnt_nrodocumento(varResult.getString("ent_nrodocumento"));
                    entidad.setFdp_descri(varResult.getString("fdp_descripcion"));
                    entidad.setPro_descripcion(varResult.getString("pro_descripcion"));
                    entidadArray.add(entidad);
                }

            }

        } catch (SQLException e) {
            entidad = new Entidad();
            entidad.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            entidadArray.add(entidad);
            e.printStackTrace();
        } catch (Exception e) {
            entidad = new Entidad();
            entidad.setErrorEntity(new ErrorEntity("Exception", "" + e));
            entidadArray.add(entidad);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return entidadArray;
        }

    }

    public static ArrayList<Entidad> selectAll(String _entidad) {
        Entidad entidad = new Entidad();
        entidad.setEmp_id(0);
        entidad.setExt_id(_entidad);
        entidad.setEnt_nombre("");
        entidad.setEnt_nrodocumento("");
        entidad.setFdp_id("");
        entidad.setPro_descripcion("");

        return selectFilter(entidad);

    }

    public static ArrayList<Entidad> selectFilterNumber(Entidad entidad) {
        ArrayList<Entidad> entidadArray = new ArrayList<Entidad>();
        // Trabajadores trabajadores = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM public.fun_entidad_obtener_nrodocumento ("
                    + "?,"
                    + "?,"
                    + "? "
                    + ")";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, entidad.getEmp_id());
            varPst.setString(2, entidad.getEnt_nrodocumento());
            varPst.setString(3, entidad.getExt_id());
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    entidad = new Entidad();
                    entidad.setEnt_id(varResult.getInt("ent_id"));
                    entidad.setEnt_nombre(varResult.getString("ent_nombre"));
                    entidad.setDti_id(varResult.getString("dti_id"));
                    entidad.setEnt_nrodocumento(varResult.getString("ent_nrodocumento"));

                    entidadArray.add(entidad);
                }

            }

        } catch (SQLException e) {
            entidad = new Entidad();
            entidad.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            entidadArray.add(entidad);
            e.printStackTrace();
        } catch (Exception e) {
            entidad = new Entidad();
            entidad.setErrorEntity(new ErrorEntity("Exception", "" + e));
            entidadArray.add(entidad);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return entidadArray;
        }

    }
}

