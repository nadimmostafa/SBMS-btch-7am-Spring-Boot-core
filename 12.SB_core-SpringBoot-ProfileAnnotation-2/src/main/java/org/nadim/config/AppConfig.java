package org.nadim.config;

import org.nadim.entity.DbConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfig {
	@Bean
	@Profile({"dev","default"})
	public DbConnection objCreation() {
		DbConnection con = new DbConnection();
		con.setDriver("OracleDriver");
		con.setUrl("jdbc:Oracle");
		return con;
	}
}
