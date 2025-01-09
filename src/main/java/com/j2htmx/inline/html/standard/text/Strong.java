package com.j2htmx.inline.html.standard.text;

import com.j2htmx.inline.html.nodes.NodeCreator;

public class Strong extends NodeCreator {
	public Strong() {
		setTag("strong");
	}
	void setStrongContent(String content) {
		setContent(content);
	}
}
