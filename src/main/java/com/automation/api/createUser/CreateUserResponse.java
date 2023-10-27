package com.automation.api.createUser;

import lombok.Data;

@Data
public class CreateUserResponse {
    private String name;
    private String[] movies;
    private String id;
    private String createdAt;
}
