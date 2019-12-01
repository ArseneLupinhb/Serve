package com.wave.serve.depot.depotserve;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wave.serve.depot.depotserve.dao")
public class DepotServeApplication {

    public static void main(String[] args) {
        SpringApplication.run(DepotServeApplication.class, args);
    }

}
