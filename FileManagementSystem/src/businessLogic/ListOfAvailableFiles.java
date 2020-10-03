package businessLogic;

import java.io.File;

public class ListOfAvailableFiles {
	String path = System.getProperty("user.dir") + "\\FileDirectory";
	File directory = new File(path);
	String[] fileList = directory.list();
	
	public void showAllAvailableFiles() throws Exception {
		//boolean present = false;
		if (fileList.length == 0)
			System.out.println("No files are present currently");
		else {
			System.out.println("Available files are : ");
			for (String filename : fileList) {
				System.out.println(filename);
			}

		}
	}

}
