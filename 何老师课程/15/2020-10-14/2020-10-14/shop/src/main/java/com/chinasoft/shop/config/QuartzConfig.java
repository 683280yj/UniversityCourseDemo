package com.chinasoft.shop.config;


public class QuartzConfig {

//    public static void startQuartz() throws  Exception{
//        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
//        Scheduler scheduler = schedulerFactory.getScheduler();
//        // 启动scheduler
//        scheduler.start();
//        // 创建HelloworldJob的JobDetail实例，并设置name/group
//        JobDetail jobDetail = JobBuilder.newJob(QuartzController.class)
//                .withIdentity("myJob","myJobGroup1")
//                //JobDataMap可以给任务传递参数
//                .usingJobData("job_param","job_param1")
//                .build();
//        // 创建Trigger触发器设置使用cronSchedule方式调度
//        Trigger trigger = TriggerBuilder.newTrigger()
//                .withIdentity("myTrigger","myTriggerGroup1")
//                .usingJobData("job_trigger_param","job_trigger_param1")
//                .startNow()
//                //.withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(5).repeatForever())
//                .withSchedule(CronScheduleBuilder.cronSchedule("0 25 17 ? * *"))
//                .build();
//        // 注册JobDetail实例到scheduler以及使用对应的Trigger触发时机
//        scheduler.scheduleJob(jobDetail,trigger);
//    }

}
