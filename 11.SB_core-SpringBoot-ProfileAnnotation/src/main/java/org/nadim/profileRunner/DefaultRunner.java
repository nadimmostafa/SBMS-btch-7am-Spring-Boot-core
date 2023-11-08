package org.nadim.profileRunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")
public class DefaultRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Default Runner...");
	}

}
