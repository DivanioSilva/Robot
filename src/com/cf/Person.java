package com.cf;

public abstract class Person {
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	abstract void mailCheck();

	abstract void workOn();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
