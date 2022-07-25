/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.resource.basedatos;

import com.garcal.erp.DAO.basedatos.VehiculosClasesDAO;
import com.garcal.erp.model.basedatos.VehiculosClases;
import com.google.gson.Gson;
import java.util.ArrayList;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author User
 */
@Path("vehiculosclases")
public class VehiculosClasesResource {

    @Context
    private UriInfo context;

    public VehiculosClasesResource() {
    }

    @GET
    @Path("{idEmpresa}")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response getJson(@PathParam("idEmpresa") Integer idEmpresa) {
        //TODO return proper representation object
        ArrayList<VehiculosClases> detail = VehiculosClasesDAO.selectAll(idEmpresa);
        return Response.status(Response.Status.OK)
                .header("Access-Control-Allow-Origin", "*") // Headers for Swagger UI.
                .header("Access-Control-Allow-Headers", "Content-Type,X-Requested-With,Authorization,Accept,Origin")
                .header("Access-Control-Allow-Methods", "OPTIONS,POST,GET")
                .header("Access-Control-Allow-Credentials", "true")
                .entity(new Gson().toJson(detail))
                .build();
    }
}
