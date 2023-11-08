package org.nadim.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;


@Setter
@NoArgsConstructor
@ToString
@Component
@ConfigurationProperties("my.app")
@EqualsAndHashCode
public class EmailConfig {
	
	private Integer port;
	@NonNull
	private String host;
	private Boolean active;
}
