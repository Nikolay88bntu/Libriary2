package by.htp.libraryremake.bean;

public class Magazine extends Published {
		
		
		public Magazine(String title, String author, int year, int issue,
				 String publAgency) {
			
			super(title, author, year, issue, publAgency);
			//this.author = "redactor";
			
		}

		
	
		public String printMagazine(){
				
				return getTitle() + ", " + getPublAgency() + " ," + getYear() + "," + issue;
			}
	}


