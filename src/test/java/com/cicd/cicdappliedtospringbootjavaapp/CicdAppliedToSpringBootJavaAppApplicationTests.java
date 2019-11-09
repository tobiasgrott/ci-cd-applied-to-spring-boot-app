package com.cicd.cicdappliedtospringbootjavaapp;

import com.cicd.cicdappliedtospringbootjavaapp.controller.HelloController;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CicdAppliedToSpringBootJavaAppApplicationTests {

	@Autowired
	private HelloController controller;

	@Test
	void contextLoads() {
		Assertions.assertEquals("Hello World from CICD", controller.home());
	}

}
