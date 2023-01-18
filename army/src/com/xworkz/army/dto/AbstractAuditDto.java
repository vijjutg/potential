package com.xworkz.army.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class AbstractAuditDto implements Serializable {
	
	private String CreatedBy;
	private LocalDateTime CreatedAt;
	private String UpdatedBy;
	private LocalDateTime UpdatedAt;

}
