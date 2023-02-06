package ru.pda.springjdbc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.pda.springjdbc.service.AppService;

import java.util.List;

@RestController
public class AppController {
    AppService service;

    public AppController(AppService service) {
        this.service = service;
    }

    @GetMapping("/customer")
    @ResponseBody
    public List<String> getProductName(@RequestParam(value = "name", defaultValue = "alexey")  String customerName){
        return service.getProductName(customerName);
    }
}
