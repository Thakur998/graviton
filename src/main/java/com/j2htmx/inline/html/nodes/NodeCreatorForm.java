package com.j2htmx.inline.html.nodes;

import com.j2htmx.inline.html.custom.processor.CSSLoader;

public class NodeCreatorForm extends CSSLoader {
	String Tag="";
	String content="";
	protected String classStyle = "";
	String layout="";
	String styleID="";
	String style="";
	String href="";
	String type="";
	String placeholder="";
	String label="";
	String name="";
	String id="";
	String value="";
	String action="";
	public String createNode() {
		return "<"+this.Tag+placeholder+id+classStyle+style+type+name+value+action+" />";
	}
	public String createPairNode(){
		return "<"+this.Tag+placeholder+id+classStyle+style+type+name+value+action+" >"+ this.content + "</"+this.Tag+">";
	}
	public void setType(String type) {
		this.type=" type="+type;
	}
	public void setTag(String tag) {
			this.Tag=tag;
	}
	public void setName(String name) {
		this.name=" name="+name;
	}
	public void setId(String name) {
		this.name=" id ="+name;
	}
	public void setContent(String content) {
		this.content=content;
	}
	public void setNodeLink(String href) {
		this.href=href;
	}
	public String getContent() {
		return content;
	}
	public void setPlaceholder(String place) {
		this.placeholder=" placeholder="+place;
		
	}
	public void setClass(String styleClass) {
		this.classStyle=" class='"+styleClass+"' ";
	}
	public void setLabel(String label) {
		this.label=" label="+label;
	}
	public void setValue(String value) {
		this.value=" value="+value;
	}
	public void setAction(String action) {
		this.action=" action="+action;
	}
	public String getValue() {
		return this.value;
	}
	public void setStyle(String styleClass) {
		this.style=" style='"+getProperty(styleClass)+"' ";
	}
	
}
