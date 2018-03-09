import java.io.*;
import java.util.*;

public class Solution {
	// We don't have to make Scanner a static,
	// but it is instructive (see HackerRank problem on
	// static initializers)
	static Scanner scan;//static vars are associated with the class
	static {
		//static blocks are run once, when the class is first loaded
		// in this case, scan will be closed by the JVM when 
		// program exits
		//scan = new Scanner(System.in);//For HackerRank
		try {
			scan = new Scanner(new File("input.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. 
         * Print output to STDOUT. Your class should be named Solution. */
    		int numItemsInList = scan.nextInt();
    		scan.nextLine();//we do this because nextInt doesn't advance to next line
    		List<Integer> myList = new ArrayList<Integer>();
    		for(int i = 0; i < numItemsInList; ++i) {
    			int value = scan.nextInt();
    			myList.add(value);
    		}
    		scan.nextLine();
    		int numQueries = scan.nextInt();
    		for(int i = 0; i < numQueries; ++i) {
        		scan.nextLine();
    			String command = scan.nextLine();
    			int index = scan.nextInt();
    			if(command.equals("Insert")) {
    				myList.add(index, scan.nextInt());
    			} else {
    				// must be Delete
    				myList.remove(index);
    			}
    		}
    		//System.out.println(myList);
    		for(Integer item : myList) {
    			System.out.print(item + " ");
    		}
    }
}