/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.resource.basedatos;

import com.garcal.erp.DAO.basedatos.EntidadDAO;
import com.garcal.erp.model.basedatos.Entidad;
import com.garcal.erp.model.ResponseAnswer;
import com.google.gson.Gson;
import java.util.ArrayList;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author User
 */
@Path("entidad")
public class EntidadResource {

    public EntidadResource() {
    }

    @POST
    @Path("nuevo")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON})
    public Response postJson(Entidad entidad) {
        /* ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
         Validator validator = factory.getValidator();
         validator.validate(business);
         Set<ConstraintViolation<Business>> violations = validator.validate(business);

         if (violations.isEmpty()) {*/
        ResponseAnswer postResponse = EntidadDAO.insert(entidad);
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
    public Response actualizarJson(Entidad entidad) {
        /* ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
         Validator validator = factory.getValidator();
         validator.validate(business);
         Set<ConstraintViolation<Business>> violations = validator.validate(business);

         if (violations.isEmpty()) {*/
        ResponseAnswer postResponse = EntidadDAO.update(entidad);
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
    @Path("borrar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON})
    public Response borrarJson(Entidad entidad) {
        ResponseAnswer postResponse = EntidadDAO.delete(entidad);
        return Response.status(Response.Status.OK)
                .header("Access-Control-Allow-Origin", "*") // Headers for Swagger UI.
                .header("Access-Control-Allow-Headers", "Content-Type,X-Requested-With,Authorization")
                .header("Access-Control-Allow-Methods", "OPTIONS,POST")
                .entity(new Gson().toJson(postResponse))
                .build();
    }

    @POST
    @Path("{ent_id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON})
    public Response buscar(@PathParam("ent_id") Integer ent_id, Entidad entidad) {
        ArrayList<Entidad> detail = EntidadDAO.selectID(ent_id, entidad);
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
    public Response buscarJson(Entidad entidad) {
        ArrayList<Entidad> detail = EntidadDAO.selectFilter(entidad);
        return Response.status(Response.Status.OK)
                .header("Access-Control-Allow-Origin", "*") // Headers for Swagger UI.
                .header("Access-Control-Allow-Headers", "Content-Type,X-Requested-With,Authorization")
                .header("Access-Control-Allow-Methods", "OPTIONS,POST")
                .entity(new Gson().toJson(detail))
                .build();
    }

    @GET
    @Path("cliente")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON})
    public Response buscarJsonClienteGet() {
        ArrayList<Entidad> detail = EntidadDAO.selectAll("cli");
        return Response.status(Response.Status.OK)
                .header("Access-Control-Allow-Origin", "*") // Headers for Swagger UI.
                .header("Access-Control-Allow-Headers", "Content-Type,X-Requested-With,Authorization")
                .header("Access-Control-Allow-Methods", "OPTIONS,POST")
                .entity(new Gson().toJson(detail))
                .build();
    }

    @GET
    @Path("proveedor")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON})
    public Response buscarJsonProveedorGet() {
        ArrayList<Entidad> detail = EntidadDAO.selectAll("prv");
        return Response.status(Response.Status.OK)
                .header("Access-Control-Allow-Origin", "*") // Headers for Swagger UI.
                .header("Access-Control-Allow-Headers", "Content-Type,X-Requested-With,Authorization")
                .header("Access-Control-Allow-Methods", "OPTIONS,POST")
                .entity(new Gson().toJson(detail))
                .build();
    }
    
    @POST
    @Path("buscarentidadnumero")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON})
    public Response buscarNumero( Entidad entidad) {
        //entidad.setExt_id("cli");
        ArrayList<Entidad> detail = EntidadDAO.selectFilterNumber(entidad);
        return Response.status(Response.Status.OK)
                .header("Access-Control-Allow-Origin", "*") // Headers for Swagger UI.
                .header("Access-Control-Allow-Headers", "Content-Type,X-Requested-With,Authorization")
                .header("Access-Control-Allow-Methods", "OPTIONS,POST")
                .entity(new Gson().toJson(detail))
                .build();
    }
}
