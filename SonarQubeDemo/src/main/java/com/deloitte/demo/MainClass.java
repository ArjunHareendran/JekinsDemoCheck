package com.deloitte.demo;

import org.apache.log4j.Logger;

public class MainClass {

	final static Logger logger = Logger.getLogger(MainClass.class);

	private MainClass() {
	}

	public static void main(String[] args) {
		logger.info(new Calculator().sum(5, 6));
	}

}
