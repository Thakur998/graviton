package com.j2htmx.inline.html.standard.text;

import com.j2htmx.inline.html.nodes.NodeCreator;

public class Blockquote extends NodeCreator {
	public Blockquote() {
		setTag("blockquote");
	}
	void setBlockQuoteContent(String blockquote) {
		setContent(blockquote);
	}
}
