/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.basedatos;

import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.ErrorEntity;
import com.garcal.erp.model.ResponseAnswer;
import com.garcal.erp.model.basedatos.User;
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
public class UserDAO extends ConnectionDB {

    public static ResponseAnswer insert(User user) {
        ResponseAnswer postResponse = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM public.fun_usuarios_insertar("
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "? ,"
                    + "?  "
                    + " ) ";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setString(1, user.getUsu_codigo());
            varPst.setString(2, user.getUsu_clave());
            varPst.setString(3, user.getUsu_nombres());
            varPst.setString(4, user.getUsu_apellidopaterno());
            varPst.setString(5, user.getUsu_apellidomaterno());
            varPst.setString(6, user.getUsu_nrodocumento());
            varPst.setString(7, user.getUsu_telefono());
            varPst.setString(8, user.getUsu_direccion());
            varPst.setString(9, user.getUsu_usucreacion());
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

    public static ResponseAnswer update(User user) {
        ResponseAnswer postResponse = null;

        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM public.fun_usuarios_actualizar ("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "? "
                    + ")";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setString(1, user.getUsu_codigo());
            varPst.setString(2, user.getUsu_clave());
            varPst.setString(3, user.getUsu_nombres());
            varPst.setString(4, user.getUsu_apellidopaterno());
            varPst.setString(5, user.getUsu_apellidomaterno());
            varPst.setString(6, user.getUsu_nrodocumento());
            varPst.setString(7, user.getUsu_telefono());
            varPst.setString(8, user.getUsu_direccion());
            varPst.setString(9, user.getUsu_usucreacion());
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

    public static ResponseAnswer delete(String user) {
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        ResponseAnswer postResponse = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();

            String varSql = " SELECT * FROM public.fun_usuarios_borrar(?)";
            System.out.println(varSql);

            varPst = varConn.prepareStatement(varSql);
            varPst.setString(1, user);
            varPst.executeUpdate();
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

    public static ArrayList<User> selectAll() {
        ArrayList<User> userArray = new ArrayList<User>();
        User user = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM fun_get_usuarios_all()";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    user = new User();
                    user.setUsu_codigo(varResult.getString("udi"));
                    user.setUsu_nombres(varResult.getString("unommbre"));
                    user.setUsu_nrodocumento(varResult.getString("usnrodoc"));
                    user.setUsu_telefono(varResult.getString("usutele"));
                    user.setUsu_direccion(varResult.getString("usutele"));
                    userArray.add(user);
                }
            }
        } catch (SQLException e) {
            user = new User();
            user.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            userArray.add(user);
            e.printStackTrace();
        } catch (Exception e) {
            user = new User();
            user.setErrorEntity(new ErrorEntity("Exception", "" + e));
            userArray.add(user);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return userArray;
        }
    }

    public static ArrayList<User> isExist(User user) {
        ArrayList<User> userArray = new ArrayList<User>();
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {

            varConn = connectionDB();
            String varSql = " SELECT * FROM public.fun_usuario_acceso(?,?) ";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setString(1, user.getUsu_codigo());
            varPst.setString(2, user.getUsu_clave());
            

            varResult = varPst.executeQuery();
            user = new User();
            user.setUsu_existe(false);
            userArray.add(user);
            if (varResult != null) {
                while (varResult.next()) {
                    userArray = new ArrayList<User>();
                    user = new User();
                    user.setUsu_codigo(varResult.getString("usu_codigo"));
                    user.setUsu_rol(varResult.getString("usu_rol"));
                    user.setUsu_existe(true);
                    userArray.add(user);
                }
            }

        } catch (SQLException e) {
            user = new User();
            user.setUsu_existe(false);
            user.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            userArray.add(user);
            e.printStackTrace();
        } catch (Exception e) {
            user = new User();
            user.setUsu_existe(false);
            user.setErrorEntity(new ErrorEntity("Exception", "" + e));
            userArray.add(user);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return userArray;
        }
    }

    public static ArrayList<User> selectFilter(User user) {
        ArrayList<User> userArray = new ArrayList<User>();
        // Trabajadores trabajadores = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM public.fun_usuarios_obtener_filtro( )";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);

            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    user = new User();
                    user.setUsu_codigo(varResult.getString("usu_codigo"));
                    user.setUsu_nombres(varResult.getString("usu_nombres"));
                    user.setUsu_nrodocumento(varResult.getString("usu_nrodocumento"));
                    user.setUsu_telefono(varResult.getString("usu_telefono"));
                    user.setUsu_direccion(varResult.getString("usu_direccion"));
                    userArray.add(user);
                }

            }

        } catch (SQLException e) {
            user = new User();
            user.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            userArray.add(user);
            e.printStackTrace();
        } catch (Exception e) {
            user = new User();
            user.setErrorEntity(new ErrorEntity("Exception", "" + e));
            userArray.add(user);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return userArray;
        }

    }

}
