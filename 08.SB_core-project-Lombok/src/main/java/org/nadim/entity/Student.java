package org.nadim.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties("my.app")
public class Student {
	private String id;
	private String name;
	private String gender;
}
