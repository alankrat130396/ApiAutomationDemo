package com.automation.utils;

public class ApiRouter {
    public static String getUserEndpoint = hostBuilder("api/products/3");
    public static String createUserEndpoint = hostBuilder("api/users");

    private static String hostBuilder(String path){
        return String.format("%s/%s", getHostAsPerEnv(), path);
    }

    private static String getHostAsPerEnv(){
        if (System.getenv("API_ENV").toUpperCase().equalsIgnoreCase(EnvType.QAT.toString())){
            return "https://qat.reqres.in";
        }
        else if (System.getenv("API_ENV").toUpperCase().equalsIgnoreCase(EnvType.PRODUCTION.toString())) {
            return "https://reqres.in";
        }
        else if (System.getenv("API_ENV").toUpperCase().equalsIgnoreCase(EnvType.STAGING.toString())) {
            return "https://staging.reqres.in";
        }
        else{
            throw new IllegalArgumentException("Not a valid env type");
        }
    }
}
