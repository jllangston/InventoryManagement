package com.cisco.ims.presentation;


import com.cisco.ims.service.InventoryService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.xml.ws.Response;
import java.util.Optional;

@Path("/ims/")
public class InventoryController {

    private InventoryService service;

    @GET
    @Path("items")
    public Response getInventory(
            @QueryParam("id") Optional<Long> id) {
        if (id.isPresent()) {
            service.getById(id.get());
        } else {
            service.getInventory();
        }
    }

//    @GET
//    @PATH("items/{id}")



}
