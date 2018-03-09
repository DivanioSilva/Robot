package com.devices;

public abstract class Printer {
	private String factory;
	private String model;

	public Printer() {

	}

	public Printer(String factory, String model) {
		this.factory = factory;
		this.model = model;
	}

	abstract void printPrinterInfo();

	abstract void communicationWay();

	@Override
	public String toString() {
		return String.format("Printer [factory=%s, model=%s]", factory, model);
	}

	public Printer(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getFactory() {
		return factory;
	}

	public void setFactory(String factory) {
		this.factory = factory;
	}

}
