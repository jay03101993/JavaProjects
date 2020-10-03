package fileManagementMainApp;

import userOperations.AllOperations;

public class UserInterface {
	public final void greetingsMessage() {
		System.out.println("********************************************************\r\n"
				+ "Welcome to Cubic File Management System v1.0\r\n" + "@developer : Jayanta Acharjee\r\n"
				+ "********************************************************");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserInterface userInterface = new UserInterface();
		AllOperations allOperations = new AllOperations();
		userInterface.greetingsMessage();
		allOperations.mainMenu();
	}

}
