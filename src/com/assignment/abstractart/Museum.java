package com.assignment.abstractart;
import java.util.ArrayList;

public class Museum {
	public ArrayList<Art> Museum;
	
	public Museum() {
		this.Museum = new ArrayList<Art>();
	}

	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub
		ArrayList<Art> museum1 = new ArrayList<Art>();
		Painting painting1 = new Painting("Abstract Painting");
		museum1.add(painting1);
		Painting painting2 = new Painting("Monochrome Painting");
		museum1.add(painting2);
		Painting painting3 = new Painting("Colorful Painting");
		museum1.add(painting3);
		painting1.viewArt();
		painting2.viewArt();
		painting3.viewArt();
		Sculpture sculpture1 = new Sculpture("Athena Sculpture");
		museum1.add(sculpture1);
		Sculpture sculpture2 = new Sculpture("Aphrodite Sculpture");
		museum1.add(sculpture2);
		sculpture1.viewArt();
		sculpture2.viewArt();
		System.out.println("#######What's inside the museum#########");
		for(int art = 0; art < museum1.size(); art++) {
			System.out.println(museum1.get(art));
		}

	}

}
