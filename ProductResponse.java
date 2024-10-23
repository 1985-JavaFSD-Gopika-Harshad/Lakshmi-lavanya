package com.revature.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data

public class ProductResponse {
	
	 private Long id;
	    private String name;
	    private String description;
	    private String skuCode;
	    private Double price;
	    private Long supplierId;


}
