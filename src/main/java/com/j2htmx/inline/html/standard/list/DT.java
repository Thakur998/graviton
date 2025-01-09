package com.j2htmx.inline.html.standard.list;

import com.j2htmx.inline.html.nodes.NodeCreator;

public class DT  extends NodeCreator {
	public DT() {
		setTag("dt");
	}
	void setDTContent(String content) {
		setContent(content);
	}
}
