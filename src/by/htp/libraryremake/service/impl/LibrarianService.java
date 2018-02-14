package by.htp.libraryremake.service.impl;
import java.io.IOException;
//import by.htp.library_remake.service;
import java.util.ArrayList;

import by.htp.libraryremake.bean.Library;
import by.htp.libraryremake.bean.Published;
import by.htp.libraryremake.dao.DaoException;
import by.htp.libraryremake.dao.LibraryDao;
import by.htp.libraryremake.dao.impl.LibraryDaoImpl;
import by.htp.libraryremake.service.LibraryActions;



public class LibrarianService implements LibraryActions{
	
	 private static String books_file = "exampleBooks.txt";
	 private static String magazine_file = "exampleMagazines.txt";
	 private static String newspaper_file = "exampleNewspapers.txt";
	
	 
	 
	 public void viewAllLibs() throws LibrarianServiceException, DaoException, IOException{  // pechatet spisok izdaniy
		 
		LibraryDao dao = new LibraryDaoImpl();
		Library library = new Library();
		 try{
		library.printBookFringing();
		dao.readInfo(books_file);
		library.printMagazineFringing();
		dao.readInfo(magazine_file);
		library.printNewspaperFringing();
		dao.readInfo(newspaper_file);
		//try{
		if(LibraryDaoImpl.total1==0){ // esli kolichestvo knig = 0, to srabativaet iskluchenie
			 throw new LibrarianServiceException("No books in the library");
				}
		
		
	
		 if(LibraryDaoImpl.total1==0){//// esli kolichestvo jurnalov = 0, to srabativaet iskluchenie
				throw new LibrarianServiceException("No magazines in the library");
			}
	
		
		if(LibraryDaoImpl.total==0){ // esli kolichestvo gazet = 0, to srabativaet iskluchenie
			 throw new LibrarianServiceException("No newspapers in the library");
			
		 }
		 }
		 
		
		 catch (DaoException e){
			 
					}
		 
		 //finally {
		//	 System.out.println("test");
	            
	     //   }

		 }
		 
			}

	 
			 
				
	 
	 

	