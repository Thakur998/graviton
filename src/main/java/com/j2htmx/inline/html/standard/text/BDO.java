package com.j2htmx.inline.html.standard.text;

import com.j2htmx.inline.html.nodes.NodeCreator;

public class BDO extends NodeCreator {
	public BDO() {
		setTag("bdo");
	}
	void setBDOContent(String content) {
		setContent(content);
	}
}
