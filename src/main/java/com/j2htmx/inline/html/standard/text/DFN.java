package com.j2htmx.inline.html.standard.text;

import com.j2htmx.inline.html.nodes.NodeCreator;

public class DFN extends NodeCreator {
	public DFN() {
		setTag("dfn");
	}
	void setDFNContent(String content) {
		setContent(content);
	}
}
