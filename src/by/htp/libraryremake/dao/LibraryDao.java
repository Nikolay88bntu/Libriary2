package by.htp.libraryremake.dao;

import java.io.IOException;

public interface LibraryDao {
	public void readInfo(String path) throws DaoException, IOException;
}
