package com.hw;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest
class HwApplicationTests {

	@Test
	void contextLoads() {
		assertThat("Hello World", equalTo("Hello World"));
	}

}
