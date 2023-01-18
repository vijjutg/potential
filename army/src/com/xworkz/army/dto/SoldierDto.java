package com.xworkz.army.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SoldierDto extends AbstractAuditDto{
	
	@Min(value = 1, message = "id should be greater than 1")
	@Max(value = 1000, message = "id should be lesser than 1000")
	private int id;
	
	@NotNull
	@NotBlank
	@Size(min = 3, max = 20, message = "The name should be greater than 3 or lesser than 20")
	private String name;
	
	@NotNull
	@NotBlank
	@Size(min = 5, max = 30, message = "rank should be greater than 5 or lesser than 30")
	private String rank;
	
	@NotNull
	@NotBlank
	@Size(min = 5, max = 30, message = "rank should be greater than 5 or lesser than 30")
	private String country;

}
