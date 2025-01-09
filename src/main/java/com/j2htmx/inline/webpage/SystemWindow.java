package com.j2htmx.inline.webpage;

//Example how to create a re-usable html
    /*
    <div class="window">
        <div class="title-bar">
            <button aria-label="Close" class="close"></button>
            <h1 class="title">Window With Stuff</h1>
            <button aria-label="Resize" class="resize"></button>
        </div>
        <div class="separator"></div>
        <div class="window-pane">
            Woo I got stuff in me!
        </div>
    </div>
     */

import com.j2htmx.inline.html.nodes.NodeCreator;
import com.j2htmx.inline.html.standard.form.Button;
import com.j2htmx.inline.html.standard.form.Div;
import com.j2htmx.inline.html.standard.text.Heading;

//Node creator is used to provide html properties to any object
public class SystemWindow extends NodeCreator {
    public SystemWindow(String windowTitle, String windowContent) {
        //we need to set tag of html element first
        setTag("div");

        Div windows = new Div();
        windows.setClass("window");
        Div titleBar = new Div();
        titleBar.setClass("title-bar");
        Button closeButton = new Button( "This will be id we will use to track items in storage");
        closeButton.setClass("close");
        closeButton.setAreaLabel("Close");
        Heading heading = new Heading("h1");
        heading.setContent(windowTitle);
        heading.setClass("title");
        Button resizeButton = new Button( "This will be id we will use to track items in storage");
        resizeButton.setClass("resize");
        resizeButton.setAreaLabel("Resize");
        Div separator = new Div();
        separator.setClass("separator");
        Div windowPane = new Div();
        windowPane.setClass("window-pane");

        //we got all the items... now let's create the html object
        windowPane.setContent(windowContent);
        titleBar.setContent(closeButton,heading,resizeButton);
        windows.setContent(titleBar,separator, windowPane);

        //we will add the parent to node creator in this case it is windows
        setContent(windows);
        //Done
    }
}