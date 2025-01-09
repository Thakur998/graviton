package com.j2htmx.inline.html.standard.text;

import com.j2htmx.inline.html.nodes.NodeCreator;

public class PRE extends NodeCreator {
	public PRE() {
		setTag("pre");
	}
	void setPREContent(String content) {
		setContent(content);
	}
}
