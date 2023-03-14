package com.pms.payrollapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pms.payrollapi.entity.Payroll;

@RestController
@RequestMapping("/api/payments")
public class PayrollController {
	
	@GetMapping("/{workerId}")
	public ResponseEntity<Payroll> getPayment(@PathVariable Long workerId,
			@RequestBody Payroll payment){
		return ResponseEntity.ok().body(
				new Payroll("Alceu", 
						payment.getDescription(), 
						payment.getPriceHour(), 
						payment.getWorkedHours(),
						payment.getPriceHour()* payment.getWorkedHours())
				);
	}

}
