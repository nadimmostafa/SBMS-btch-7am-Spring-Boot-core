package org.nadim;

import org.nadim.service.Service;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties("my.app")
public class ControllerDemo {
	private String name;
	
	// reference type
	private Service service;
}
