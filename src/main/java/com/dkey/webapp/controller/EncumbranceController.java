package com.dkey.webapp.controller;

import com.dkey.webapp.entity.Encumbrance;
import com.dkey.webapp.repository.EncumbranceRepository;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("encumbrances/v1/")
public class EncumbranceController {
    @Inject
    private EncumbranceRepository encumbranceRepository;

    @GET
    @Path("/{inn}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Encumbrance> getEncumbrancesByOwnerInn (@PathParam("inn") String inn){
        return encumbranceRepository.getEncumbracesByOwnerInn(inn);
    }
}
