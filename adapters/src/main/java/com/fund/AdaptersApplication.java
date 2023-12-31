package com.fund;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * 启动类
 * <p>
 * Create at 2023/07/20 17:46
 *
 * @author c0ra1
 * @version 1.0.0, 2023/07/20
 * @since 1.0.0
 */
@SpringBootApplication
@EnableTransactionManagement
@EnableWebMvc
public class AdaptersApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdaptersApplication.class, args);
    }

}
