package com.dkey.webapp.controller;

import com.dkey.webapp.entity.Car;
import com.dkey.webapp.repository.CarRepository;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("cars/v1/")
public class CarController {
    @Inject
    private CarRepository carRepository;

    @GET
    @Path("/{inn}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Car> getCarByOwnerInn (@PathParam("inn") String inn){
        return carRepository.getCarByOwnerInn(inn);
    }
    @GET
    @Path("/nreg/{n_reg}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Car> getCarByNreg (@PathParam("n_reg") String nreg){
        return carRepository.getCarByNreg(nreg);
    }
}

