package com.acme.authz.core.model;

/**
 * @author isa
 * @since 18.07.2024
 */
public class Permission {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
