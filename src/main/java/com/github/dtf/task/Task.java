package com.github.dtf.task;

public interface Task {
	enum TaskType {
		JUNIT3, JUNIT4, PYTHON
	}

	public String getName();

	public void setName(String name);

	public TaskType getType();
}
