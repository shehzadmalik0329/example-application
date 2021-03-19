package com.company.department.team.exampleapplication;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestScheduler {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Scheduled(cron = "0 0/1 * * * *")
	public void testScheduleTask() {
		logger.info("Inside testScheduleTask at [{}]",new Date());
	}

}
