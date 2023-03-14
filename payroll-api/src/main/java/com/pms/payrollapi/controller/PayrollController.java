package com.pms.payrollapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pms.payrollapi.entity.Payroll;
import com.pms.payrollapi.service.PayrollService;

@RestController
@RequestMapping("/api/payments")
public class PayrollController {
	
	@Autowired
	private PayrollService payrollService;
	
	@GetMapping("/{workerId}")
	public ResponseEntity<Payroll> getPayment(@PathVariable Long workerId,
			@RequestBody Payroll payment){
		return ResponseEntity.ok().body(payrollService.getPayment(workerId, payment));
	}

}
