package com.ppg.redisdemo.config;


import org.quartz.Scheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
public class SimpleQuartzConf {

    @Autowired
    @Qualifier("druidDataSource")
    private DataSource dataSource;

    @Autowired
    @Qualifier("PpGJobFactory")
    private PpGJobFactory ppGJobFactory;

    @Bean(name = "ppg_schedulerFactoryBean")
    public SchedulerFactoryBean schedulerFactoryBean() {
        SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();
        schedulerFactoryBean.setQuartzProperties(getPros());
        schedulerFactoryBean.setAutoStartup(true);
        schedulerFactoryBean.setDataSource(dataSource);
        schedulerFactoryBean.setJobFactory(ppGJobFactory);
        return schedulerFactoryBean;
    }

    @Bean
    public Scheduler scheduler() throws Exception{
        Scheduler scheduler = schedulerFactoryBean().getScheduler();

        scheduler.start();

        return scheduler;
    }

    private Properties getPros(){
        Properties properties = new Properties();
        properties.put("quartz.scheduler.instanceName","ppg-scheduler");
        properties.put("org.quartz.scheduler.instanceId","AUTO");
        properties.put("org.quartz.scheduler.skipUpdateCheck","true");
        properties.put("org.quartz.scheduler.jobFactory.class","org.quartz.simpl.SimpleJobFactory");
        properties.put("org.quartz.jobStore.class","org.quartz.impl.jdbcjobstore.JobStoreTX");
        properties.put("org.quartz.jobStore.driverDelegateClass","org.quartz.impl.jdbcjobstore.StdJDBCDelegate");
        properties.put("org.quartz.jobStore.tablePrefix","QRTZ_");
        properties.put("org.quartz.jobStore.isClustered","true");
        properties.put("org.quartz.jobStore.clusterCheckinInterval","20000");
        properties.put("org.quartz.threadPool.class","org.quartz.simpl.SimpleThreadPool");
        properties.put("org.quartz.threadPool.threadCount","10");
        return properties;
    }
}
