package com.ppg.redisdemo.test;


import com.ppg.redisdemo.job.QuartzManager;
import com.ppg.redisdemo.job.TestJob;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QuartzTest {

    @Test
    public void testAdd(){

        String cron = "0/5 * * * * ?";

//        QuartzManager.addJob("job4test", TestJob.class,cron);



    }



}
