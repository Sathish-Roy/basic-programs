package demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* demo.*.*(..))")
    public void logBefore() {
        System.out.println("🔸 Before Advice: Method is about to start.");
    }

    @After("execution(* demo.*.*(..))")
    public void logAfter() {
        System.out.println("🔹 After Advice: Method execution finished.");
    }
}

