package com.kamruddin.test_app;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class UserProvider {

    public List<User> getUsers() {
        return List.of(
                new User("John Doe", "john.doe@example.com", "New York"),
                new User("Jane Smith", "jane.smith@example.com", "Los Angeles"),
                new User("Alice Johnson", "alice.johnson@example.com", "Chicago"),
                new User("Bob Brown", "bob.brown@example.com", "Houston"),
                new User("Charlie Davis", "charlie.davis@example.com", "Phoenix")
        );
    }
}
