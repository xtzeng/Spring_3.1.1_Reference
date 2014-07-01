package com.immutable.alias.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service("movieService")
public class MovieService {

	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public void test() {
		
		logger.info("hello============this is test");
	}
}
