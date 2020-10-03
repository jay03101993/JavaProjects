package businessLogic;

import java.io.File;

public class DeleteFile {

	public void deleteFile(String FileName) {
		String path = System.getProperty("user.dir") + "//FileDirectory";
		File directory = new File(path);
		File FilePath = new File(path + "/" + FileName.toLowerCase() + ".txt");
		String[] fileList = directory.list();
		if(fileList.length==0){
			System.out.println("Directory is empty, there is no such file as "+FileName.toLowerCase()+".txt");
		}
		else if (FilePath.delete()) {
			System.out.println("Deleted the file: " + FilePath.getName());
		} else {
			System.out.println("Failed to delete the file. File named "+FileName.toLowerCase()+".txt not found.");
		}
	}
}
