package com.assignment.abstractart;

public class Painting extends Art {
	//member variables
	String paintType;
	
	public Painting(String title) {
		super(title);
	}

	@Override
	public void viewArt() {
		System.out.println("Beautiful painting");

	}

}
