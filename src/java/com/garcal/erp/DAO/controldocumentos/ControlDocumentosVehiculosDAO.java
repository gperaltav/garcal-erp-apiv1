/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.DAO.controldocumentos;

import com.garcal.erp.DAO.util.Utility;
import com.garcal.erp.connection.ConnectionDB;
import com.garcal.erp.model.ErrorEntity;
import com.garcal.erp.model.ResponseAnswer;
import com.garcal.erp.model.controldocumentos.ControlDocumentosVehiculos;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.dbutils.DbUtils;

/**
 *
 * @author Gloria Peralta <gloria.ypv@gmail.com>
 */
public class ControlDocumentosVehiculosDAO extends ConnectionDB {

    public static ArrayList<ControlDocumentosVehiculos> selectFilter(ControlDocumentosVehiculos controlDocumentosVehiculos) {

        ArrayList<ControlDocumentosVehiculos> controlDocumentosVehiculosArray = new ArrayList<ControlDocumentosVehiculos>();
        // Trabajadores trabajadores = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        String placaPrevius = "";
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM  operaciones.fun_vehiculosxdocumentos_filtro("
                    + "?,"
                    + "? "
                    + ")";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, controlDocumentosVehiculos.getEmp_id());
            varPst.setString(2, controlDocumentosVehiculos.getVeh_placa());
            varResult = varPst.executeQuery();
            List<Map> maps = new ArrayList<Map>();
            Integer i = 0;

            Boolean flagPlaca = true;
            if (varResult != null) {
                while (varResult.next()) {

                    if (i == 0) {
                        placaPrevius = varResult.getString("veh_placa");
                        controlDocumentosVehiculos = new ControlDocumentosVehiculos();

                    }
                    if (placaPrevius.equals(varResult.getString("veh_placa"))) {
                        //   controlDocumentosVehiculos.setVxd_id(varResult.getInt("vxd_id"));
                        controlDocumentosVehiculos.setVeh_id(varResult.getInt("veh_id"));
                        controlDocumentosVehiculos.setEmp_id(varResult.getInt("emp_id"));
                        controlDocumentosVehiculos.setVcl_nombre(varResult.getString("vcl_nombre"));
                        controlDocumentosVehiculos.setEmp_razonsocial(varResult.getString("emp_razonsocial"));
                        controlDocumentosVehiculos.setVeh_placa((varResult.getString("veh_placa")));

                        maps = new ArrayList<Map>();
                        Map<String, Object> map1 = new HashMap<String, Object>();
                        map1.put("fecha", Utility.getDateToString(varResult.getDate("vxd_fechavencimiento")));
                        map1.put("color", varResult.getString("vtd_color"));
                        map1.put("id", varResult.getInt("vtd_id"));
                        maps.add(map1);
                        if (varResult.getString("vtd_nombre").equals("CITV 6m")) {

                            controlDocumentosVehiculos.setCITV6m(maps);
                        }
                        if (varResult.getString("vtd_nombre").equals("CITV 12m")) {

                            controlDocumentosVehiculos.setCITV12m(maps);
                        }
                        if (varResult.getString("vtd_nombre").equals("SOAT")) {

                            controlDocumentosVehiculos.setSOAT(maps);
                        }
                        if (varResult.getString("vtd_nombre").equals("POLIZA")) {

                            controlDocumentosVehiculos.setPOLIZA(maps);
                        }
                        if (varResult.getString("vtd_nombre").equals("MTC MATPEL")) {

                            controlDocumentosVehiculos.setMTCMATPEL(maps);
                        }
                        if (varResult.getString("vtd_nombre").equals("BONIFICACION")) {

                            controlDocumentosVehiculos.setBONIFICACION(maps);
                        }
                        if (varResult.getString("vtd_nombre").equals("HERMETECIDAD")) {

                            controlDocumentosVehiculos.setHERMETECIDAD(maps);
                        }
                         if (varResult.getString("vtd_nombre").equals("MTC MERCANCIAS")) {

                            controlDocumentosVehiculos.setMTCMERCANCIAS(maps);
                        }

                    }
                    if (!placaPrevius.equals(varResult.getString("veh_placa"))) {
                        controlDocumentosVehiculosArray.add(controlDocumentosVehiculos);
                        controlDocumentosVehiculos = new ControlDocumentosVehiculos();

                        controlDocumentosVehiculos.setVeh_id(varResult.getInt("veh_id"));
                        controlDocumentosVehiculos.setEmp_id(varResult.getInt("emp_id"));
                        controlDocumentosVehiculos.setVcl_nombre(varResult.getString("vcl_nombre"));
                        controlDocumentosVehiculos.setEmp_razonsocial(varResult.getString("emp_razonsocial"));
                        controlDocumentosVehiculos.setVeh_placa((varResult.getString("veh_placa")));

                        maps = new ArrayList<Map>();
                        Map<String, Object> map1 = new HashMap<String, Object>();
                        map1.put("fecha", Utility.getDateToString(varResult.getDate("vxd_fechavencimiento")));
                        map1.put("color", varResult.getString("vtd_color"));
                        map1.put("id", varResult.getInt("vtd_id"));
                        maps.add(map1);
                        if (varResult.getString("vtd_nombre").equals("CITV 6m")) {

                            controlDocumentosVehiculos.setCITV6m(maps);
                        }
                        if (varResult.getString("vtd_nombre").equals("CITV 12m")) {

                            controlDocumentosVehiculos.setCITV12m(maps);
                        }
                        if (varResult.getString("vtd_nombre").equals("SOAT")) {

                            controlDocumentosVehiculos.setSOAT(maps);
                        }
                        if (varResult.getString("vtd_nombre").equals("POLIZA")) {

                            controlDocumentosVehiculos.setPOLIZA(maps);
                        }
                        if (varResult.getString("vtd_nombre").equals("MTC MATPEL")) {

                            controlDocumentosVehiculos.setMTCMATPEL(maps);
                        }
                        if (varResult.getString("vtd_nombre").equals("BONIFICACION")) {

                            controlDocumentosVehiculos.setBONIFICACION(maps);
                        }
                        if (varResult.getString("vtd_nombre").equals("MTC MERCANCIAS")) {

                            controlDocumentosVehiculos.setMTCMERCANCIAS(maps);
                        }

                        flagPlaca = false;
                    }
                    placaPrevius = varResult.getString("veh_placa");
                    i++;

                }

            }
            if (flagPlaca == false) {

                controlDocumentosVehiculosArray.add(controlDocumentosVehiculos);

            }
            if (flagPlaca && !placaPrevius.equals("")) {
                controlDocumentosVehiculosArray.add(controlDocumentosVehiculos);
            }

        } catch (SQLException e) {
            controlDocumentosVehiculos = new ControlDocumentosVehiculos();
            controlDocumentosVehiculos.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            controlDocumentosVehiculosArray.add(controlDocumentosVehiculos);
            e.printStackTrace();
        } catch (Exception e) {
            controlDocumentosVehiculos = new ControlDocumentosVehiculos();
            controlDocumentosVehiculos.setErrorEntity(new ErrorEntity("Exception", "" + e));
            controlDocumentosVehiculosArray.add(controlDocumentosVehiculos);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return controlDocumentosVehiculosArray;
        }

    }

    public static ArrayList<ControlDocumentosVehiculos> selectID(ControlDocumentosVehiculos controlDocumentosVehiculos) {
        ArrayList<ControlDocumentosVehiculos> controlDocumentosVehiculosArray = new ArrayList<ControlDocumentosVehiculos>();
        // ControlDocumentosVehiculos controlDocumentosVehiculos = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM operaciones.fun_vehiculosxdocumentos_obtener_todo(?,?)";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, controlDocumentosVehiculos.getVeh_id());
            varPst.setInt(2, controlDocumentosVehiculos.getVtd_id());
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    controlDocumentosVehiculos = new ControlDocumentosVehiculos();
                    controlDocumentosVehiculos.setVxd_id(varResult.getInt("vxd_id"));
                    controlDocumentosVehiculos.setVxd_entidademisora(varResult.getString("vxd_entidademisora"));
                    controlDocumentosVehiculos.setVxd_fechaemision(Utility.getDateToString(varResult.getDate("vxd_fechaemision")));
                    controlDocumentosVehiculos.setVxd_fechavencimiento(Utility.getDateToString(varResult.getDate("vxd_fechavencimiento")));
                    controlDocumentosVehiculos.setEmp_id(varResult.getInt("emp_id"));
                    controlDocumentosVehiculosArray.add(controlDocumentosVehiculos);
                }
            }
        } catch (SQLException e) {
            controlDocumentosVehiculos = new ControlDocumentosVehiculos();
            controlDocumentosVehiculos.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            controlDocumentosVehiculosArray.add(controlDocumentosVehiculos);
            e.printStackTrace();
        } catch (Exception e) {
            controlDocumentosVehiculos = new ControlDocumentosVehiculos();
            controlDocumentosVehiculos.setErrorEntity(new ErrorEntity("Exception", "" + e));
            controlDocumentosVehiculosArray.add(controlDocumentosVehiculos);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return controlDocumentosVehiculosArray;
        }
    }

    public static ResponseAnswer insert(ControlDocumentosVehiculos controlDocumentosVehiculos) {

        ResponseAnswer postResponse = null;

        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM operaciones.fun_vehiculosxdocumentos_insertar_actualizar("
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
            varPst.setInt(1, controlDocumentosVehiculos.getEmp_id());
            varPst.setInt(2, controlDocumentosVehiculos.getVeh_id());
            varPst.setInt(3, controlDocumentosVehiculos.getVtd_id());
            varPst.setString(4, controlDocumentosVehiculos.getVxd_entidademisora());
            varPst.setDate(5, Utility.getStringToDate(controlDocumentosVehiculos.getVxd_fechaemision()));
            varPst.setDate(6, Utility.getStringToDate(controlDocumentosVehiculos.getVxd_fechavencimiento()));
            varPst.setString(7, controlDocumentosVehiculos.getVxd_usucreacion());
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

}
