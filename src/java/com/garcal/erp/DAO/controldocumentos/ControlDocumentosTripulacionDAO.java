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
import com.garcal.erp.model.controldocumentos.ControlDocumentosTripulacion;
import com.garcal.erp.model.controldocumentos.ControlDocumentosTripulacion;
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
 * @author User
 */
public class ControlDocumentosTripulacionDAO extends ConnectionDB {

    public static ResponseAnswer insert(ControlDocumentosTripulacion controlDocumentosTripulacion) {
        ResponseAnswer postResponse = null;

        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = "SELECT * FROM operaciones.fun_tripulacionxtiposdocumentos_insertar_actualizar("
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
            varPst.setInt(1, controlDocumentosTripulacion.getEmp_id());
            varPst.setInt(2, controlDocumentosTripulacion.getTri_id());
            varPst.setInt(3, controlDocumentosTripulacion.getTtd_id());
            varPst.setString(4, controlDocumentosTripulacion.getTxd_entidademisora());
            varPst.setDate(5, Utility.getStringToDate(controlDocumentosTripulacion.getTxd_fechaemision()));
            varPst.setDate(6, Utility.getStringToDate(controlDocumentosTripulacion.getTxd_fechavencimiento()));
            varPst.setString(7, controlDocumentosTripulacion.getTxd_usucreacion());
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

    public static ArrayList<ControlDocumentosTripulacion> selectID(ControlDocumentosTripulacion controlDocumentosTripulacion) {

        ArrayList<ControlDocumentosTripulacion> controlDocumentosTripulacionArray = new ArrayList<ControlDocumentosTripulacion>();
        // ControlDocumentosTripulacion controlDocumentosTripulacion = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM operaciones.fun_tripulacionsxtiposdocumentos_obtener_todo(?,?)";

            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, controlDocumentosTripulacion.getTri_id());
            varPst.setInt(2, controlDocumentosTripulacion.getTtd_id());
            varResult = varPst.executeQuery();
            if (varResult != null) {
                while (varResult.next()) {
                    controlDocumentosTripulacion = new ControlDocumentosTripulacion();
                    controlDocumentosTripulacion.setTxd_id(varResult.getInt("txd_id"));
                    controlDocumentosTripulacion.setEmp_id(varResult.getInt("emp_id"));
                    controlDocumentosTripulacion.setTxd_entidademisora(varResult.getString("txd_entidademisora"));
                    controlDocumentosTripulacion.setTxd_fechaemision(Utility.getDateToString(varResult.getDate("txd_fechaemision")));
                    controlDocumentosTripulacion.setTxd_fechavencimiento(Utility.getDateToString(varResult.getDate("txd_fechavencimiento")));
                    controlDocumentosTripulacionArray.add(controlDocumentosTripulacion);
                }
            }
        } catch (SQLException e) {
            controlDocumentosTripulacion = new ControlDocumentosTripulacion();
            controlDocumentosTripulacion.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            controlDocumentosTripulacionArray.add(controlDocumentosTripulacion);
            e.printStackTrace();
        } catch (Exception e) {
            controlDocumentosTripulacion = new ControlDocumentosTripulacion();
            controlDocumentosTripulacion.setErrorEntity(new ErrorEntity("Exception", "" + e));
            controlDocumentosTripulacionArray.add(controlDocumentosTripulacion);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return controlDocumentosTripulacionArray;
        }
    }

    public static ArrayList<ControlDocumentosTripulacion> selectFilter(ControlDocumentosTripulacion controlDocumentosTripulacion) {
        ArrayList<ControlDocumentosTripulacion> controlDocumentosTripulacionArray = new ArrayList<ControlDocumentosTripulacion>();
        // Trabajadores trabajadores = null;
        ResultSet varResult = null;
        PreparedStatement varPst = null;
        CallableStatement varCall = null;
        Connection varConn = null;
        String tripulacionPrevius = "";
        try {
            varConn = connectionDB();
            String varSql = " SELECT * FROM operaciones.fun_tripulacionsxtiposdocumentos_filtro("
                    + "?,"
                    + "? "
                    + ")";
            System.out.println(varSql);
            varPst = varConn.prepareStatement(varSql);
            varPst.setInt(1, controlDocumentosTripulacion.getEmp_id());
            varPst.setString(2, controlDocumentosTripulacion.getTri_nombre());
            varResult = varPst.executeQuery();

            List<Map> maps = new ArrayList<Map>();
            Integer i = 0;

            Boolean flagTripulacion = true;
            if (varResult != null) {
                while (varResult.next()) {

                    if (i == 0) {
                        tripulacionPrevius = varResult.getString("tri_id");
                        controlDocumentosTripulacion = new ControlDocumentosTripulacion();
                    }
                    if (tripulacionPrevius.equals(varResult.getString("tri_id"))) {
                        //   controlDocumentosTripulacion.setVxd_id(varResult.getInt("vxd_id"));
                        //  controlDocumentosTripulacion.setTxd_id(varResult.getInt("txd_id"));
                        controlDocumentosTripulacion.setTri_id(varResult.getInt("tri_id"));
                        controlDocumentosTripulacion.setEmp_id(varResult.getInt("emp_id"));
                        controlDocumentosTripulacion.setEmp_razonsocial(varResult.getString("emp_razonsocial"));
                        controlDocumentosTripulacion.setTri_nombre(varResult.getString("tri_nombre"));
                        controlDocumentosTripulacion.setTri_nrolicencia(varResult.getString("tri_nrolicencia"));

                        maps = new ArrayList<Map>();
                        Map<String, Object> map1 = new HashMap<String, Object>();
                        map1.put("fecha", Utility.getDateToString(varResult.getDate("txd_fechavencimiento")));
                        map1.put("color", varResult.getString("ttd_color"));
                        map1.put("id", varResult.getInt("ttd_id"));
                        maps.add(map1);
                        if (varResult.getString("ttd_nombre").equals("LICENCIA A3")) {

                            controlDocumentosTripulacion.setLICENCIAA3(maps);
                        }
                        if (varResult.getString("ttd_nombre").equals("LICENCIA A4")) {

                            controlDocumentosTripulacion.setLICENCIAA4(maps);
                        }
                        if (varResult.getString("ttd_nombre").equals("SCTR")) {

                            controlDocumentosTripulacion.setSCTR(maps);
                        }
                        if (varResult.getString("ttd_nombre").equals("REV. MEDICA")) {

                            controlDocumentosTripulacion.setREVMEDICA(maps);
                        }
                        if (varResult.getString("ttd_nombre").equals("SEGURO VIDA LEY")) {

                            controlDocumentosTripulacion.setSEGUROVIDALEY(maps);
                        }
                    }

                    if (!tripulacionPrevius.equals(varResult.getString("tri_id"))) {

                        controlDocumentosTripulacionArray.add(controlDocumentosTripulacion);
                        controlDocumentosTripulacion = new ControlDocumentosTripulacion();

                        controlDocumentosTripulacion.setTri_id(varResult.getInt("tri_id"));
                        controlDocumentosTripulacion.setEmp_id(varResult.getInt("emp_id"));
                        controlDocumentosTripulacion.setEmp_razonsocial(varResult.getString("emp_razonsocial"));
                        controlDocumentosTripulacion.setTri_nombre(varResult.getString("tri_nombre"));
                        controlDocumentosTripulacion.setTri_nrolicencia(varResult.getString("tri_nrolicencia"));

                        maps = new ArrayList<Map>();
                        Map<String, Object> map1 = new HashMap<String, Object>();
                        map1.put("fecha", Utility.getDateToString(varResult.getDate("txd_fechavencimiento")));
                        map1.put("color", varResult.getString("ttd_color"));
                        map1.put("id", varResult.getInt("ttd_id"));
                        maps.add(map1);
                        if (varResult.getString("ttd_nombre").equals("LICENCIA A3")) {

                            controlDocumentosTripulacion.setLICENCIAA3(maps);
                        }
                        if (varResult.getString("ttd_nombre").equals("LICENCIA A4")) {

                            controlDocumentosTripulacion.setLICENCIAA4(maps);
                        }
                        if (varResult.getString("ttd_nombre").equals("SCTR")) {

                            controlDocumentosTripulacion.setSCTR(maps);
                        }
                        if (varResult.getString("ttd_nombre").equals("REV. MEDICA")) {

                            controlDocumentosTripulacion.setREVMEDICA(maps);
                        }
                        if (varResult.getString("ttd_nombre").equals("SEGURO VIDA LEY")) {

                            controlDocumentosTripulacion.setSEGUROVIDALEY(maps);
                        }
                        flagTripulacion = false;

                    }
                    tripulacionPrevius = varResult.getString("tri_id");
                    i++;
                    // controlDocumentosTripulacion.setVtd_id(varResult.getInt("vtd_id"));
                    // controlDocumentosTripulacion.setVtd_nombre(varResult.getString("vtd_nombre"));
                    //   controlDocumentosTripulacion.setVxd_fechavencimiento(Utility.getDateToString(varResult.getDate("vxd_fechavencimiento")));
                    //   controlDocumentosTripulacion.setColor(varResult.getString("vtd_color"));

                }

            }
            if (flagTripulacion == false) {

                controlDocumentosTripulacionArray.add(controlDocumentosTripulacion);

            }

            if (flagTripulacion && !tripulacionPrevius.equals("")) {
                controlDocumentosTripulacionArray.add(controlDocumentosTripulacion);
            }

        } catch (SQLException e) {
            controlDocumentosTripulacion = new ControlDocumentosTripulacion();
            controlDocumentosTripulacion.setErrorEntity(new ErrorEntity("SQLException", e.getMessage()));
            controlDocumentosTripulacionArray.add(controlDocumentosTripulacion);
            e.printStackTrace();
        } catch (Exception e) {
            controlDocumentosTripulacion = new ControlDocumentosTripulacion();
            controlDocumentosTripulacion.setErrorEntity(new ErrorEntity("Exception", "" + e));
            controlDocumentosTripulacionArray.add(controlDocumentosTripulacion);
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(varConn, varPst, varResult);
            return controlDocumentosTripulacionArray;
        }

    }

}
