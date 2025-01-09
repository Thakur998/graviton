package com.j2htmx.inline.html.standard.text;

import com.j2htmx.inline.html.nodes.NodeCreator;

public class Var extends NodeCreator {
	public Var() {
		setTag("var");
	}
	void setVARContent(String content) {
		setContent(content);
	}
}	
