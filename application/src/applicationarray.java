public class applicationarray {
 
    public static void main(String[] args) {
 
        double valueOfSupply = Double.parseDouble(args[0]);
        double vatRate = 0.1;
        double expenseRate = 0.3;
        double vat = valueOfSupply * vatRate;
        double total = valueOfSupply + vat;
        double expense = valueOfSupply * expenseRate;
        double income = valueOfSupply - expense;
        double[] rate = new double[3];
        rate[0]=0.5;
        rate[1]=0.3;
        rate[2]=0.3;
        double dividend1 = income * rate[0];
        double dividend2 = income * rate[1];
        double dividend3 = income * rate[2];
 
        System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT : " + vat);
        System.out.println("Total : " + total);
        System.out.println("Expense : " + expense);
        System.out.println("Income : " + income);
        int i = 0;
        
      while(i < rate.length) {
        System.out.println("Dividend" + (i+1) +"  : " + (income * rate[i]));
        i++;
        
      }
    }
 
}