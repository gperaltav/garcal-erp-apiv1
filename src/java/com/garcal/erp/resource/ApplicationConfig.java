/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garcal.erp.resource;

import java.util.Locale;
import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Gloria Peralta <gloria.ypv@gmail.com>
 */
@javax.ws.rs.ApplicationPath("api")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {

        Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method. It is automatically
     * populated with all resources defined in the project. If required, comment
     * out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {

        resources.add(com.garcal.erp.resource.basedatos.ContratosResource.class);
        resources.add(com.garcal.erp.resource.basedatos.DocumentosResource.class);
        resources.add(com.garcal.erp.resource.basedatos.EmpresasResource.class);
        resources.add(com.garcal.erp.resource.basedatos.EntidadResource.class);
        resources.add(com.garcal.erp.resource.basedatos.EspecialidadResource.class);
        resources.add(com.garcal.erp.resource.basedatos.FleteResource.class);
        resources.add(com.garcal.erp.resource.basedatos.FormasDeCobroResource.class);
        resources.add(com.garcal.erp.resource.basedatos.FormasDePagoResource.class);
        resources.add(com.garcal.erp.resource.basedatos.ProductosResource.class);
        resources.add(com.garcal.erp.resource.basedatos.PuestosResource.class);
        resources.add(com.garcal.erp.resource.basedatos.RutasResource.class);
        resources.add(com.garcal.erp.resource.basedatos.TrabajadoresResource.class);
        resources.add(com.garcal.erp.resource.basedatos.TripulacionResource.class);
        resources.add(com.garcal.erp.resource.basedatos.UbigeoResource.class);
        resources.add(com.garcal.erp.resource.basedatos.UsuariosResource.class);
        resources.add(com.garcal.erp.resource.basedatos.VehiculosClasesResource.class);
        resources.add(com.garcal.erp.resource.basedatos.VehiculosMarcasResource.class);
        resources.add(com.garcal.erp.resource.basedatos.VehiculosModelosResource.class);
        resources.add(com.garcal.erp.resource.basedatos.VehiculosResource.class);
        resources.add(com.garcal.erp.resource.basedatos.VehiculosTiposResource.class);
        resources.add(com.garcal.erp.resource.caja.ComprobantesComprasPagosResource.class);
        resources.add(com.garcal.erp.resource.caja.ComprobantesVentasCobrosResource.class);
        resources.add(com.garcal.erp.resource.compras.ComprobantesComprasCabResource.class);
        resources.add(com.garcal.erp.resource.compras.ComprobantesComprasDetResource.class);
        resources.add(com.garcal.erp.resource.compras.ComprobantesComprasEstadosResource.class);
        resources.add(com.garcal.erp.resource.compras.ComprobantesComprasReferenciaResource.class);
        resources.add(com.garcal.erp.resource.compras.ComprobantesComprasResource.class);
        resources.add(com.garcal.erp.resource.compras.ComprobantesComprasTiposResource.class);
        resources.add(com.garcal.erp.resource.compras.ComprobantescomprasEntregardineroPendienteResource.class);
        resources.add(com.garcal.erp.resource.controldocumentos.ControlDocumentosTripulacionResource.class);
        resources.add(com.garcal.erp.resource.controldocumentos.ControlDocumentosVehiculosResource.class);
        resources.add(com.garcal.erp.resource.mantenimiento.MantenimientosDetResource.class);
        resources.add(com.garcal.erp.resource.mantenimiento.PreventivoPlantillaResource.class);
        resources.add(com.garcal.erp.resource.planificacionviajes.TripulacionOperarioDocumentosResource.class);
        resources.add(com.garcal.erp.resource.planificacionviajes.TripulacionPendientesViajesResource.class);
        resources.add(com.garcal.erp.resource.planificacionviajes.VehiculosPendientesViajesResource.class);
        resources.add(com.garcal.erp.resource.planificacionviajes.ViajesEstadosResource.class);
        resources.add(com.garcal.erp.resource.planificacionviajes.ViajesFechaResource.class);
        resources.add(com.garcal.erp.resource.planificacionviajes.ViajesResource.class);
        resources.add(com.garcal.erp.resource.ventas.ComprobantesVentasCabResource.class);
        resources.add(com.garcal.erp.resource.ventas.ComprobantesVentasCobrosResource.class);
        resources.add(com.garcal.erp.resource.ventas.ComprobantesVentasEstadosResource.class);
        resources.add(com.garcal.erp.resource.ventas.ComprobatesVentasTiposResource.class);
        resources.add(com.garcal.erp.resource.ventas.GuiasConfiguracionResource.class);
        resources.add(com.garcal.erp.resource.ventas.GuiasResource.class);
    }

}
