package com.j2htmx.inline.html.canvas;

import com.j2htmx.inline.html.structure.Brush;
import com.j2htmx.inline.html.nodes.NodeCreator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;

import java.util.Arrays;


public abstract class WebpageHandler extends Brush {
    private static final Logger log = LoggerFactory.getLogger(WebpageHandler.class);
    //Using sink
    Sinks.Many<NodeCreator> nodes = Sinks.many().multicast().onBackpressureBuffer();

    public Flux<String> subscribeToFlux(String clientId) {
        return  nodes.asFlux()
                .doOnNext(node -> log.debug("A node was added by client : {}", clientId))
                .flatMap(this::init)
                .doOnNext(node -> this.nodes.tryEmitComplete())
                .doFinally(emitSignal -> nodes = Sinks.many().multicast().onBackpressureBuffer());

    }

    public void add(NodeCreator... nodeCreatorMulti) {
        Arrays.stream(nodeCreatorMulti).forEach(nodes::tryEmitNext);
    }

    public void add(NodeCreator nodeCreator) {
        nodes.tryEmitNext(nodeCreator);
    }
}
