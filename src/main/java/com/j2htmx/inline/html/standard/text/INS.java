package com.j2htmx.inline.html.standard.text;

import com.j2htmx.inline.html.nodes.NodeCreator;

public class INS extends NodeCreator {
	public INS() {
		setTag("ins");
	}
	void setINSContent(String content) {
		setContent(content);
	}
}
