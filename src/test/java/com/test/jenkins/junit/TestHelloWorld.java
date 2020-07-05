package com.test.jenkins.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.test.jenkins.pipeline.HelloWorld;

public class TestHelloWorld {

	@Test
	public void test() {
		HelloWorld helloWorld=new HelloWorld();
		assertEquals("Hello World",helloWorld.getMessage());
	}

}
