package com.j2htmx.inline.html.standard.text;

import com.j2htmx.inline.html.nodes.NodeCreator;

public class Code extends NodeCreator {
	public Code() {
		setTag("code");
	}
	void setCodeContent(String content) {
		setContent(content);
	}

}
