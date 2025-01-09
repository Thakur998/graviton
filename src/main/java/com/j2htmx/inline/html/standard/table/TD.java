package com.j2htmx.inline.html.standard.table;

import com.j2htmx.inline.html.nodes.NodeCreator;

public class TD extends NodeCreator {
	public TD() {
		setTag("td");
	}
	void setDTContent(String content) {
		setContent(content);
	}
}