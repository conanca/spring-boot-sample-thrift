package com.xinhuanet.crawler;

import com.xinhuanet.crawler.example.calculator.TCalculatorService;
import com.xinhuanet.crawler.example.calculator.handler.CalculatorServiceHandler;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.server.TServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.servlet.Servlet;

@SpringBootApplication
public class Application  {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }

    @Bean
    public TProtocolFactory dispatcherServlet() {
        //We will use binary protocol, but it's possible to use JSON and few others as well
        return new TBinaryProtocol.Factory();
    }

    @Bean
    public Servlet calculator(TProtocolFactory protocolFactory, CalculatorServiceHandler handler) {
        return new TServlet(new TCalculatorService.Processor<CalculatorServiceHandler>(handler), protocolFactory);
    }
}
