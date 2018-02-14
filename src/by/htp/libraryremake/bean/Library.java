package by.htp.libraryremake.bean;

import  java.util.ArrayList;

public class Library {
	private ArrayList<Published> listPublished = new ArrayList<Published>();  // spisok pechatnih izdaniy
		
	public Library(){
		
	}
	
	
	public ArrayList<Published> getListPublished(){
		return listPublished;
	}
	public void printBookFringing(){
		System.out.println("The list of library contents:");
		System.out.println("Books:");	
	}
	public void printMagazineFringing(){
		System.out.println();
		System.out.println("Magazines:");
	}
	public void printNewspaperFringing(){
		System.out.println();
		System.out.println("Nespapers:");
}
	
}