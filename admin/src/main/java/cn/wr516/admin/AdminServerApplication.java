package cn.wr516.admin;

import cn.hutool.core.date.DateUtil;
import de.codecentric.boot.admin.server.config.EnableAdminServer;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

//@SpringBootApplication
@EnableAdminServer
public class AdminServerApplication {
    public static void main(String[] args) {
        Date date = DateUtil.date();
        System.out.println( DateUtil.year(date));
        System.out.println( DateUtil.month(date));
        System.out.println( DateUtil.dayOfMonth(date));
        BigDecimal a = new BigDecimal(80);
        BigDecimal b = new BigDecimal(100);

        System.out.println(80/100);
        System.out.println(Math.floorDiv(80L,100L));
        System.out.println(BigDecimal.ONE.subtract(a.divide(b)).multiply(new BigDecimal(100)) );


        String requestTime = "2021-04-21 00:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(requestTime, formatter);
        System.out.println(dateTime);
    }
}
