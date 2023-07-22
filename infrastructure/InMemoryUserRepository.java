package com.example.infrastructure;

import com.example.domain.User;

public class InMemoryUserRepository implements UserRepository {
    @Override
    public void save(User user) {
        System.out.println("Usuario guardado en la base de datos en memoria: " + user.getUsername());
    }
}
