package com.automation.core;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RequestProcessor {

    public static Response processRequest(AbstractServiceEndpoint endpoint){
        RequestSpecification requestSpecification = getRequestSpecification(endpoint);
        return getResponse(requestSpecification, endpoint);
    }

    private static RequestSpecification getRequestSpecification(AbstractServiceEndpoint endpoint){
        RequestSpecification requestSpecification = RestAssured.given();
        if (endpoint.endpointUrl()!=null){
            requestSpecification.baseUri(endpoint.endpointUrl());
        }
        if (endpoint.queryParam()!=null){
            requestSpecification.queryParams(endpoint.queryParam());
        }
        if (endpoint.pathParam()!=null){
            requestSpecification.pathParams(endpoint.pathParam());
        }
        if (endpoint.headers()!=null){
            requestSpecification.headers(endpoint.headers());
        }
        if (endpoint.requestBody()!=null){
            requestSpecification.body(endpoint.requestBody());
        }
        if (endpoint.getContentType()!=null){
            requestSpecification.contentType(endpoint.getContentType());
        }

        return requestSpecification;
    }

    private static Response getResponse(RequestSpecification requestSpecification, AbstractServiceEndpoint endpoint){
        switch (endpoint.httpMethod()) {
            case POST:
                return requestSpecification.post("{param}");
            case GET:
                return requestSpecification.get();
            case PUT:
                return requestSpecification.put();
            case PATCH:
                return requestSpecification.patch();
            case DELETE:
                return requestSpecification.delete();
            default:
                return null;
        }
    }


}
