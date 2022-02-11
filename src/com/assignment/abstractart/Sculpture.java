package com.assignment.abstractart;

public class Sculpture extends Art {
	String material;
	
	public Sculpture(String title) {
		super(title);
	}
	
	@Override
	public void viewArt() {
		System.out.println("Beautiful Sculpture");

	}

}
