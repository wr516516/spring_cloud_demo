package cn.wr516.admin.aspect;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class ConcertConfig {
    @Bean
    public Audience audience() {
        return new Audience();
    }
    @Bean(name = "dancer")
    public TargetMethod dancer(){
        return new TargetMethod();
    }
}
