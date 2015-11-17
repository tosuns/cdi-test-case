/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.test;

import com.cdi.test.model.Message;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author tosun_001
 */
@Named
@Stateless
@Path("resources")
public class WebresourceResource {

    @Inject
    private IndexController indexController;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of WebresourceResource
     */
    public WebresourceResource() {
    }

    /**
     * Retrieves representation of an instance of
     * com.cdi.test.WebresourceResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Message getXml() {
        return new Message().setMesssage(indexController.getGreetings());
    }


}
