package com.j2htmx.inline.html.standard.text;

import com.j2htmx.inline.html.nodes.NodeCreator;

public class Acronym extends NodeCreator {
	public Acronym() {
		setTag("acronym");
	}
	void setAcronymContent(String content) {
		setContent(content);
	}
}
