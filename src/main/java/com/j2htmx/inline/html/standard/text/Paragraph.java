package com.j2htmx.inline.html.standard.text;

import com.j2htmx.inline.html.nodes.NodeCreator;

public class Paragraph extends NodeCreator {
	public Paragraph() {
		setTag("p");
	}
	void setParagraphContent(String content) {
		setContent(content);
	}
}
