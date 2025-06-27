package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* demo.ShoppingCart.checkout(..))")
    public void beforelogger(JoinPoint jp) {

        System.out.println(jp.getSignature());
        String arg=jp.getArgs()[0].toString();
        System.out.println("before loggers with arguments: "+arg);
    }
    @After("execution(* demo.ShoppingCart.checkout(..))")
    public void afterLoggger(){
        System.out.println("after logger");
    }
    @Pointcut("execution(* demo.ShoppingCart.quantity(..))")
    public void afterReturningPointCut(){

    }

    @AfterReturning(pointcut = "afterReturningPointCut()",returning = "retVal")
    public void afterReturning(String retVal){
        System.out.println("After returning : "+retVal);
    }
}
