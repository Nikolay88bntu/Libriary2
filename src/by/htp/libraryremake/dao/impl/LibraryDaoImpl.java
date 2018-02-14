package by.htp.libraryremake.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;


import by.htp.libraryremake.dao.DaoException;
import by.htp.libraryremake.dao.LibraryDao;


public class LibraryDaoImpl implements LibraryDao {
	String line;
	//public static int count = 0; // kolichestvo knig
	public static int total = 0;
	public static int total1 = 0;
	@Override
	public void readInfo(String path) throws DaoException, FileNotFoundException {
		int count = 0;
		try {
			
			//book.toString();
			BufferedReader br = new BufferedReader(
					new InputStreamReader(
							new FileInputStream(new File(path))));
			
			while((line = br.readLine())!= null){
				count++;
				System.out.println(line);
			}
			System.out.println("There are " +count+ " items.");
			total = total+count;// // kolichestvo vseh pechatnih izdaniy
			total1=count; // kolichestvo pechatnih izdaniy odnogo tipa
			
		} 
		
		catch (FileNotFoundException e) {
			throw new DaoException("Wrong file path",e);
			
		}
		catch (IOException e) {
			throw new DaoException("File cannot be read");
			
		}
	
		try { 
			if(total == 0){ // esli biblioteka sovsem pustaya  - generiruem exception
				throw new DaoException("It can't be true!!! Total = 0 !!!");	
		}
			
			}
		catch (DaoException e) {
			System.out.println("All books, magazines and newspapers are given out.");
			
		}
		System.out.println("Total amount of items in the library: " +total);
	}
}
