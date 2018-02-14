package by.htp.libraryremake.bean;

public class Newspaper extends Published {
	
	
	
	
	public Newspaper(String title, String author, int year, int issue,
			 String publAgency) {
		
		super(title, author, year, issue, publAgency);
		
	}
	
		public String printNewspaper(){
			
			return getTitle() + ", " + getPublAgency() + " ," + getYear() + "," + issue;
		}
}

