package com.j2htmx.inline.html.standard.text;

import com.j2htmx.inline.html.nodes.NodeCreator;

public class BR  extends NodeCreator {
	public BR() {
		setTag("br");
	}
	void setINSContent(String content) {
		setContent(content);
	}
}