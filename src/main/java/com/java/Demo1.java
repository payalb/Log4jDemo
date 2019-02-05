package com.java;

import org.apache.log4j.Logger;

public class Demo1 {
	
	static Logger logger= Logger.getLogger(Demo1.class);
	public static void main(String[] args) {
			logger.info("Starting app");
			int sum=0;
			for(int i=0; i<10; i++) {
				sum +=i;
			}
			logger.debug("sum is "+ sum);
			logger.info("Exiting app");
	}
}
//service class: other than business logic {security, transaction management, logging}