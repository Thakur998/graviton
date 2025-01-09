package com.j2htmx.inline.html.standard.text;

import com.j2htmx.inline.html.nodes.NodeCreator;

public class SAMP extends NodeCreator {
	public SAMP() {
		setTag("samp");
	}
	void setSAMPContent(String content) {
		setContent(content);
	}
}
