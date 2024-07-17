package com.acme.authz.core.service;

import java.util.UUID;

/**
 * @author isa
 * @since 18.07.2024
 */
public class UUIDGenerator {
    public static String generateUUID() {
        return UUID.randomUUID().toString();
    }
}
