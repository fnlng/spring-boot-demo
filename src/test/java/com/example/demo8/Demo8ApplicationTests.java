package com.example.demo8;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo8.controller.TestController;

@SpringBootTest
class Demo8ApplicationTests {

	@Autowired
	public TestController testController;

	@Test
	void contextLoads() {
		System.out.println("a test run success");
	}


}
