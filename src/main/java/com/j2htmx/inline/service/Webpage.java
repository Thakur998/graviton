package com.j2htmx.inline.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.j2htmx.inline.html.canvas.WebpageHandler;
import com.j2htmx.inline.repository.GridRepo;
import com.j2htmx.inline.webpage.Home;
import reactor.core.publisher.Flux;

public class Webpage extends WebpageHandler {

    GridRepo gridRepo = new GridRepo();

    public Flux<String> createHome(String clientId) {
        Home home = new Home();
        add(home);
        return subscribeToFlux(clientId);
    }

    public Flux<String> createGrid() throws JsonProcessingException {
        return Flux.just(gridRepo.getLatestBoard());
    }

    public Flux<String> toggleCell(String clientId) throws JsonProcessingException {
        return Flux.just(gridRepo.toggleCell(clientId));
    }

    public Flux<String> breakpoint() {
        return Flux.just(gridRepo.breakpoint());
    }
}
