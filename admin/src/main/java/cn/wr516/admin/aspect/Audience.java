package cn.wr516.admin.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {

//    @Before("execution(* cn.wr516.admin.aspect.A.run(..) )")
//    public void slienceCellPhones(JoinPoint joinPoint){
//        System.out.println("关掉手机");
//        Object[] args = joinPoint.getArgs();
//        Signature signature = joinPoint.getSignature();
//        MethodSignature methodSignature = (MethodSignature) signature;
//    }
    /**
     * 选取切入点为自定义注解
     */
    @Pointcut("@annotation(cn.wr516.admin.aspect.Decode)")
    public void decodeValue(){}
    @Before(value = "decodeValue()")
    public void before(JoinPoint joinPoint) throws NoSuchMethodException {
        System.out.println(123);
    }
}
