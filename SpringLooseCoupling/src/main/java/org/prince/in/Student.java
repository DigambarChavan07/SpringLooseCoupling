package org.prince.in;

public class Student {

	private Cheat cheat;

	public Student() {
		System.out.println("Student Constructor is created........");
	}

	public void setCheat(Cheat cheat) {
		System.out.println("Student setCheat method called...");
		this.cheat = cheat;
	}

	@Override
	public String toString() {
		return "Student [cheat=" + cheat + "]";
	}

}
