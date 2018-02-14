package by.htp.libraryremake;
import java.io.IOException;
import java.util.Scanner;

import by.htp.libraryremake.bean.Book;
import by.htp.libraryremake.bean.Library;
import by.htp.libraryremake.bean.Magazine;
import by.htp.libraryremake.bean.Newspaper;
import by.htp.libraryremake.dao.DaoException;
import by.htp.libraryremake.dao.LibraryDao;
import by.htp.libraryremake.dao.impl.LibraryDaoImpl;
import by.htp.libraryremake.service.impl.LibrarianService;
import by.htp.libraryremake.service.impl.LibrarianServiceException;

public class Main {
	
	public static void main (String [] args) throws LibrarianServiceException, DaoException, IOException{
		
		LibrarianService librarian = new LibrarianService();
		
		try{
		librarian.viewAllLibs();
		}
		catch (LibrarianServiceException e)
		{
			System.out.println("Exception in the library");
			e.getMessage();
			//e.getCause();
			}
		
		
	}
}
