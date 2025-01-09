package com.j2htmx.inline.service;

import com.j2htmx.inline.html.canvas.WebpageHandler;
import com.j2htmx.inline.webpage.Home;
import reactor.core.publisher.Flux;

public class Webpage extends WebpageHandler {

    public Flux<String> createHome(String clientId) {
        Home home = new Home();
        add(home);
        return subscribeToFlux(clientId);
    }

}
