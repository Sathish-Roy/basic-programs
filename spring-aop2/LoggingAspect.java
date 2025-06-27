package com.example.springaopdemo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // Before Advice
    @Before("execution(* com.example.springaopdemo.PaymentService.*(..))")
    public void logBefore() {
        System.out.println("🔸 Before Advice: Method is about to be called.");
    }

    // After Advice
    @After("execution(* com.example.springaopdemo.PaymentService.*(..))")
    public void logAfter() {
        System.out.println("🔹 After Advice: Method execution completed.");
    }

    // After Returning Advice
    @AfterReturning("execution(* com.example.springaopdemo.PaymentService.*(..))")
    public void logAfterReturning() {
        System.out.println("✅ After Returning: Method executed successfully.");
    }

    // After Throwing Advice
    @AfterThrowing("execution(* com.example.springaopdemo.PaymentService.*(..))")
    public void logException() {
        System.out.println("❌ After Throwing: Exception occurred during method execution.");
    }

    // Around Advice
    @Around("execution(* com.example.springaopdemo.PaymentService.*(..))")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("⏳ Around (Before): Starting method -> " + joinPoint.getSignature());
        Object result = joinPoint.proceed();  // Proceed with the method
        System.out.println("✅ Around (After): Completed method -> " + joinPoint.getSignature());
        return result;
    }
}
