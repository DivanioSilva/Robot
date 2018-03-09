package com.devices;

public class HP extends Printer {

	public HP() {
		super("HP", "HP483");
	}

	@Override
	void communicationWay() {
		System.out.println("Via Wifi");

	}

	@Override
	void printPrinterInfo() {
		super.toString();
	}
}
