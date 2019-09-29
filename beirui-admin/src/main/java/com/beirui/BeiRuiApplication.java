package com.beirui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author beirui
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class BeiRuiApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(BeiRuiApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  贝瑞启动成功   ლ(´ڡ`ლ)ﾞ");
    }
}