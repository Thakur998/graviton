package com.j2htmx.inline.html.standard.form;


import com.j2htmx.inline.html.nodes.NodeCreator;

public class Legend extends NodeCreator {
	public Legend() {
		setTag("label");
	}
	void setLabelContent(String content) {
		setContent(content);
	}
}
