package com.microservice.orderservice.common;

import com.microservice.orderservice.entity.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionResponse {
	
	private Order order;
	private String transactionId;
	private  double amount;
	private String message;

}
