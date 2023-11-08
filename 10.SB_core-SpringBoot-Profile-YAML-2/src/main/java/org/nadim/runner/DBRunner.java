package org.nadim.runner;

import org.nadim.entity.DBConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DBRunner implements ApplicationRunner {
	
	@Autowired
	private DBConnection con;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(con);
	}

}
