package com.techleads.app.service;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TxService {
@Pointcut("execution(public void com.techleads.app.dao.EmployeeDao.saveEmployee())")
	public void p1() {
		
	}
	
	@Before("p1()")//JoinPoint
	public void beginTx() {
		System.out.println("@Before: Tx started");
	}
	@After("p1()")
	public void commitTx() {
		System.out.println("@After: Tx committed");
	}
	
}
