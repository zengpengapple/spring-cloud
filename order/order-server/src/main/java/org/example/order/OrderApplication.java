package org.example.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages="org.example")
@ComponentScans(value=@ComponentScan(basePackages="org.example"))
public class OrderApplication 
{
    public static void main( String[] args )
    {
       SpringApplication.run(OrderApplication.class, args);
    }
}
