package com.j2htmx.inline.html.standard.form;

import com.j2htmx.inline.html.nodes.NodeCreatorForm;

public class SubmitButton extends NodeCreatorForm {
	public SubmitButton() {
		setTag("input");
		setType("submit");
	}
	public void setButtonContent(String content) {
		setButtonContent(content);
	}

}
