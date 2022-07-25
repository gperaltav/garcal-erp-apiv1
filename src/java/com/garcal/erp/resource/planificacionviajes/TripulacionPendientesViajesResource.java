package com.garcal.erp.resource.planificacionviajes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.garcal.erp.DAO.planificacionviajes.TripulacionPendientesViajesDAO;
import com.garcal.erp.model.planificacionviajes.TripulacionPendientesViajes;
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

@Path("tripulacionpendientesviajes")

public class TripulacionPendientesViajesResource {
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON})
    public Response buscarJsonProveedorGet(TripulacionPendientesViajes tripulacionPendientesViajes ) {
      ArrayList<TripulacionPendientesViajes> detail = TripulacionPendientesViajesDAO.selectTripulacionPendientesViajes(tripulacionPendientesViajes);
        return Response.status(Response.Status.OK)
                .header("Access-Control-Allow-Origin", "*") // Headers for Swagger UI.
                .header("Access-Control-Allow-Headers", "Content-Type,X-Requested-With,Authorization")
                .header("Access-Control-Allow-Methods", "OPTIONS,POST")
               .entity(new Gson().toJson(detail))
                .build();
    }
    
}
