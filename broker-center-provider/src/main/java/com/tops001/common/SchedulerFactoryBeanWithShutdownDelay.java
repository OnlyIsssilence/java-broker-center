package com.tops001.common;

import org.quartz.SchedulerException;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

/**
 * Created by Administrator on 2016/7/26.
 */
public class SchedulerFactoryBeanWithShutdownDelay extends SchedulerFactoryBean {
    @Override
    public void destroy() throws SchedulerException {
        super.destroy();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
