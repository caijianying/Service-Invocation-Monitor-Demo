package com.xiaobaicai.infrastructrue.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author caijy
 */
@Aspect
@Component
@Slf4j
public class BizExceptionHandler {

    public BizExceptionHandler() {

    }

    @AfterThrowing(pointcut = "execution(* com.xiaobaicai.*.*(..))", throwing = "ex")
    public void doAfterThrowBiz(JoinPoint joinPoint, Throwable ex) {
        this.writeThrowLog(joinPoint, ex);
    }

    @AfterThrowing(pointcut = "execution(* com.xiaobaicai..*.*(..))", throwing = "ex")
    public void doAfterThrowWeb(JoinPoint joinPoint, Throwable ex) {
        this.writeThrowLog(joinPoint, ex);
    }

    @Around("execution(* com.xiaobaicai..*.*(..)))")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        Object result = null;
        try {
            result = point.proceed();
        } catch (Exception ex) {
            log.error(ex.getMessage());
        }
        return result;
    }

    private void writeThrowLog(JoinPoint joinPoint, Throwable ex) {
        String class_name = joinPoint.getTarget().getClass().getName();
        String method_name = joinPoint.getSignature().getName();
        log.error(class_name + "." + method_name, ex);
    }
}