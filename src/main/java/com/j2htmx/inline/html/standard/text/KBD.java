package com.j2htmx.inline.html.standard.text;

import com.j2htmx.inline.html.nodes.NodeCreator;

public class KBD extends NodeCreator {
	public KBD() {
		setTag("ins");
	}
	void setKBDContent(String content) {
		setContent(content);
	}
}
