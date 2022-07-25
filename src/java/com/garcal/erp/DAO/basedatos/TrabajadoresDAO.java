package com.garcal.erp.DAO.basedatos;

import com.garcal.erp.DAO.util.Utility;
import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.ErrorEntity;
import com.garcal.erp.model.ResponseAnswer;
import com.garcal.erp.model.basedatos.Trabajadores;
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
public class TrabajadoresDAO extends ConnectionDB {

    public static ArrayList<Trabajadores> selectAll() {
        ArrayList<Trabajadores> trabajadoresArray = new ArrayList<Trabajadores>();
        Trabajadores trabajadores = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM rrhh.fun_get_trabajadores_all()";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    trabajadores = new Trabajadores();
                    trabajadores.setTra_id(varResult.getInt("tra_id"));
                    trabajadores.setEmp_razonsocial(varResult.getString("emp_razonsocial"));
                    trabajadores.setTra_nombreyapellidos(varResult.getString("tra_nombreyapellidos"));
                    trabajadores.setTra_nrodocumento(varResult.getString("tra_nrodocumento"));
                    trabajadores.setPue_nombre(varResult.getString("pue_nombre"));
                    trabajadores.setTra_tipocontrato(varResult.getString("tra_tipocontrato"));
                    trabajadores.setTra_fechaingreso(Utility.getDateToString(varResult.getDate("tra_fechaingreso")));
                    trabajadores.setTra_fechacese(Utility.getDateToString(varResult.getDate("tra_fechacese")));
                    trabajadoresArray.add(trabajadores);
                }
            }
        } catch (SQLException e) {
            trabajadores = new Trabajadores();
            trabajadores.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            trabajadoresArray.add(trabajadores);
            e.printStackTrace();
        } catch (Exception e) {
            trabajadores = new Trabajadores();
            trabajadores.setErrorEntity(new ErrorEntity("Exception", "" + e));
            trabajadoresArray.add(trabajadores);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return trabajadoresArray;
        }
    }

    public static ArrayList<Trabajadores> selectFilter(Trabajadores trabajadores) {
        ArrayList<Trabajadores> trabajadoresArray = new ArrayList<Trabajadores>();
        // Trabajadores trabajadores = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM rrhh.fun_get_trabajadores("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ")";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, trabajadores.getEmp_id());
            varPst.setString(2, trabajadores.getTra_nombreyapellidos());
            varPst.setString(3, trabajadores.getTra_nrodocumento());
            varPst.setString(4, trabajadores.getPue_nombre());
            varPst.setString(5, trabajadores.getTra_tipocontrato());
            varPst.setDate(6, Utility.getStringToDate(trabajadores.getTra_fechaingreso()));
            varPst.setDate(7, Utility.getStringToDate(trabajadores.getTra_fechacese()));
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    trabajadores = new Trabajadores();
                    trabajadores.setTra_id(varResult.getInt("t_id"));
                    trabajadores.setEmp_razonsocial(varResult.getString("t_rs"));
                    trabajadores.setTra_nombreyapellidos(varResult.getString("t_nombre"));
                    trabajadores.setTra_nrodocumento(varResult.getString("t_ndoc"));
                    trabajadores.setPue_nombre(varResult.getString("t_puesto"));
                    trabajadores.setTra_tipocontrato(varResult.getString("t_contrato"));

                    trabajadores.setTra_fechaingreso(Utility.getDateToString(varResult.getDate("t_fechin")));
                    trabajadores.setTra_fechacese(Utility.getDateToString(varResult.getDate("t_fechout")));
                    trabajadoresArray.add(trabajadores);
                }

            }

        } catch (SQLException e) {
            trabajadores = new Trabajadores();
            trabajadores.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            trabajadoresArray.add(trabajadores);
            e.printStackTrace();
        } catch (Exception e) {
            trabajadores = new Trabajadores();
            trabajadores.setErrorEntity(new ErrorEntity("Exception", "" + e));
            trabajadoresArray.add(trabajadores);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return trabajadoresArray;
        }

    }

    public static ArrayList<Trabajadores> selectID(Integer idTrabajador) {
        ArrayList<Trabajadores> trabajadoresArray = new ArrayList<Trabajadores>();
        Trabajadores trabajadores = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM rrhh.fun_get_trabajadores(?)";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, idTrabajador);
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    trabajadores = new Trabajadores();
                    trabajadores.setTra_id(varResult.getInt("tra_id"));
                    trabajadores.setPue_id(varResult.getInt("pue_id"));
                    trabajadores.setEmp_id(varResult.getInt("emp_id"));

                    trabajadores.setTra_nombres(varResult.getString("tra_nombres"));
                    trabajadores.setTra_apellidopaterno(varResult.getString("tra_apellidopaterno"));
                    trabajadores.setTra_apellidomaterno(varResult.getString("tra_apellidomaterno"));
                    trabajadores.setTra_nrodocumento(varResult.getString("tra_nrodocumento"));

                    trabajadores.setTra_identificador(varResult.getString("tra_identificador"));
                    trabajadores.setTra_fechanacimiento(Utility.getDateToString(varResult.getDate("tra_fechanacimiento")));
                    trabajadores.setTra_tipocontrato(varResult.getString("tra_tipocontrato"));

                    trabajadores.setTra_fechaingreso(Utility.getDateToString(varResult.getDate("tra_fechaingreso")));
                    trabajadores.setTra_fechaingresoplanilla(Utility.getDateToString(varResult.getDate("tra_fechaingresoplanilla")));
                    trabajadores.setTra_fechacese(Utility.getDateToString(varResult.getDate("tra_fechacese")));
                    trabajadoresArray.add(trabajadores);
                }
            }
        } catch (SQLException e) {
            trabajadores = new Trabajadores();
            trabajadores.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            trabajadoresArray.add(trabajadores);
            e.printStackTrace();
        } catch (Exception e) {
            trabajadores = new Trabajadores();
            trabajadores.setErrorEntity(new ErrorEntity("Exception", "" + e));
            trabajadoresArray.add(trabajadores);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return trabajadoresArray;
        }
    }

    public static ResponseAnswer insert(Trabajadores trabajadores) {
        ResponseAnswer postResponse = null;

        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        Integer idTrabajador = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM rrhh.fun_insertar_trabajadores  ("
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
            varPst.setInt(1, trabajadores.getAre_id());
            varPst.setInt(2, trabajadores.getPue_id());
            varPst.setInt(3, trabajadores.getEmp_id());
            varPst.setString(4, trabajadores.getTra_nombres());
            varPst.setString(5, trabajadores.getTra_apellidopaterno());
            varPst.setString(6, trabajadores.getTra_apellidomaterno());
            varPst.setString(7, trabajadores.getTra_nrodocumento());
            varPst.setString(8, trabajadores.getTra_identificador());
            varPst.setDate(9, Utility.getStringToDate(trabajadores.getTra_fechanacimiento()));
            varPst.setString(10, trabajadores.getTra_tipocontrato());
            varPst.setDate(11, Utility.getStringToDate(trabajadores.getTra_fechaingreso()));
            varPst.setDate(12, Utility.getStringToDate(trabajadores.getTra_fechaingresoplanilla()));
            varPst.setDate(13, Utility.getStringToDate(trabajadores.getTra_fechacese()));
            varPst.setString(14, trabajadores.getTra_usucreacion());

            varResult = varPst.executeQuery();
            if (varResult.next()) {
                idTrabajador = varResult.getInt("fun_insertar_trabajadores");
            }
            varResult.close();
            varPst.close();

            postResponse = new ResponseAnswer();
            postResponse.setStatus(Boolean.TRUE);
            postResponse.setMessage("insert full");
            postResponse.setIdValue(idTrabajador);

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

    public static ResponseAnswer update(Trabajadores trabajadores) {
        ResponseAnswer postResponse = null;

        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM rrhh.fun_actualizar_trabajadores ("
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
            varPst.setInt(1, trabajadores.getTra_id());
            varPst.setInt(2, trabajadores.getAre_id());
            varPst.setInt(3, trabajadores.getPue_id());
            varPst.setInt(4, trabajadores.getEmp_id());
            varPst.setString(5, trabajadores.getTra_nombres());
            varPst.setString(6, trabajadores.getTra_apellidopaterno());
            varPst.setString(7, trabajadores.getTra_apellidomaterno());
            varPst.setString(8, trabajadores.getTra_nrodocumento());
            varPst.setString(9, trabajadores.getTra_identificador());
            varPst.setDate(10, Utility.getStringToDate(trabajadores.getTra_fechanacimiento()));
            varPst.setString(11, trabajadores.getTra_tipocontrato());
            varPst.setDate(12, Utility.getStringToDate(trabajadores.getTra_fechaingreso()));
            varPst.setDate(13, Utility.getStringToDate(trabajadores.getTra_fechaingresoplanilla()));
            varPst.setDate(14, Utility.getStringToDate(trabajadores.getTra_fechacese()));
            varPst.setString(15, trabajadores.getTra_usumodificacion());
            varPst.setDate(16, trabajadores.getTra_fecmodificacion());
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
            String varSql = " SELECT  rrhh.fun_borrar_trabajadores (?) ";
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
