package com.j2htmx.inline.html.standard.form;

import com.j2htmx.inline.html.nodes.NodeCreatorForm;

import java.util.List;

public class Select extends NodeCreatorForm {
	public Select() {
		setTag("select");
	}
	public void add(String option) {
		Option newOption=new Option();
		newOption.setValue(option);
		newOption.setContent(option);
		setContent(getContent()+newOption.createPairNode());
	}
	public void addAll(List<String> options) {
		for(String option : options) {
			add(option);
		}
	}
	public void makeMultiple(int size) {
		setValue(getValue()+" multiple size="+size+" ");
	}
}
