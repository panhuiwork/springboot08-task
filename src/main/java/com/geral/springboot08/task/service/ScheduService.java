package com.geral.springboot08.task.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduService {

	
	/**
	 * second(秒) ，minute(分)，hour(时)，day of month(日)，month(月)，day of week(周几)0-7可以写数字0和7都是周日
	 *0 * * * * MON-FRI  //周一到周五 任何时刻整秒启动(每分钟都运行)
	 *
	 */
//	@Scheduled(cron="0 * * * * MON-FRI")
//	@Scheduled(cron="0,1,2 * * * * MON-STA") //周一到周六每分钟前3秒都运行
//	@Scheduled(cron="0-4 * * * * MON-STA")  //周一到周六每分钟前4秒都运行
	@Scheduled(cron="0/4 * * * * 0-6") //每4秒执行一次
	public void hello() 
	{
		System.out.println("Say Hello");
	}
}
