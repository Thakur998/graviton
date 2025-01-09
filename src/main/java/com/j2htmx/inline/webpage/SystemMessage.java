package com.j2htmx.inline.webpage;

import com.j2htmx.inline.html.nodes.NodeCreator;
import com.j2htmx.inline.html.standard.form.Div;
import com.j2htmx.inline.html.standard.text.Heading;
import com.j2htmx.inline.html.standard.text.Paragraph;

/*
<div class="standard-dialog center scale-down" style="width:30rem;">
  <h1 class="dialog-text">The Macintosh Finder, Version 1.0 (18 Jan 84)</h1>
  <p class="dialog-text">&copy; 1984 Apple Computer</p>
</div>
<div class="standard-dialog center scale-down" style=" width:30rem;">
<h1 class="dialog-text">Swords don’t run out of ammo.</h1>
<p class="dialog-text">– Metal Gear Solid 3(Solid Snake being unreasonably practical.)</p>
</div>
 */
public class SystemMessage extends NodeCreator {
    public SystemMessage (String headingText, String message) {
    //Step 1) creating required tags
        Heading heading = new Heading("h1");
        Paragraph paragraph = new Paragraph();
    //Step 2 applying required class and style
        setClass("standard-dialog center scale-down");
        setStyle("rem-wid-30-style");
        setTag("div");

        heading.setClass("dialog-text");
        paragraph.setClass("dialog-text");
    //Step 3 filling out data
        heading.setContent(headingText);
        paragraph.setContent(message);
    //finalizing
        setContent(heading,paragraph);

    }
}
