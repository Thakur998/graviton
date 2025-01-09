package com.j2htmx.inline.html.standard.table;

import com.j2htmx.inline.html.nodes.NodeCreator;

public class TR extends NodeCreator {
	public TR() {
		setTag("tr");
	}
	void setDTContent(String content) {
		setContent(content);
	}
}