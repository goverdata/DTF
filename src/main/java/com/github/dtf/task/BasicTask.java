package com.github.dtf.task;

public abstract class BasicTask {
	/**
	 * the name of the test case
	 */
	private String _name;

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		this._name = name;
	}
}
