package by.htp.libraryremake.service;

import java.io.IOException;

import by.htp.libraryremake.bean.Library;
import by.htp.libraryremake.bean.Published;
import by.htp.libraryremake.dao.DaoException;
import by.htp.libraryremake.service.impl.LibrarianServiceException;



public interface LibraryActions {
	
	void viewAllLibs() throws LibrarianServiceException, DaoException, IOException;
	
	
	
}
