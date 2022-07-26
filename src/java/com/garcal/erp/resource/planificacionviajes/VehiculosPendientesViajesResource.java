/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.resource.planificacionviajes;

import com.garcal.erp.DAO.planificacionviajes.VehiculosPendientesViajesDAO;
import com.garcal.erp.model.planificacionviajes.VehiculosPendientesViajes;
import com.google.gson.Gson;
import java.util.ArrayList;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author usuario
 */
@Path("vehiculospendientesviajes")

public class VehiculosPendientesViajesResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON})
    public Response buscarJsonProveedorGet(VehiculosPendientesViajes vehiculosPendientesViajes) {
        ArrayList<VehiculosPendientesViajes> detail = VehiculosPendientesViajesDAO.selectVehiculosPendientesViajes(vehiculosPendientesViajes);
        return Response.status(Response.Status.OK)
                .header("Access-Control-Allow-Origin", "*") // Headers for Swagger UI.
                .header("Access-Control-Allow-Headers", "Content-Type,X-Requested-With,Authorization")
                .header("Access-Control-Allow-Methods", "OPTIONS,POST")
                .entity(new Gson().toJson(detail))
                .build();
    }

}
