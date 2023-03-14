package com.pms.payrollapi.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.pms.payrollapi.exception.ObjectNotFoundException;
import com.pms.payrollapi.entity.Payroll;
import com.pms.payrollapi.entity.User;
import com.pms.payrollapi.feignClients.UserFeign;

import feign.FeignException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class PayrollService {

	@Autowired
	private UserFeign userFeign;
	
	@Autowired
	private Environment env;
	
	public Payroll getPayment(Long workerId, Payroll payroll) {
		log.info("PAYROLL_SERVICE ::: Get request on " + env.getProperty("local.server.port") + " port" );
		try {
		User user = userFeign.findById(workerId).getBody();
		if(Objects.nonNull(user))
			return new Payroll(
					user.getName(),
					payroll.getDescription(),
					user.getPriceHour(),
					payroll.getWorkedHours(),
					payroll.getWorkedHours() * user.getPriceHour()
					);
		}
		catch(FeignException.NotFound exception) {
			throw new ObjectNotFoundException("Object not found");
		} catch (Exception exception) {
			throw new IllegalArgumentException("Illegal argument exception");
		}
		return null;
	}
}
