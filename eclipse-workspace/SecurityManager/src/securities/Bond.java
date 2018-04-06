package securities;

import java.time.LocalDate;
import java.util.Objects;

public class Bond implements Security {
	private final String ticker;
	private final LocalDate maturity;
	private final double coupon;
	public Bond(String ticker_, LocalDate maturity_, double coupon_) {
		ticker = ticker_;
		maturity = maturity_;
		coupon = coupon_;
	}
	
    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof Bond)) {
            return false;
        }
        Bond bond = (Bond) o;
        return coupon == bond.coupon &&
                Objects.equals(ticker, bond.ticker) &&
                Objects.equals(maturity, bond.maturity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticker, maturity, coupon);
    }

	public String toString() {
		return "Bond(" + ticker + ',' + maturity + ',' + coupon + ')';
	}
}
