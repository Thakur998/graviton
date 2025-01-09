package com.j2htmx.inline.html.standard.link;

import com.j2htmx.inline.html.nodes.NodeCreator;

public class Link extends NodeCreator {
	public Link() {
		setTag("a");
	}
	public void setLink(String link) {
		setNodeLink(link);
	}
	public void setLinkContent(String content) {
		setContent(content);
	}

}
