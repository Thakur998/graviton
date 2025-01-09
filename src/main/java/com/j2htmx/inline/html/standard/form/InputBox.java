package com.j2htmx.inline.html.standard.form;

import com.j2htmx.inline.html.nodes.NodeCreatorForm;

public class InputBox extends NodeCreatorForm {
	public InputBox() {
		setTag("input");
		setType("text");
		
	}
	void setInputContent(String content) {
		setContent(content);
	}
}

