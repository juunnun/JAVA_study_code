class Acoounting {

    public double valueOfSupply;
    public static double vatRate = 0.1;
    public Acoounting(double valueOfsupply) {
    	this.valueOfSupply = valueOfSupply;
    }
    public double getVAT() {
        return valueOfSupply * vatRate;
    }
    public double getTotal() {
        return valueOfSupply + getVAT();
    }
 
}

public class AccountingApp {
    public static void main(String[] args) {
//    	Acoounting a1 = new Acoounting(10000.0);
//    	Acoounting a2 = new Acoounting(20000.0);
//    	
//    	a1.valueOfSupply = 10000.0;
//       	a2.valueOfSupply = 20000.0;
//         
//    	System.out.println("Value of supply : " + a1.valueOfSupply);
//        System.out.println("VAT : " + a1.getVAT());
//        System.out.println("Total : " + a1.getTotal());
// 
//       	System.out.println("Value of supply : " + a2.valueOfSupply);
//        System.out.println("VAT : " + a2.getVAT());
//        System.out.println("Total : " + a2.getTotal());
    	
    	Rental r1 = new Rental();
    	Movie m1 = new Movie();
    	
    	m1.priceCode = 1;
    	r1.daysRented = 2;
 
 
    	System.out.println(r1.getFrequentRentersPoints());
    }
}
