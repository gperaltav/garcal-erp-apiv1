/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.resource.mantenimiento;


import com.garcal.erp.DAO.mantenimiento.ProgramacionMantenimientoDAO;
import com.garcal.erp.model.ResponseAnswer;
import com.garcal.erp.model.mantenimiento.ProgramacionMantenimiento;
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
 * @author Teresa
 */

@Path("programacionmantenimiento")

public class ProgramacionMantenimientoResource {
    
        @POST
    @Path("nuevo")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON})
    public Response postJson(ProgramacionMantenimiento programacionmantenimiento) {
        /* ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
         Validator validator = factory.getValidator();
         validator.validate(business);
         Set<ConstraintViolation<Business>> violations = validator.validate(business);

         if (violations.isEmpty()) {*/
        ResponseAnswer postResponse = ProgramacionMantenimientoDAO.insert(programacionmantenimiento);
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
    public Response actualizarJson(ProgramacionMantenimiento programacionmantenimiento) {
        /* ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
         Validator validator = factory.getValidator();
         validator.validate(business);
         Set<ConstraintViolation<Business>> violations = validator.validate(business);

         if (violations.isEmpty()) {*/
        ResponseAnswer postResponse = ProgramacionMantenimientoDAO.update(programacionmantenimiento);
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
    @Path("borrar/{pma_id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON})
    public Response borrarJson(@PathParam("pma_id") Integer pma_id) {
        ResponseAnswer postResponse = ProgramacionMantenimientoDAO.delete(pma_id);
        return Response.status(Response.Status.OK)
                .header("Access-Control-Allow-Origin", "*") // Headers for Swagger UI.
                .header("Access-Control-Allow-Headers", "Content-Type,X-Requested-With,Authorization")
                .header("Access-Control-Allow-Methods", "OPTIONS,POST")
                .entity(new Gson().toJson(postResponse))
                .build();
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON})
    public Response buscarJsonProveedorGet(ProgramacionMantenimiento programacionmantenimiento) {
        ArrayList<ProgramacionMantenimiento> detail = ProgramacionMantenimientoDAO.selectFiltro(programacionmantenimiento);
        return Response.status(Response.Status.OK)
                .header("Access-Control-Allow-Origin", "*") // Headers for Swagger UI.
                .header("Access-Control-Allow-Headers", "Content-Type,X-Requested-With,Authorization")
                .header("Access-Control-Allow-Methods", "OPTIONS,POST")
                .entity(new Gson().toJson(detail))
                .build();
    }
    @GET
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response getJson(@PathParam("id") Integer id) {
        //TODO return proper representation object
        ArrayList<ProgramacionMantenimiento> detail = ProgramacionMantenimientoDAO.selectAll(id);
        return Response.status(Response.Status.OK)
                .header("Access-Control-Allow-Origin", "*") // Headers for Swagger UI.
                .header("Access-Control-Allow-Headers", "Content-Type,X-Requested-With,Authorization,Accept,Origin")
                .header("Access-Control-Allow-Methods", "OPTIONS,POST,GET")
                .header("Access-Control-Allow-Credentials", "true")
                .entity(new Gson().toJson(detail))
                .build();
    }
    @POST
    @Path("mostrar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON})
    public Response buscarrJsonProveedorGet(ProgramacionMantenimiento programacionmantenimiento) {
        ArrayList<ProgramacionMantenimiento> detail = ProgramacionMantenimientoDAO.selectPro(programacionmantenimiento);
        return Response.status(Response.Status.OK)
                .header("Access-Control-Allow-Origin", "*") // Headers for Swagger UI.
                .header("Access-Control-Allow-Headers", "Content-Type,X-Requested-With,Authorization")
                .header("Access-Control-Allow-Methods", "OPTIONS,POST")
                .entity(new Gson().toJson(detail))
                .build();
    }
    
}
