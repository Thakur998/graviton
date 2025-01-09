package com.j2htmx.inline.html.structure;


import com.j2htmx.inline.html.canvas.WireFrame;

//Common data for every client
public abstract class Brush extends WireFrame {

    public static void setPageTitle(String newTitle) {
        title = newTitle;
    }

}
