package org.nadim.profileRunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class MassageRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Message Runner....");
	}

}
