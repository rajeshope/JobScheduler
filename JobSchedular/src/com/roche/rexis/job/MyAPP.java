package com.roche.rexis.job;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class MyAPP {

	public static void main(String[] args) {
		try {
				
				JobDetail jobDetail = JobBuilder.newJob(FirstJob.class).withIdentity("firsjob","groupone").build();
				Trigger trigger = TriggerBuilder.newTrigger().withIdentity("crontriggerone", "groupone").withSchedule(CronScheduleBuilder.cronSchedule(" 0/5 * * * * ?")).build();
				Scheduler sched = new StdSchedulerFactory().getScheduler();
				sched.start();
				sched.scheduleJob(jobDetail, trigger);
				
		}catch (Exception e) {
			       e.printStackTrace();
			}
			
	}

}
