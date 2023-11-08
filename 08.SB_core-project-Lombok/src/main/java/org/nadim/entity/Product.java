package org.nadim.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
	@NonNull
	private Integer pId;
	@Setter
	@Getter
	private Double price;
	private String pname;
}
