package com.j2htmx.inline.controllers;

import com.j2htmx.inline.service.Webpage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.UUID;

@RestController
public class WebpageController {

    Webpage webpage = new Webpage();

    @GetMapping("/home")
    public Flux<String> home() {
        return webpage.createHome(UUID.randomUUID().toString());
    }


}
