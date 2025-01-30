package com.kamruddin.test_app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class ApplicationLoadTest {

    @Test
    void testApp() {
        assertTrue("ApplicationLoadTest".equals(this.getClass().getSimpleName()));
    }
}
