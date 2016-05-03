package com.example.SpringHibernate.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main( String[] args ) {
		logger.info("Starting ..");

		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:applicationContext.xml")) {

			logger.info("Application context loaded ..");
			logger.info("===========================================================");
		}
		
		logger.info("===========================================================");
		logger.info("Done ..");
    }
}
