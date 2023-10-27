package com.automation.tests;

import com.automation.api.createUser.CreateUserRequest;
import com.automation.api.createUser.CreateUserResponse;
import com.automation.clients.UserClient;
import org.testng.Assert;
import org.testng.annotations.Test;


public class UserTest {

    volatile UserClient client = new UserClient();
    CreateUserRequest request = new CreateUserRequest("Shivam", new String[]{"titanic", "Mad Max Fury", "Pirates"});


    @Test
    public void createUserTest(){
        CreateUserResponse response = client.createUser(request);
        Assert.assertNotNull(response.getCreatedAt());
        Assert.assertNotNull(response.getId());
        Assert.assertNotNull(response.getName());
        Assert.assertNotNull(response.getMovies());
        Assert.assertTrue(response.getMovies().length>0);
    }
}
