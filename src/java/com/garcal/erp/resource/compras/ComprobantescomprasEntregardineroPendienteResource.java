/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.resource.compras;

import com.garcal.erp.DAO.compras.ComprobantescomprasEntregardineroPendienteDAO;
import com.garcal.erp.model.compras.ComprobantescomprasEntregardineroPendiente;
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
@Path("comprobantescomprasentregardineropendiente")

public class ComprobantescomprasEntregardineroPendienteResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON})
    public Response buscarJsonProveedorGet(ComprobantescomprasEntregardineroPendiente comprobantescomprasEntregardineroPendiente) {
        ArrayList<ComprobantescomprasEntregardineroPendiente> detail = ComprobantescomprasEntregardineroPendienteDAO.selectFiltro(comprobantescomprasEntregardineroPendiente);
        return Response.status(Response.Status.OK)
                .header("Access-Control-Allow-Origin", "*") // Headers for Swagger UI.
                .header("Access-Control-Allow-Headers", "Content-Type,X-Requested-With,Authorization")
                .header("Access-Control-Allow-Methods", "OPTIONS,POST")
                .entity(new Gson().toJson(detail))
                .build();
    }
}
