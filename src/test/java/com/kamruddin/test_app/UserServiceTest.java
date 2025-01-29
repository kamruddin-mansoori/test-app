package com.kamruddin.test_app;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Execution(ExecutionMode.CONCURRENT)
@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserProvider userProvider;

    @Autowired
    private UserService userService;

    @ParameterizedTest(name = "{0}")
    @MethodSource("userProvider")
    void sendMail(User user) {
        assertTrue(this.userService.sendMail(user));
    }

    public Stream<User> userProvider() {
        return this.userProvider.getUsers().stream();
    }
}