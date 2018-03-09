package com.devices;

public class Samsung extends Printer {

	public Samsung() {
		super("Samsung", "S438");
	}
	
	@Override
	void printPrinterInfo() {
		super.toString();

	}

	@Override
	void communicationWay() {
		System.out.println("Via RJ45");

	}

}
