package com.j2htmx.inline.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.j2htmx.inline.service.Webpage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/refresh")
    public Flux<String> refresh() throws JsonProcessingException {
        return webpage.createGrid();
    }

    @GetMapping("/toggle")
    public Flux<String> toggle(@RequestParam("client-id") String clientId) throws JsonProcessingException {
       // System.out.println(clientId);
        return webpage.toggleCell(clientId);
    }

    @GetMapping("/breakpoint")
    public Flux<String> toggle() {
        return webpage.breakpoint();
    }

}
