package com.example.infrastructure;

import com.example.domain.User;

public interface UserRepository {
    void save(User user);
}
