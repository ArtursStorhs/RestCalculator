package com.exigen.tst.web.calculator.services;

import com.exigen.tst.web.calculator.model.ActionResponse;
import com.exigen.tst.web.calculator.model.ActionRequest;


import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *This class is suited for providing entered values from user to server.
 * @author astorhs
 * @version 1.0
 * @since 05.23.2016
 */
@Path("calculator")
public class CalculatorService {

    /**
     * This method takes from calculator user first number, second number and operation type. After that performs some calculations,
     * and than sends result back.
     *
     * @param request getting first number, second number and operation type form the user
     * @return response send calculated value to calculator user
     */
    @POST
    @Path("method")
    @Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML })
    public Response calculate(ActionRequest request) {
        ActionResponse response = new ActionResponse();
        Double result = null;
        request.getNumberOne();
        request.getNumberTwo();

        switch (request.getOperationType()) {
            case PLUS:
                result = request.getNumberOne() + request.getNumberTwo();
                break;
            case MINUS:
                result = request.getNumberTwo() - request.getNumberOne();
                break;
            case MULTIPLY:
                result = request.getNumberOne() * request.getNumberTwo();
                break;
            case DIVIDE:
                result = request.getNumberTwo() / request.getNumberOne();
                break;
            case SQRT:
                result = Math.sqrt(request.getNumberOne());
                break;
            case ABS:
                result = Math.abs(request.getNumberOne());
                break;
            case SIN:
                result = Math.sin(request.getNumberOne());
                break;
            case COS:
                result = Math.cos(request.getNumberOne());
                break;
            case TAN:
                result = Math.tan(request.getNumberOne());
                break;
            case POW:
                result = Math.pow(request.getNumberOne(),2);
                break;
            case PROC:
                result = (request.getNumberOne() / 100);
                break;
            case DIVIDEONE:
                result = (1/ request.getNumberOne());
                break;
        }

        response.setResult(result);
        return Response.ok(response).build();

    }
}

