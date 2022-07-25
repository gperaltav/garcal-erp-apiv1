/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.resource.ventas;

import com.garcal.erp.DAO.ventas.GuiasDAO;
import com.garcal.erp.model.ResponseAnswer;
import com.garcal.erp.model.ventas.Guias;
import com.google.gson.Gson;
import java.util.ArrayList;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author User
 */
@Path("guias")

public class GuiasResource {

    @POST
    @Path("nuevo")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON})
    public Response postJson(Guias guias) {
        /* ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
         Validator validator = factory.getValidator();
         validator.validate(business);
         Set<ConstraintViolation<Business>> violations = validator.validate(business);

         if (violations.isEmpty()) {*/
        ResponseAnswer postResponse = GuiasDAO.insert(guias);
        return Response.status(Response.Status.OK)
                .header("Access-Control-Allow-Origin", "*") // Headers for Swagger UI.
                .header("Access-Control-Allow-Headers", "Content-Type,X-Requested-With,Authorization")
                .header("Access-Control-Allow-Methods", "OPTIONS,POST")
                .entity(new Gson().toJson(postResponse))
                .build();
        /*  }
         PostResponse postResponse = new PostResponse(false, BeanValidators.extractMessage(violations));
         return ResponseAnswer.status(ResponseAnswer.Status.CREATED)
         .entity(new Gson().toJson(postResponse))
         .build();*/
    }

    @POST
    @Path("actualizar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON})
    public Response actualizarJson(Guias viajes) {
        /* ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
         Validator validator = factory.getValidator();
         validator.validate(business);
         Set<ConstraintViolation<Business>> violations = validator.validate(business);

         if (violations.isEmpty()) {*/
        ResponseAnswer postResponse = GuiasDAO.update(viajes);
        return Response.status(Response.Status.OK)
                .header("Access-Control-Allow-Origin", "*") // Headers for Swagger UI.
                .header("Access-Control-Allow-Headers", "Content-Type,X-Requested-With,Authorization")
                .header("Access-Control-Allow-Methods", "OPTIONS,POST")
                .entity(new Gson().toJson(postResponse))
                .build();
        /*  }
         PostResponse postResponse = new PostResponse(false, BeanValidators.extractMessage(violations));
         return ResponseAnswer.status(ResponseAnswer.Status.CREATED)
         .entity(new Gson().toJson(postResponse))
         .build();*/
    }

    @POST
    @Path("borrar/{gui_id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON})
    public Response borrarJson(@PathParam("gui_id") Integer gui_id) {
        ResponseAnswer postResponse = GuiasDAO.delete(gui_id);
        return Response.status(Response.Status.OK)
                .header("Access-Control-Allow-Origin", "*") // Headers for Swagger UI.
                .header("Access-Control-Allow-Headers", "Content-Type,X-Requested-With,Authorization")
                .header("Access-Control-Allow-Methods", "OPTIONS,POST")
                .entity(new Gson().toJson(postResponse))
                .build();
    }

    @POST
    @Path("{gui_id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON})
    public Response buscarJson(@PathParam("gui_id") Integer gui_id) {
        ArrayList<Guias> detail = GuiasDAO.selectID(gui_id);
        return Response.status(Response.Status.OK)
                .header("Access-Control-Allow-Origin", "*") // Headers for Swagger UI.
                .header("Access-Control-Allow-Headers", "Content-Type,X-Requested-With,Authorization")
                .header("Access-Control-Allow-Methods", "OPTIONS,POST")
                .entity(new Gson().toJson(detail))
                .build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON})
    public Response buscarJsonProveedorGet(Guias guias) {
        ArrayList<Guias> detail = GuiasDAO.selectGuias(guias);
        return Response.status(Response.Status.OK)
                .header("Access-Control-Allow-Origin", "*") // Headers for Swagger UI.
                .header("Access-Control-Allow-Headers", "Content-Type,X-Requested-With,Authorization")
                .header("Access-Control-Allow-Methods", "OPTIONS,POST")
                .entity(new Gson().toJson(detail))
                .build();
    }

    @GET
    // @Path("{businessid}")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response getJson() {
        //TODO return proper representation object
        ArrayList<Guias> detail = GuiasDAO.selectAll();
        return Response.status(Response.Status.OK)
                .header("Access-Control-Allow-Origin", "*") // Headers for Swagger UI.
                .header("Access-Control-Allow-Headers", "Content-Type,X-Requested-With,Authorization,Accept,Origin")
                .header("Access-Control-Allow-Methods", "OPTIONS,POST,GET")
                .header("Access-Control-Allow-Credentials", "true")
                .entity(new Gson().toJson(detail))
                .build();
    }
}
