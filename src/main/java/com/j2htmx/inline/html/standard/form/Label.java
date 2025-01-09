package com.j2htmx.inline.html.standard.form;


import com.j2htmx.inline.html.nodes.NodeCreator;

public class Label  extends NodeCreator {
	public Label() {
		setTag("label");
	}
	void setLabelContent(String content) {
		setContent(content);
	}
}
