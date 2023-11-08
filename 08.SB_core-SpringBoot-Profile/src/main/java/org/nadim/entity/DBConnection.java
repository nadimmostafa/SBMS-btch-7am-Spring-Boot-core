package org.nadim.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties("my.app")
public class DBConnection {
	private String driverName;
	private String url;
	private String userName;
	private String password;
}
