package com.j2htmx.inline.html.standard.table;

import com.j2htmx.inline.html.nodes.NodeCreator;

import java.util.List;


public class Table extends NodeCreator {
	public Table() {
		setTag("table");
	}
	
	public void setTableContent(String content) {
		setContent(content);
	}
	public void addTable(List<String> headings,List<String> contents) {
		setContent("");
		addHeading(headings);
		addData(contents);
	}
	public void addHeading(List<String> headings) {
		
		TR heads=new TR();
		for(String currentHeading : headings) {
			if(heads.getContent()!=null)
			{
			TH heading=new TH();
			heading.setContent(currentHeading);
			heads.setContent(heads.getContent()+heading.createPairNode());
			}
			else {
				TH heading=new TH();
				heading.setContent(currentHeading);
				heads.setContent(heading.createPairNode());
			}
		}
		setContent(getContent()+heads.createPairNode());
	}

	public void addDataNode(List<NodeCreator> bodyData) {

		TR heads=new TR();
		for(NodeCreator data : bodyData) {
			if(heads.getContent()!=null)
			{
				TD heading=new TD();
				heading.setContent(data.createPairNode());
				heads.setContent(heads.getContent()+heading.createPairNode());
			}
			else {
				TD heading=new TD();
				heading.setContent(data);
				heads.setContent(heading.createPairNode());
			}
		}
		setContent(getContent()+heads.createPairNode());
	}


	public void addData(List<String> bodyData) {
		
		TR heads=new TR();
		for(String data : bodyData) {
			if(heads.getContent()!=null)
			{
			TD heading=new TD();
			heading.setContent(data);
			heads.setContent(heads.getContent()+heading.createPairNode());
			}
			else {
				TD heading=new TD();
				heading.setContent(data);
				heads.setContent(heading.createPairNode());
			}
		}
		setContent(getContent()+heads.createPairNode());
	}

}

