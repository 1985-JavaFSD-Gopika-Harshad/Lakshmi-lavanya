package com.revature.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ProductRequest {
	
	  @NotBlank(message = "Name is mandatory")
	    private String name;

	    private String description;

	    @NotBlank(message = "SKU code is mandatory")
	    private String skuCode;

	    @NotNull(message = "Price is mandatory")
	    private Double price;

	    @NotNull(message = "Supplier ID is mandatory")
	    private Long supplierId;

}
