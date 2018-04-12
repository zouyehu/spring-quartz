package com.zyh.spring.quartz;

import com.zyh.spring.modle.ScheduleJob;
import com.zyh.spring.vo.ScheduleJobVo;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * 异步任务工厂
 *
 * @author Hu
 */
public class AsyncJobFactory extends QuartzJobBean {

    /* 日志对象 */
    private static final Logger LOG = LoggerFactory.getLogger(AsyncJobFactory.class);

    /**
     * 定义了任务执行的具体逻辑
     */
    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        LOG.info("AsyncJobFactory execute");
        ScheduleJob scheduleJob = (ScheduleJob) context.getMergedJobDataMap().get(ScheduleJobVo.JOB_PARAM_KEY);
        System.out.println("jobName:" + scheduleJob.getJobName() + "  " + scheduleJob);
    }
}