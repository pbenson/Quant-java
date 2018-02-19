//Note that the first line of a .java file is usually
//a declaration of which package the file belongs to. 
//Here, we have used the default package, and so omitted
//a declaration. In real programs, that frowned upon:
//you should put every file in a package.

//Also note that every class has its own file, and every .java
//file corresponds to a class. i.e. it is a 1-1 relationship
//between classes and files.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HackerRankStdinStdoutPractice {

	public static void main(String[] args) throws FileNotFoundException {
//		Scanner scanner = new Scanner(System.in); (used in all HackerRank problems)
		Scanner scanner = new Scanner(new File("myFile.txt"));
		String myString = scanner.next();
		int myInt = scanner.nextInt();
		scanner.close();

		System.out.println("myString is: " + myString);
		System.out.println("myInt is: " + myInt);
	}

}
