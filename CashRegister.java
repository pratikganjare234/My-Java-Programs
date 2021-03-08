import java.util.Scanner;
import java.lang.Math;


public class CashRegister 
{


	public static void main(String[] args) 
{
	Scanner input = new Scanner(System.in);
	double total = 0.0, coupontotal = 0.0; 
	double price, coupon, cash; 
	double subtotal, taxpercentage, totalwithtax, finaltotal, cashowed, amount, cashleft; 
	int itemcounter = 0, couponcounter = 0; 
	int pennies, nickels, dimes, quarters, ones, fives, tens, twenties;
		double TAXAMOUNT = .06;
		double PENNIES = .01;
		double NICKELS = .05;
		double DIMES = .1;
		double QUARTERS = .25;
		double DOLLARS = 1;
		double FIVES = 5;
		double TENS = 10;
		double TWENTIES = 20;
	System.out.print("Enter price or 0 to quit: ");
	price = input.nextDouble();
	
	// loop until sentinel value read from user
	while (price != 0)
	{
		total = total + price; // add item price to total
		itemcounter = itemcounter + 1;
		
		// prompt for input and read next price from cashier
		System.out.print("Enter price or 0 to quit: ");
		price = input.nextDouble();
	}
	if (itemcounter != 0)
	{
		System.out.print("Please enter any coupon amounts at this time, or press 0 to continue: ");
		coupon = input.nextDouble();
		while (coupon != 0)
		{
			coupontotal = coupontotal + coupon; // add coupon total
			couponcounter = couponcounter + 1;
			System.out.print("Enter coupon amount or 0 to quit: ");
			coupon = input.nextDouble();
		}
		System.out.printf("ITEM TOTAL: %.2f%n", total);
		System.out.printf("\n" + "COUPON TOTAL: %.2f%n", coupontotal);
		subtotal = total - coupontotal;
		System.out.printf("\n" + "SUBTOTAL: %.2f%n", subtotal);
		taxpercentage = TAXAMOUNT * 100;
		System.out.printf("\n" + "TAX PERCENTAGE: %.2f%n", taxpercentage);
		totalwithtax = TAXAMOUNT * subtotal;
		System.out.printf("\n" + "TAX AMOUNT: %.2f%n", totalwithtax);
		finaltotal = totalwithtax + subtotal;
		System.out.printf("\n" + "TOTAL: %.2f%n", finaltotal);
		System.out.print("\n" + "Enter amount of cash given: ");
		cash = input.nextDouble();
		cashowed = cash - finaltotal;
		System.out.printf("\n" + "CHANGE OWED: %.2f%n", cashowed);
		twenties = (int) Math.floor(cashowed/TWENTIES);
		tens = (int) Math.floor((cashowed - twenties * TWENTIES)/TENS);
		fives = (int) Math.floor((cashowed-twenties * TWENTIES - tens * TENS)/FIVES);
		ones = (int) Math.floor((cashowed - twenties * TWENTIES - tens * TENS - fives * FIVES));
		cashleft = cashowed - twenties * TWENTIES - tens * TENS - fives * FIVES - ones * DOLLARS;
		cashleft = Math.round(cashleft * 100.0) /100.0;
		quarters =  (int) Math.floor(cashleft/.25);
        cashleft = cashowed - twenties * TWENTIES - tens * TENS - fives * FIVES - ones * DOLLARS - quarters * QUARTERS;
		cashleft = Math.round(cashleft * 100.0) /100.0;
		dimes =  (int) Math.floor(cashleft/DIMES);
		cashleft = cashowed - twenties * TWENTIES - tens * TENS - fives * FIVES - ones * DOLLARS - quarters * QUARTERS - dimes * DIMES;
		cashleft = Math.round(cashleft * 100.0) /100.0;
		nickels =  (int) Math.floor(cashleft/NICKELS);
		cashleft = cashowed - twenties * TWENTIES - tens * TENS - fives * FIVES - ones * DOLLARS - quarters * QUARTERS - dimes * DIMES - nickels * NICKELS;
		cashleft = Math.round(cashleft * 100.0) /100.0;
		pennies =  (int) Math.floor(cashleft/PENNIES);
	if (twenties > 0)
	{
		System.out.print("$20.00: " + twenties + "\n");
	}
		
	if (tens > 0)
	{
		System.out.print("$10.00: " + tens + "\n");
	}
		
	if (fives > 0)
	{
		System.out.print("$5.00: " + fives + "\n");
	}	
	
	if (ones > 0)
	{
		System.out.print("1.00: " + ones + "\n");
	}	
	
	if (quarters > 0)
	{
		System.out.print("$0.25: " + quarters + "\n");
	}	
		
	if (dimes > 0)
	{
		System.out.print("$0.10: " + dimes + "\n");
	}
		
	if (nickels > 0)
	{
		System.out.print("$0.05: " + nickels + "\n");
	}
		
	if (pennies > 0)
	{
		System.out.print("$0.01: " + pennies + "\n");
	}
		System.out.println("----------------------");
		System.out.println("***END OF PROGRAM***");
	}
	}			
}