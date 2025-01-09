package com.j2htmx.inline.html.standard.form;


import com.j2htmx.inline.html.nodes.NodeCreator;

import java.util.Arrays;

public class Div extends NodeCreator {

	public Div() {
		setTag("div");
	}

	public Div(NodeCreator... nodes) {
		setTag("div");
		setContent(Arrays.stream(nodes).map(NodeCreator::createPairNode).reduce("", String::concat));
	}

}
