package org.nidhi.jobpostingproject.aop;

import java.util.List;

import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);
    //private static final String

    @Before("execution(* org.nidhi.jobpostingproject.controller.PostController.getAllPosts())")
    public void logBefore() {
        LOGGER.info("GetAllPosts Called!");
    }

    // Irrespective of response
    //    @After("execution(* org.nidhi.jobpostingproject.controller.PostController.getAllPosts())")
    //    public void logAfterAnyway() {
    //        LOGGER.info("GetAllPosts Executed!");
    //    }

    //Only after execution is successful
    @AfterReturning("execution(* org.nidhi.jobpostingproject.controller.PostController.getAllPosts())")
    public void logAfter() {
        LOGGER.info("GetAllPosts Executed!");
    }

    //Log the error
    @AfterThrowing("execution(* org.nidhi.jobpostingproject.controller.PostController.getAllPosts())")
    public void logException() {
        LOGGER.info("GetAllPosts execution failed!");
    }
}
