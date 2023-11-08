package org.nadim.runner;

import org.nadim.entity.EmailConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyAppRunner implements CommandLineRunner {
	
	@Autowired
	private EmailConfig con;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(con);
	}

}
