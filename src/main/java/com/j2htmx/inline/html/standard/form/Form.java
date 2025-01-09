package com.j2htmx.inline.html.standard.form;

import com.j2htmx.inline.html.nodes.NodeCreator;

public class Form extends NodeCreator {
	public Form() {
		setTag("form");
	}
	void setLabelContent(String content) {
		setContent(content);
	}
}