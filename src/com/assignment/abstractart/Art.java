package com.assignment.abstractart;

public abstract class Art {
	//member variables
	String title;
	String author;
	String description;
	
	//constructor
	public Art(String title){
		this.title = title;
		this.author = "Louie";
		this.description = "Default art by Louie";
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	//abstract methods
	public abstract void viewArt();
	
	
}
