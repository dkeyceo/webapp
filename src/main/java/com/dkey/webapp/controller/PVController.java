package com.dkey.webapp.controller;

import com.dkey.webapp.entity.PV;
import com.dkey.webapp.repository.PVRepository;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("license/v1/")
public class PVController {
    @Inject
    private PVRepository pvRepository;

    @GET
    @Path("/{inn}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<PV> getLicenseByDriverInn (@PathParam("inn") String inn){
        return pvRepository.getLicenseByDriverInn(inn);
    }
}
