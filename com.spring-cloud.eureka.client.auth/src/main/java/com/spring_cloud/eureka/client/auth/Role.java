package com.spring_cloud.eureka.client.auth;

public enum Role {
    MANAGER("manager"),
    MEMBER("member");

    private final String roleName;

    Role(String roleName){
        this.roleName=roleName;
    }

    public String getRoleName(){
        return roleName;
    }
}
