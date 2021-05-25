package cn.wr516.admin;

public class StingTest {
    public static void main(String[] args) {
        String str = "zz";
        String str3 =new String("sb3");
        String str2 =str3;
        run(str2);
        System.out.println(str2 );

    }

    private static void run(String str){
        str = "sb";
    }
}
