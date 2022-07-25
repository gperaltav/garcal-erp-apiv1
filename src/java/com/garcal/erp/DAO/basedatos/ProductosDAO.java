/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.basedatos;

import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.ErrorEntity;
import com.garcal.erp.model.basedatos.Productos;
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
public class ProductosDAO extends ConnectionDB {

    public static ArrayList<Productos> selectAll(Integer idEmpresa) {

        ArrayList<Productos> productosArray = new ArrayList<Productos>();
        Productos productos = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM almacenes.fun_productos_obtener_todo(?)";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, idEmpresa);
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    productos = new Productos();
                    productos.setPro_id(varResult.getInt("pro_id"));
                    productos.setPro_nombre(varResult.getString("pro_nombre"));
                    productosArray.add(productos);
                }
            }
        } catch (SQLException e) {
            productos = new Productos();
            productos.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            productosArray.add(productos);
            e.printStackTrace();
        } catch (Exception e) {
            productos = new Productos();
            productos.setErrorEntity(new ErrorEntity("Exception", "" + e));
            productosArray.add(productos);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return productosArray;
        }
    }

    public static ArrayList<Productos> selectFilter(Productos productos) {
        ArrayList<Productos> productosArray = new ArrayList<Productos>();
        // Trabajadores trabajadores = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM almacenes.fun_productos_obtener_filtro("
                    + "?,"
                    + "?,"
                    + "? "
                    + ")";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, productos.getEmp_id());
            varPst.setString(2, productos.getPro_descripcion());
            varPst.setString(3, productos.getPro_codigo());
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    productos = new Productos();
                    productos.setPro_id(varResult.getInt("pro_id"));
                    productos.setUni_codigomenor(varResult.getString("uni_codigomenor"));
                    productos.setMod_codigo(varResult.getString("mod_codigo"));
                    productos.setPro_preciominimo(varResult.getDouble("pro_preciominimo"));
                    productos.setPro_precioventa(varResult.getDouble("pro_precioventa"));
                    productos.setPro_preciocompra(varResult.getDouble("pro_preciocompra"));
                    productos.setPro_codsunat(varResult.getString("pro_codsunat"));
                    productosArray.add(productos);
                }

            }

        } catch (SQLException e) {
            productos = new Productos();
            productos.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            productosArray.add(productos);
            e.printStackTrace();
        } catch (Exception e) {
            productos = new Productos();
            productos.setErrorEntity(new ErrorEntity("Exception", "" + e));
            productosArray.add(productos);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return productosArray;
        }

    }
   
    
    public static ArrayList<Productos> selectFilterName(Productos productos) {
        ArrayList<Productos> productosArray = new ArrayList<Productos>();
        // Trabajadores trabajadores = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM almacenes.fun_productos_obtener_nombre("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ")";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, productos.getEmp_id());
            varPst.setString(2, productos.getPro_descripcion());
            varPst.setString(3, productos.getPro_tipouso());
            varPst.setString(4, productos.getPro_codigo());
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    productos = new Productos();
                    productos.setPro_id(varResult.getInt("pro_id"));
                    productos.setPro_codigo(varResult.getString("pro_codigo"));
                    productos.setPro_descripcion(varResult.getString("pro_descripcion"));
                    productos.setPxt_descripcion(varResult.getString("pxt_descripcion"));
                    productosArray.add(productos);
                }
            }
        } catch (SQLException e) {
            productos = new Productos();
            productos.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            productosArray.add(productos);
            e.printStackTrace();
        } catch (Exception e) {
            productos = new Productos();
            productos.setErrorEntity(new ErrorEntity("Exception", "" + e));
            productosArray.add(productos);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return productosArray;
        }

    }
    
    public static ResponseAnswer insert(Productos productos) {
        ResponseAnswer postResponse = null;

        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM almacenes.fun_productos_insertar("
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
            varPst.setInt(1, productos.getEmp_id());
            varPst.setString(2, productos.getPro_codigo());
            varPst.setString(3, productos.getPro_descripcion());
            varPst.setString(4, productos.getUni_codigomenor());
            varPst.setString(5, productos.getMod_codigo());
            varPst.setDouble(6, productos.getPro_preciominimo());
            varPst.setDouble(7, productos.getPro_precioventa());
            varPst.setDouble(8, productos.getPro_preciocompra());
            varPst.setString(9, productos.getPro_codsunat());
            varPst.setString(10, productos.getPro_usucreacion());
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

    public static ResponseAnswer update(Productos productos) {
        ResponseAnswer postResponse = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM almacenes.fun_productos_actualizar ("
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
            varPst.setInt(1, productos.getPro_id());
            varPst.setInt(2, productos.getEmp_id());
            varPst.setString(3, productos.getPro_codigo());
            varPst.setString(4, productos.getPro_descripcion());
            varPst.setString(5, productos.getUni_codigomenor());
            varPst.setString(6, productos.getMod_codigo());
            varPst.setDouble(7, productos.getPro_preciominimo());
            varPst.setDouble(8, productos.getPro_precioventa());
            varPst.setDouble(9, productos.getPro_preciocompra());
            varPst.setString(10, productos.getPro_codsunat());
            varPst.setString(11, productos.getPro_usumodificacion());
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
            String varSql = " SELECT * FROM almacenes.fun_productos_borrar(?)";
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
 

}
