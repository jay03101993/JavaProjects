package Logic;

import java.io.File;

public class ListOfAvailableFiles {
	
	public void showAllAvailableFiles() throws Exception {
		
		String path = System.getProperty("user.dir")+"//FileDirectory";
		File directory = new File(path);
		String[] fileList = directory.list();
		if (fileList == null)
			System.out.println("No files are present currently");
			for (String filename : fileList) {
	            System.out.println(filename);
		}
			
	}


}