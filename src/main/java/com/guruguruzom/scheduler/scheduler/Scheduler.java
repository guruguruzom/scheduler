package com.guruguruzom.scheduler.scheduler;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
public class Scheduler {
	 //5시 실행
	 @Scheduled(cron = "0 0 17 * * *")
    public void schedule1() {
        long now = System.currentTimeMillis() / 1000;
        System.out.println("test - ");
    }
	 
	 //1초당 실행
	 @Scheduled(fixedRate = 1000)
	 public void schedule2() {
	        long now = System.currentTimeMillis() / 1000;
	        System.out.println("test - ");
	    }
}
