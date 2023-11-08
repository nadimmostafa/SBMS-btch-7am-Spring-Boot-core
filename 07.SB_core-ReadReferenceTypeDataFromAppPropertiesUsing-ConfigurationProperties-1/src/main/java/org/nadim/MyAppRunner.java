package org.nadim;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyAppRunner implements CommandLineRunner {
	
	@Autowired
	private ControllerDemo controller;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(controller);
	}
}
