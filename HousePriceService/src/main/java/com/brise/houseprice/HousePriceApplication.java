package com.brise.houseprice;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@Log4j2
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class HousePriceApplication {
    public static void main(String[] args) {
        log.info("================ initialized start ================");
        SpringApplication.run(HousePriceApplication.class, args);
        log.info("================ initialized finish ================");
    }
}
