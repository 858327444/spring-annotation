package com.atguigu.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * Program Name: spring-annotation
 * Created by yanlp on 2022-03-19
 *
 * @author yanlp
 * @version 1.0
 */
@Aspect
public class LogAspects {

    @Pointcut("execution(public int com.atguigu.aop.MathCalculator.*(..))")
    public void pointCut(){}

    @Before(value = "pointCut()")
    public void logStart(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println(methodName + "运行@Before,参数列表是{"+ Arrays.asList(joinPoint.getArgs())+"}");
    }


    @After(value = "pointCut()")
    public void logEnd(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println(methodName + "运行结束@After");
    }

    @AfterReturning(value = "pointCut()",returning = "result")
    public void logReturn(JoinPoint joinPoint ,Object result) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println(methodName + "运行@AfterReturning,返回结果是:"  + result);
    }

    @AfterThrowing(value = "pointCut()",throwing = "e")
    public void logException(JoinPoint joinPoint,Exception e) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println(methodName + "运行@AfterThrowing,异常是是:"  + e);
    }

}
