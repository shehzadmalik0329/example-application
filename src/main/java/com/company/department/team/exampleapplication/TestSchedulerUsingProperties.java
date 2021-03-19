package com.company.department.team.exampleapplication;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestSchedulerUsingProperties {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Scheduled(cron = "${cron.expression}")
	public void scheduleTaskUsingPropertiesFile() {
		logger.info("Inside scheduleTaskUsingPropertiesFile at [{}]",new Date());
	}

}
