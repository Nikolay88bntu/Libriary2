package by.htp.libraryremake.bean;

public class Book extends Published {
	
	private int pageCount;  // kolichestvo stranits
	
	public Book(String title, String author, int year,
			int pageCount, String publAgency, String type) {
		
		super(title, author, year, publAgency, type);
		this.pageCount = pageCount;
	}
	public void setPageCount(int pageCount){

		this.pageCount = pageCount;

		}

		public int getPageCount(){

		return pageCount;

		}
}
