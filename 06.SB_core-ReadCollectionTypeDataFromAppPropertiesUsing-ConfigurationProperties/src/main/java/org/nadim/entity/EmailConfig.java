package org.nadim.entity;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties("my.app")
public class EmailConfig {
	private Integer port;
	private String host;
	private Boolean active;
	
	// for list, set and array define value inside properties file process is same
	List<String> providerName;
	// Integer Arr[];
	//Set<String> providerName;
	
	Map<String, String> productWithId;
}
