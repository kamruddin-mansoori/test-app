package com.kamruddin.test_app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class TestAppApplicationTests {

	@Test
	@DisplayName("Context Loads Test")
	void contextLoads() {
		assert true;
	}

	@Test
	void testApp() {
		assertTrue("TestAppApplicationTests".equals(this.getClass().getSimpleName()));
	}

}
