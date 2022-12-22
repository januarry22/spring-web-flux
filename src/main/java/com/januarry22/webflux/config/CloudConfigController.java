package com.januarry22.webflux.config;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Stream;

@RestController
public class CloudConfigController {

    private final ConfigProperties configProperties;

    @GetMapping("/config")
    public ResponseEntity<String> config() {
        System.out.println(configProperties);
        return ResponseEntity.ok(configProperties.toString());
    }
}