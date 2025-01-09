package com.j2htmx.inline.html.standard.form;

import com.j2htmx.inline.html.nodes.NodeCreatorForm;

import java.util.List;

public class DataList extends NodeCreatorForm {
	public DataList(){
		setTag("datalist");
	}
	public void add(String option) {
		Option ops=new Option();
		setContent(getContent()+ops.createPairNode());
	}
	public void addAll(List<String> options) {
		for(String option : options) {
			add(option);
		}
	}
}
