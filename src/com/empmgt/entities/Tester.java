package com.empmgt.entities;

public class Tester extends Employee {

	private String tools;

	public Tester(int id, String name, Department department, String language) {
		super(id, name, department);
		this.tools = language;
	}

	public void setTools(String tools) {
		this.tools = tools;
	}

	public String getTools() {
		return tools;
	}
}
