package com.j2htmx.inline.html.standard.text;

import com.j2htmx.inline.html.nodes.NodeCreator;

public class Del  extends NodeCreator {
	public Del() {
		setTag("del");
	}
	void setDelContent(String content) {
		setContent(content);
	}
}
