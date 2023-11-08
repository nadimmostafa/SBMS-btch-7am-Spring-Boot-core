package org.nadim;

import org.nadim.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyAppRunner implements CommandLineRunner {
	
	@Autowired
	private StudentEntity std;

	@Override
	public void run(String... args) throws Exception {
			System.out.println(std);
	}

}
