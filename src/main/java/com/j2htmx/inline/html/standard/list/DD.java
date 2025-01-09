package com.j2htmx.inline.html.standard.list;

import com.j2htmx.inline.html.nodes.NodeCreator;

public class DD extends NodeCreator {
	public DD() {
		setTag("dd");
	}
	void setDTContent(String content) {
		setContent(content);
	}
}
