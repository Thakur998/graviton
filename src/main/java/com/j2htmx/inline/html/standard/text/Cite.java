package com.j2htmx.inline.html.standard.text;

import com.j2htmx.inline.html.nodes.NodeCreator;

public class Cite extends NodeCreator {
	public Cite() {
		setTag("cite");
	}
	void setCiteText(String content) {
		setContent(content);
	}
}
