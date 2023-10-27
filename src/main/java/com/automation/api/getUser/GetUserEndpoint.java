package com.automation.api.getUser;

import com.automation.core.AbstractServiceEndpoint;
import io.restassured.http.Headers;

import java.util.Map;

public class GetUserEndpoint extends AbstractServiceEndpoint {

    @Override
    public String endpointUrl() {
        return "https://reqres.in";
    }
    @Override
    public Headers headers() {
        return super.headers();
    }

    @Override
    public String requestBody() {
        return super.requestBody();
    }

    @Override
    public Map<String, String> queryParam() {
        return super.queryParam();
    }

    @Override
    public Map<String, String> pathParam() {
        return super.pathParam();
    }
}
