package com.automation.clients;

import com.automation.api.createUser.CreateUserEndpoint;
import com.automation.api.createUser.CreateUserRequest;
import com.automation.api.createUser.CreateUserResponse;
import com.automation.core.RequestProcessor;
import io.restassured.response.Response;

public class UserClient {

    public CreateUserResponse createUser(CreateUserRequest request){
        CreateUserEndpoint endpoint = new CreateUserEndpoint(request);
        Response response = RequestProcessor.processRequest(endpoint);
        return response.as(CreateUserResponse.class);
    }
}
