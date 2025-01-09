package com.j2htmx.inline.html.standard.text;

import com.j2htmx.inline.html.nodes.NodeCreator;

public class EM extends NodeCreator {
	public EM() {
		setTag("em");
	
	}
	void setEMContent(String content) {
		setContent(content);
	}
}
