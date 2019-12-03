package com.brands.core.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {

	private static final Logger LOG = LoggerFactory
			.getLogger(HelloWorld.class);

	public static String getHello() {
		LOG.info("Hello World Log!");

		return "Hello World 13!";
	}
}
