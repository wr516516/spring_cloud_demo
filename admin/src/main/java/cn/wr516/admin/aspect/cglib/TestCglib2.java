package cn.wr516.admin.aspect.cglib;

import cn.wr516.admin.aspect.Decode;
import org.springframework.cglib.proxy.Enhancer;
/**
 * 没有实现接口，需要CGlib动态代理的目标类
 *
 * @author zghw
 *
 */
public class TestCglib2 {
    public static void main(String args[]) {
        Enhancer enhancer =new Enhancer();
        enhancer.setSuperclass(Decode.class);
        enhancer.setCallback(new TargetInterceptor());
        Decode targetObject2=(Decode)enhancer.create();

        System.out.println(targetObject2);


    }
}
