package com.example.demo.utils;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;


public enum Rol {

    CUSTOMER(Arrays.asList(Permission.READ_ALL_PRODUCTS)),
    ADMI(Arrays.asList(Permission.READ_ALL_PRODUCTS,Permission.SAVE_ONE_PRODUCT));

    private List<Permission> permissions;

    Rol(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }
}
