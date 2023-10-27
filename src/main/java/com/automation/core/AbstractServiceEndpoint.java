package com.automation.core;

import com.automation.utils.HttpMethod;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.internal.http.CustomHttpMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractServiceEndpoint {

    // headers
    // Body
    // query param
    // path param
    // method
    // content Type
    protected final ObjectMapper mapper = new ObjectMapper();

    public Headers headers(){
        return new Headers();
    }

    public String requestBody(){
        return null;
    }

    public Map<String, String> queryParam(){
        return null;
    }

    public Map<String, String> pathParam(){
        return null;
    }

    public String endpointUrl(){
        return null;
    }

    public ContentType getContentType(){
        return ContentType.JSON;
    }

    public HttpMethod httpMethod(){
        return null;
    }

}
