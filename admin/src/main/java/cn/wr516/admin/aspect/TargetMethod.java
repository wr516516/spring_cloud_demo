package cn.wr516.admin.aspect;

public class TargetMethod{
    @Decode
    public void run(String str) {
        System.out.println(str);
        System.out.println("1");
    }
}
