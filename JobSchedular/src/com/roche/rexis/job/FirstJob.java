package com.roche.rexis.job;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class FirstJob implements Job  {

	public void execute(JobExecutionContext context) throws JobExecutionException {
	
		System.out.println("This is scheduled job"+ new Date());
	}
	


}
