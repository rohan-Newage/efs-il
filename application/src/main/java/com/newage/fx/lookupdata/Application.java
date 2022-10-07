package com.newage.fx.lookupdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


@EnableFeignClients
@EnableAsync
@ComponentScan(basePackages = "com.newage.*")
@SpringBootApplication
public class Application {

    public static void main(String[] args) {


        Date date=new Date();
        DateFormat sdf = new SimpleDateFormat("dd-MMM-YY");
         sdf.format(date);




        SpringApplication.run(Application.class, args);
    }


}
