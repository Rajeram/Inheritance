package org.client;

import org.company.Company;

public class Client extends Company {
	public void clientName() {
		System.out.println("amazon");
	}

	public void clientId() {
		System.out.println("53669");
	}

	public static void main(String[] args) {
		Client c = new Client();
		c.clientId();
		c.clientName();
		c.companyId();
		c.companyName();
		
		

	}

}
