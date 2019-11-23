package com.ppg.redisdemo.job;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@DisallowConcurrentExecution //作用:禁止job并发进行
public class TestJob implements Job {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {

        logger.info("定时启动成功!!!!!");

    }
}
