package com.j2htmx.inline.html.standard.link;

import com.j2htmx.inline.html.nodes.NodeCreator;

public class Image extends NodeCreator {
	public Image() {
		setTag("img");
	}
	public void setImage(String link) {
		setNodeLink(link);
	}
}
