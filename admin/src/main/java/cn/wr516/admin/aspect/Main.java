package cn.wr516.admin.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Henvealf on 2016/8/27.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("cn.wr516.admin");
        TargetMethod per = (TargetMethod) context.getBean("dancer");
        per.run("dsa");

    }
}

