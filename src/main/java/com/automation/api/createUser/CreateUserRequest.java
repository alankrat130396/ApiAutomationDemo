package com.automation.api.createUser;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class CreateUserRequest {
    @NonNull private String name;
    @NonNull private String[] movies;
}
