package com.j2htmx.inline.webpage;

import com.j2htmx.inline.html.nodes.NodeCreator;
import com.j2htmx.inline.html.standard.form.Button;
import com.j2htmx.inline.html.standard.form.Div;

import java.util.UUID;

public class Home extends NodeCreator {

    public Home() {
        setTag("div");
        setId("parent-div");
        setClass("container");
        Button button = new Button("Breakpoint", UUID.randomUUID().toString());
        button.setHxGet("/breakpoint");
        button.setHxTarget("#breakpoint");
        button.setId("breakpoint");
        setContent(dashboard().concat(button.createPairNode()));

    }

    private String dashboard() {
        Div div = new Div();
        div.setId("dashboard");
        div.setHxTrigger("'every .6s'");
        div.setHxGet("/refresh");
        return div.createPairNode();
    }

}
