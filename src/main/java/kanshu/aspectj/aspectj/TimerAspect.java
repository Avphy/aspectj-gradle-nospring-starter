package kanshu.aspectj.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TimerAspect {

    @Pointcut("execution(@kanshu.aspectj.annotation.Timer * *(..))")
    public void processTimer(){}

    @Around("processTimer()")
    public Object timeLogger(ProceedingJoinPoint thisJoinPoint) throws Throwable{
        System.out.println("Before " + thisJoinPoint.getSignature());

        String ret = (String) thisJoinPoint.proceed();
        System.out.println("Timer executed : " + ret);

        System.out.println("After " + thisJoinPoint.getSignature());

        return ret;
    }
}
