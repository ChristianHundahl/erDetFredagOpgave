package com.example.demo.Controllers;

import Services.ZellersCongruence;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;

@RestController
public class HelloController {
    String url = firstMapping().toString();

    @GetMapping("/first-mapping")
    public String firstMapping(){
        return "<b>Hello World, nice to meet you!<b>" +
                "\n<p>You are at the first page<p>";
    }

    @GetMapping("/second-mapping")
    public String secondMapping(){
        return "<p>This is a String<p>";
    }

    @GetMapping("/index")
    public String index(){
        return "Welcome to the index";
    }

    @GetMapping("/dayOfTheWeek")
    public String dayOfTheWeek() throws MalformedURLException {
        ZellersCongruence hej = new ZellersCongruence();
        return "" + hej.ZellersCongruence();
    }

    //Få data fra bruger til server:
    @GetMapping("/parameter") //localhost8080 + /parameter?param=input
    public String paramter(@RequestParam String param){ //indikerer næste paramter = request parameter
        return "<b>" + param + "<\b>" + "\n :-)";//Mmethod 'paramter' gets input form user in form of request sent
    }
}