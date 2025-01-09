package com.j2htmx.inline.html.standard.table;

import com.j2htmx.inline.html.nodes.NodeCreator;

public class TH extends NodeCreator {
	public TH() {
		setTag("th");
	}
	void setDTContent(String content) {
		setContent(content);
	}
}