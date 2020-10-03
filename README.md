Cubic File Management System Console Based App


Project Specification Document
Cubic File Management System v1.0
Developer: Jayanta Acharjee

Overview:
Cubic File Management System is a prototype of a console application that enables the user to perform multiple file operations. It is easy to use with a very simple but useful interface.
Generic features and operations:
•	Retrieving the file names in an ascending order
•	Business-level operations:
•	Option to add a user specified file to the application
•	Option to delete a user specified file from the application
•	Option to search a user specified file from the application
•	Navigation option to close the current execution context and return to the main context
•	Option to close the application

	The project is configured to perform its operations with three layers:
a.	Business Logic Layer:
Class files in Business logic layer specifies the logic and methods to perform operations i.e File Create, Delete, Search, List all available files etc.
b.	User Operations Layer:
This layer specifies the operations need to be performed on the basis of user input. Users can enter input of their choice and this layer takes care of all the operations to be executed.
c.	User Interface Layer:
This layer provides the very basic interface to the user of this console app. In launching the app, this interface greets the user and displays App & developer details followed by Main Menu, Sub Menu options.




Details of Code base and running the app:
The Project code base looks like:
 

Project: FileManagementSystem
Packages:
a.	businessLogic
classes:
I.	AddNewFile
II.	DeleteFile
III.	ListOfAvailableFiles
IV.	SearchForFile
b.	userOperations
classes:
I.	AllOperations
c.	fileManagementMainApp
classes:
I.	UserInterface

	Root directory: FileDirectory


	Launch UserInterface.java class to run the console app.
Project output on user operation:
a.	Welcome Screen and Main Menu:
********************************************************
Welcome to Cubic File Management System v1.0
@developer: Jayanta Acharjee
********************************************************
Enter 'Y' to see file operations menu
Enter 'N' to exit from the app

b.	Sub Menu and File Operations:
Enter 'Y' to see file operations menu
Enter 'N' to exit from the app
Y
********************************************************
Enter 1 to view all available files
Enter 2 to add a file
Enter 3 to delete a file
Enter 4 to search a file
Enter 5 to exit from file operation
c.	To view available files
********************************************************
Enter 1 to view all available files
Enter 2 to add a file
Enter 3 to delete a file
Enter 4 to search a file
Enter 5 to exit from file operation
1
Available files are:
fight.txt
fighter.txt
fighter1.txt
fighter2.txt
fighter3.txt
d.	To add new file
********************************************************
Enter 1 to view all available files
Enter 2 to add a file
Enter 3 to delete a file
Enter 4 to search a file
Enter 5 to exit from file operation
2
**Note : a. As of now any text, special character or even speces are allowed as file name.
Somehow it will be restricted in later updates of the app
b. File names are of lower cases, for example if you added Demo.txt it will be maintained as demo.txt
Enter the file name that you want to create :
demo
File demo.txt created successfully !!
  

e.	To delete a file
Enter 1 to view all available files
Enter 2 to add a file
Enter 3 to delete a file
Enter 4 to search a file
Enter 5 to exit from file operation
3
Enter the file name you want to delete : 
demo
Deleted the file: demo.txt
********************************************************
Enter 1 to view all available files
Enter 2 to add a file
Enter 3 to delete a file
Enter 4 to search a file
Enter 5 to exit from file operation
1
Available files are : 
fight.txt
fighter.txt
fighter1.txt
fighter2.txt
fighter3.txt
f.	To search a file
Enter 1 to view all available files
Enter 2 to add a file
Enter 3 to delete a file
Enter 4 to search a file
Enter 5 to exit from file operation
4
Enter the file name you want to search : 
fight
Found 5 results 
Matched Files are : 
fight.txt
fighter.txt
fighter1.txt
fighter2.txt
fighter3.txt
g.	Exit file Operations
********************************************************
Enter 1 to view all available files
Enter 2 to add a file
Enter 3 to delete a file
Enter 4 to search a file
Enter 5 to exit from file operation
5
Exiting file operations. Navigating Main Menu
Enter 'Y' to see file operations menu
Enter 'N' to exit from the app







h.	Exit App
Enter 'Y' to see file operations menu
Enter 'N' to exit from the app
N
   Bye Bye !!



Java Concepts Used:
1.	Core java Project package  class hierarchy
2.	Java File operations
3.	Error Handling: Throws, try-catch
4.	Looping: if-else, nested.
5.	Switch cases
6.	Scanner class for user input
	Data Structure 
a)	Collections: List, ArrayList
b)	Arrays.
c)	Sorting.
d)	Searching.





