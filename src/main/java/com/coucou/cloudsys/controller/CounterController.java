package com.coucou.cloudsys.controller;

import com.coucou.cloudsys.pojo.AddTO;
import com.coucou.cloudsys.service.CounterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CounterController {

    private final CounterService counterService;

    public CounterController(CounterService counterService) {
        this.counterService = counterService;
    }

    @PostMapping(value = "/counter")
    public long increment(@RequestBody AddTO val) {
        return counterService.add(val.getVal());
    }

    @GetMapping(value = "/counter")
    public long getValue() {
        return counterService.getValue();
    }
}
