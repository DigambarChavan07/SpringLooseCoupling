package org.prince.in;

public class ScienceCheat implements Cheat{

	public ScienceCheat() {
		System.out.println("ScienceCheat Constructor called.......");
	}

	@Override
	public void cheat() {
		System.out.println("ScienceCheat method called....");
	}

	@Override
	public String toString() {
		return "ScienceCheat []";
	}

	
}
