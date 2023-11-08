package org.nadim.runner;

import org.nadim.entity.DbConnection;
import org.nadim.entity.EmailConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestObjRunner implements CommandLineRunner {
	
	// object not create for emailconfig if we privide profile name 'dev' at runtime
	//then create object and link
	//@Autowired
	//private EmailConfig config;
	
	@Autowired
	private DbConnection con;
	@Override
	public void run(String... args) throws Exception {
			System.out.println(con);
	}

}
