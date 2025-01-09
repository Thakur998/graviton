package com.j2htmx.inline.html.standard.list;

import com.j2htmx.inline.html.nodes.NodeCreator;

public class ListItem extends NodeCreator {
	public ListItem() {
		setTag("li");
	}
	void setListItemContent(String content) {
		setContent(content);
	}
}
