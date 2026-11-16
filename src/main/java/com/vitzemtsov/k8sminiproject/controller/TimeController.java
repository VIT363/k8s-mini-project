package com.vitzemtsov.k8sminiproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Slf4j
@RestController
@RequestMapping("/api")
public class TimeController {

    @GetMapping("/time")
    public String getTime() {
        log.info("Time requested");
        return "Current time (v2): " + LocalDateTime.now();
    }
}
