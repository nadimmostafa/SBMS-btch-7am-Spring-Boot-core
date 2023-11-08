package org.nadim.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties("my.app")
public class DBConnection {
	private String driver;
	private String url;
	private String userName;
	private String password;
}
