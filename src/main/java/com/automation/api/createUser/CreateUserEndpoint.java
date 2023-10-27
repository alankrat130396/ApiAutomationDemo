package com.automation.api.createUser;

import com.automation.core.AbstractServiceEndpoint;
import com.automation.utils.ApiRouter;
import com.automation.utils.HttpMethod;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
public class CreateUserEndpoint extends AbstractServiceEndpoint {

    private final CreateUserRequest request;

    public CreateUserEndpoint(CreateUserRequest request) {
        this.request = request;
    }

    @Override
    public String endpointUrl() {
        return ApiRouter.createUserEndpoint;
    }

    @Override
    public Headers headers() {
        // List<Header> headerlist = new ArrayList<>();
        // headerlist.add(new Header("key", "value"));
        return super.headers();
    }

    @Override
    public String requestBody() {
        // Either can be defined or can be passed from testcase itself
        try {
            return mapper.writeValueAsString(request);
        }catch (JsonProcessingException ex){
            log.info("Json processing failed for obj: {}", requestBody());
        }
        return null;
    }

    @Override
    public Map<String, String> queryParam() {
        return super.queryParam();
    }

    @Override
    public Map<String, String> pathParam() {
        Map<String, String> pathparamMap = new HashMap<>();
        pathparamMap.put("param", "users");
        return pathparamMap;
    }

    @Override
    public HttpMethod httpMethod(){
        return HttpMethod.POST;
    }
}
