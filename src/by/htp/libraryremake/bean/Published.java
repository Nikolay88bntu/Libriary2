package by.htp.libraryremake.bean;

public class Published {

	private String title;   // nazvanie pechtnogo izdaniya
	private String author;  // avtor
	private int year;  // god izdaniya
	private String publAgency; // nazvanie izdatelstva
	int issue; // nomer vypuska
	String type; // tip pechatnogo izdaniya
	//private int pageCount;  // kolichestvo stranits
	public Published(String title, String author, int year, String publAgency, String type) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.publAgency = publAgency;
		this.type = type;
		
	}
		public Published(String title, String author, int year, int issue, //konstruktor dlya gazaet i jurnalov
				 String publAgency) {
	
		
			this.title = title;
			this.author = author;
			this.year = year;
			this.publAgency = publAgency;
			this.issue = issue;
			
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public int getYear(){
		return year;
	}
	
	public String getPublAgency(){
		return publAgency;
	}
	public String getType(){
		return type;
	}

	@Override
	public String toString(){
		return type;
	}
	public String printPublished(){
		return title + ", " + author + ", "+ issue + ", " + year + ", " + publAgency + type + "" ;
	}
		
}

