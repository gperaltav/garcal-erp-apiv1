/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.connection;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author Gloria Peralta <gloria.ypv@gmail.com>
 */
public class ConnectionDB {

    protected static Connection connectionDB() throws SQLException {

        InitialContext initContext;
        Connection con = null;
        String messageError = "";
        try {
            initContext = new InitialContext();
            DataSource ds = (DataSource) initContext.lookup("java:/comp/env/jdbc/pool_garcal");
            con = ds.getConnection();

        } catch (NamingException ex) {
            messageError = ex.getMessage() + " " + getStringFromStackTrace(ex);
            ex.printStackTrace();
        } catch (SQLException ex) {
            messageError = ex.getMessage() + " " + getStringFromStackTrace(ex);
            ex.printStackTrace();
        } catch (Exception ex) {
            messageError = "" + ex + " " + getStringFromStackTrace(ex);
            ex.printStackTrace();
        }
        if ((con == null) || con.isClosed()) {

            System.out.println("NO HAY CONEXION A LA BASE DE DATOS");
            throw new SQLException("No connection to pool_garcal: " + messageError);
        }
        return con;
    }

    protected static void close(Connection con) throws SQLException {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                throw new SQLException("Close connection : " + ex.getMessage());
            }
        }
    }

    protected static void closeRstPst(ResultSet rs, PreparedStatement ps) throws SQLException {
        closeRst(rs);
        ConnectionDB.closePst(ps);
    }

    protected static void closePst(PreparedStatement ps) throws SQLException {
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException ex) {
                throw new SQLException("Close PreparedStatement: " + ex.getMessage());
            }
        }
    }

    protected static void closeRst(ResultSet rs) throws SQLException {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException ex) {
                throw new SQLException("Close ResultSet: " + ex.getMessage());
            }
        }
    }

    static void logger(Class className, Exception ex) {
        Logger.getLogger(className.getName()).log(Level.SEVERE, null, ex);
    }

    protected void logger(Exception ex) {
        logger(this.getClass(), ex);
    }

    public static String getStringFromStackTrace(Throwable ex) {
        if (ex == null) {
            return "";
        }
        StringWriter str = new StringWriter();
        PrintWriter writer = new PrintWriter(str);
        try {
            ex.printStackTrace(writer);
            return str.getBuffer().toString();
        } finally {
            try {
                str.close();
                writer.close();
            } catch (IOException e) {
                //ignore
            }
        }
    }
}
