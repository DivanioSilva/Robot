package com.cf;

public class Mail extends Person {
	private String email;

	public Mail(String name, String email) {
		super(name);
		this.email = email;
	}

	@Override
	void mailCheck() {
		System.out.println("checking email...");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Email to "+this.getName()+" - "+this.getEmail()+" sended with success!");
	}

	@Override
	void workOn() {
		System.out.println("Unknow");
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
