package com.j2htmx.inline.webpage;

import com.j2htmx.inline.html.nodes.NodeCreator;

public class Home extends NodeCreator {

    public Home() {
        setTag("div");
        setId("parent-div");
        setClass("container");

        SystemWindow systemWindow =
                new SystemWindow("App-Store", getApps().createPairNode());

        setContent(systemWindow);

    }

    private NodeCreator getApps() {
        return new SystemMessage("Meow", "Meow Meow Meow Meow ");
    }



}
