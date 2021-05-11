package com.gimnasio.proyectogimnasio.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 *
 * @author Gabriel Peña, brian Riffo, Sergio solano
 */
@Path("javaee8")
public class JavaEE8Resource {
    
    @GET
    public Response ping(){
        return Response
                .ok("ping")
                .build();
    }
}
