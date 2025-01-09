package com.j2htmx.inline.html.canvas;


import com.j2htmx.inline.html.nodes.NodeCreator;
import reactor.core.publisher.Mono;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public abstract class WireFrame {

    protected String cssStyleSheet = getCssStyleSheet();
    protected String jsScript = getJsScript();

    protected Mono<String> page = Mono.empty();
    protected static String title;
    protected HashMap<Object, String> registry = new HashMap<>();
    protected String head =
            "<head><script src=\"https://unpkg.com/htmx.org@2.0.3\"></script>" +
                    "<script>" +
                     jsScript +
                    "</script>" +
                     cssStyleSheet +
             "<link href=\"https://fonts.googleapis.com/css2?family=Inter:wght@400;700&display=swap\" rel=\"stylesheet\">\n" +
            "</head>";
    public Mono<String> init(NodeCreator nodeCreator) {
      page = Mono.just(registry.getOrDefault(nodeCreator.getClientId(), head.concat(nodeCreator.createPairNode())));
      return page;
    }

    private String getCssStyleSheet() {
        try(BufferedReader br = new BufferedReader(new FileReader("styles.css"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            if (sb.toString().trim().startsWith("<link")) {
                return sb.toString();
            } else {
                return  "<style>" + sb.toString() + "</style>";
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String getJsScript() {
        try(BufferedReader br = new BufferedReader(new FileReader("script.js"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
                return sb.toString();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
