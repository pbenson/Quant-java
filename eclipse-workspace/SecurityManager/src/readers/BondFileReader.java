package readers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import securities.Bond;
import securities.Security;

public class BondFileReader {

	public static List<Security> getBonds(String fileName) {
		List<Security> bonds = new ArrayList<Security>();
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
			stream.forEach(line-> {
				String[] fields = line.split(" ");
				String ticker = fields[0];
				LocalDate localDate = LocalDate.parse(fields[1]);
				double coupon = Double.parseDouble(fields[2]);
				Security bond = new Bond(ticker, localDate, coupon);
				bonds.add(bond);
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
		return bonds;
	}

}
