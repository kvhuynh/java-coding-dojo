package com.assignment.abstractart;

public class Sculpture extends Art {
	private String material;
	
	public Sculpture(String title, String author, String description, String material) {
		super(title, author, description);
		this.material = material;
	}
	
	public void viewArt() {
		String result = "";
		result += "Title:       " + getTitle() + "\n";
		result += "Author:      " + getAuthor() + "\n";
		result += "Description: " + getDescription() + "\n";
		result += "Material:   " + material + "\n";
		System.out.println(result);
	}
	
	// Getter
	public String getMaterial() {
		return this.material;
	}
	
	// Setter
	public void setMaterial(String material) {
		this.material = material;
	}
	
}
