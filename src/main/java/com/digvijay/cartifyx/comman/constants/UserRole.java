package com.digvijay.cartifyx.comman.constants;


import lombok.Getter;

@Getter
public enum UserRole {
    SUPER_ADMIN_ROLE("Administrator","Has full access"),
    ADMIN_ROLE("Admin","Less Access than super admin"),
    USER_ROLE("user","can use basic feature");

    private final String displayName;
    private final String description;

    UserRole(String displayName, String description) {
            this.displayName = displayName;
            this.description = description;
    }

}
