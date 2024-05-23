package staticMember.util;

public class CurrencyConvert {
    
    public static double convert(double price, double quantity) {
        return quantity * price * 1.06; //1.06 is 6% of IOF
    }
}
