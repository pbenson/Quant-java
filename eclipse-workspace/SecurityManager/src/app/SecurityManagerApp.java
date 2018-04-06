package app;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import readers.BondFileReader;
import securities.Security;

public class SecurityManagerApp {

	public static void main(String[] args) {
		List<Security> bonds = BondFileReader.getBonds("bonds.txt");
		System.out.println("# bonds read: " + bonds.size());
		Set<Security> uniqueBonds = new HashSet<Security>(bonds);
		System.out.println("# unique bonds: " + uniqueBonds.size());
		System.out.println("Exiting SecurityManagerApp.");
	}

}
