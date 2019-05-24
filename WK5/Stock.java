// David W. Clendenning Jr. - CSC 164 - 450 - 10/13/2018 - HW 9.2
package WK5;

public class Stock {
	private String symbol;                 
	private String name;                   
	private double previousClosingPrice;	 
	private double currentPrice;				 
	
	Stock(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}

	double getChangePercent() {
		return (((currentPrice - previousClosingPrice) / previousClosingPrice) * 100);
	}
	
	public static void main(String[] args) {
		Stock stock = new Stock("ORCL", "Oracle Corporation");
		stock.previousClosingPrice = 34.5;
		stock.currentPrice = 34.35;

		System.out.println("name: " + stock.name);
		System.out.println("symbol: " + stock.symbol);
		System.out.printf("Price-change percentage: %.2f%%\n", stock.getChangePercent());//I googled how to use %f a little, I'm still a little confused on formatting with it though.
	}
}
