package com.immutable.alias.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.immutable.alias.service.MovieService;

public class MovieRecommender {

	  @Autowired
	  private ApplicationContext context;

	  private Logger logger = LoggerFactory.getLogger(this.getClass());
	  
	  public MovieRecommender() {
	    //logger.info("start");
		try {
			//MovieService movieService =(MovieService) context.getBean("movieService");
			//movieService.test();
		} catch (Exception e) {
			logger.debug("getBean出错",e);
		}
		
		
	  }

	  // ...
	}