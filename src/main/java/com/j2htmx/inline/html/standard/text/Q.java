package com.j2htmx.inline.html.standard.text;

import com.j2htmx.inline.html.nodes.NodeCreator;

public class Q extends NodeCreator {
	public Q() {
		setTag("q");
	}
	void setQContent(String content) {
		setContent(content);
	}

}
