package com.assignment.abstractart;

import java.util.ArrayList;

public class Museum {

	public static void main(String[] args) {
		
		ArrayList<Art> museum = new ArrayList<Art>();
		
		museum.add(new Painting("The Boating Party", "Mary Cassatt", "woman, man, and child on small sailboat", "oil on canvas"));
		museum.add(new Painting("The Boating Party", "Mary Cassatt", "woman, man, and child on small sailboat", "oil on canvas"));
		museum.add(new Painting("The Boating Party", "Mary Cassatt", "woman, man, and child on small sailboat", "oil on canvas"));

		museum.add(new Sculpture("The Boating Party", "Mary Cassatt", "woman, man, and child on small sailboat", "oil on canvas"));
		museum.add(new Sculpture("The Boating Party", "Mary Cassatt", "woman, man, and child on small sailboat", "oil on canvas"));

		for(Art art : museum) {
			art.viewArt();
		}
	}

}
