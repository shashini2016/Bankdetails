package org.bank;

public class BankInfo extends AxisBank {
	private void saving() {
		System.out.println("savings account that pays interest.");
	}
	private void fixed() {
		System.out.println("A fixed deposit, also known as an FD");
		System.out.println("new line added");
		System.out.println("arun added new line");
		System.out.println("new changes");
		System.out.println("sumathi added");
		System.out.println("gayathri added");
	}
	public static void main(String[] args) {
		BankInfo ba = new BankInfo();
		ba.saving();
		ba.fixed();
		ba.deposit();
	}
}
