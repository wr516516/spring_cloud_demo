package cn.wr516.admin.aspect.cglib;

import cn.wr516.admin.aspect.Decode;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.CallbackFilter;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.NoOp;

public class TestCglib {
    public static void main(String args[]) {
        Enhancer enhancer =new Enhancer();
        enhancer.setSuperclass(Decode.class);
        CallbackFilter callbackFilter = new TargetMethodCallbackFilter();

        /**
         * (1)callback1：方法拦截器
           (2)NoOp.INSTANCE：这个NoOp表示no operator，即什么操作也不做，代理类直接调用被代理的方法不进行拦截。
           (3)FixedValue：表示锁定方法返回值，无论被代理类的方法返回什么值，回调方法都返回固定值。
         */
        Callback noopCb= NoOp.INSTANCE;
        Callback callback1=new TargetInterceptor();
//        Callback fixedValue=new TargetResultFixed();
//        Callback[] cbarray=new Callback[]{callback1,noopCb,fixedValue};
        //enhancer.setCallback(new TargetInterceptor());
//        enhancer.setCallbacks(cbarray);
        enhancer.setCallbackFilter(callbackFilter);
        Decode targetObject2=(Decode)enhancer.create();
        System.out.println(targetObject2);
//        System.out.println(targetObject2.method1("mmm1"));
//        System.out.println(targetObject2.method2(100));
//        System.out.println(targetObject2.method3(100));
//        System.out.println(targetObject2.method3(200));
    }
}
