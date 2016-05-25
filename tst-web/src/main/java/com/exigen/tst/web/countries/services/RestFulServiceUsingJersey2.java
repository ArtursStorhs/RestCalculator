package com.exigen.tst.web.countries.services;

import com.exigen.tst.web.countries.model.InformationAboutCountries;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;


@Path("jsonConverting")
public class RestFulServiceUsingJersey2 {

        @GET
        @Path("abc")
        @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML })
        public Response objectToJson() {
            InformationAboutCountries information = new InformationAboutCountries();
            information.setCountry("Latvia");
            information.setCity("Riga");
            information.setPopulation(1973700);

            InformationAboutCountries information2 = new InformationAboutCountries();
            information2.setCountry("Estonia");
            information2.setCity("Talinn");
            information2.setPopulation(1315944);

            InformationAboutCountries information3 = new InformationAboutCountries();
            information3.setCountry("Lithuaniaa");
            information3.setCity("Vilnius");
            information3.setPopulation(2875593);

           ArrayList<InformationAboutCountries> result = new ArrayList<InformationAboutCountries>();
            result.add(information);
            result.add(information2);
            result.add(information3);

           GenericEntity entity = new GenericEntity<List<InformationAboutCountries>>(result) {};

            return Response.ok(entity).build();
        }
    }


