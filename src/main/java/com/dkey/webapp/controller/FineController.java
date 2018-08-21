package com.dkey.webapp.controller;

import com.dkey.webapp.entity.Fine;
import com.dkey.webapp.repository.FineRepository;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("fines/v1/")
public class FineController {
    @Inject
    private FineRepository fineRepository;

    @GET
    @Path("/{inn}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Fine> getFineByIntruderInn (@PathParam("inn") String inn){
        return fineRepository.getFineByIntruderInn(inn);
    }
}
