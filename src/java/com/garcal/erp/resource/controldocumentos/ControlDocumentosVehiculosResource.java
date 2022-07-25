/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.resource.controldocumentos;

import com.garcal.erp.DAO.controldocumentos.ControlDocumentosVehiculosDAO;
import com.garcal.erp.model.ResponseAnswer;
import com.garcal.erp.model.controldocumentos.ControlDocumentosVehiculos;
import com.google.gson.Gson;
import java.util.ArrayList;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author User
 */
@Path("controldocumentosvehiculos")

public class ControlDocumentosVehiculosResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON})
    public Response buscarJson(ControlDocumentosVehiculos controlDocumentosVehiculos) {
        ArrayList<ControlDocumentosVehiculos> detail = ControlDocumentosVehiculosDAO.selectFilter(controlDocumentosVehiculos);
        return Response.status(Response.Status.OK)
                .header("Access-Control-Allow-Origin", "*") // Headers for Swagger UI.
                .header("Access-Control-Allow-Headers", "Content-Type,X-Requested-With,Authorization")
                .header("Access-Control-Allow-Methods", "OPTIONS,POST")
                .entity(new Gson().toJson(detail))
                .build();
    }

    @POST
    @Path("vista")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON})
    public Response buscar(ControlDocumentosVehiculos controlDocumentosVehiculos) {
        ArrayList<ControlDocumentosVehiculos> detail = ControlDocumentosVehiculosDAO.selectID(controlDocumentosVehiculos);
        return Response.status(Response.Status.OK)
                .header("Access-Control-Allow-Origin", "*") // Headers for Swagger UI.
                .header("Access-Control-Allow-Headers", "Content-Type,X-Requested-With,Authorization")
                .header("Access-Control-Allow-Methods", "OPTIONS,POST")
                .entity(new Gson().toJson(detail))
                .build();
    }

    @POST
    @Path("nuevo")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON})
    public Response postJson(ControlDocumentosVehiculos controlDocumentosVehiculos) {
        /* ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
         Validator validator = factory.getValidator();
         validator.validate(business);
         Set<ConstraintViolation<Business>> violations = validator.validate(business);

         if (violations.isEmpty()) {*/
        ResponseAnswer postResponse = ControlDocumentosVehiculosDAO.insert(controlDocumentosVehiculos);
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

}
