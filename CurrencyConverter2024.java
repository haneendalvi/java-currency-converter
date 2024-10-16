import java.util.*;

class CurrencyConverter2024 
{
	public static void main (String args[])
	{  
		int currency, i, conv_to;
		double m=1, amt=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Select the currency you want to convert: ");
		System.out.print("\n1-Indian Rupee \n2-United States Dollar \n3-Euro \n4-United Arab Emirates Dirham ");
		System.out.print("\n5-Canadian Dollar \n6-Pound Sterling \n7-Saudi Riyal \n8-Australian Dollar");
		System.out.print("\n9-Mexican Peso \n10-Japanese Yen \n11-Russian Ruble \n12-Bahraini Dinar");
		currency=sc.nextInt();
		System.out.println("\n Enter your amount:");
		i=sc.nextInt();
		switch (currency)
		{
			case 1:
			m=0.012*i;
			break;
			case 2:
			m=i;
			break;
			case 3:
			m=1.11*i;
			break;
			case 4:
			m=0.27*i;
			break;
			case 5:
			m=0.74*i;
			break;
			case 6:
			m=1.34*i;
			break;
			case 7:
			m=0.27*i;
			break;
			case 8:
			m=0.69*i;
			break;
			case 9:
			m=0.051*i;
			break;
			case 10:
			m=0.0069*i;
			break;
			case 11:
			m=0.011*i;
			break;
			case 12:
			m=2.65*i;
			break;
			default:
			System.out.println("Invalid Choice.");
			break;
		}
		System.out.println("Select the currency you want to convert to:");
		conv_to=sc.nextInt();
		switch (conv_to)
		{
			case 1:
			amt=83.67*m;
			break;
			case 2:
			amt=m;
			break;
			case 3:
			amt=0.90*m;
			break;
			case 4:
			amt=3.67*m;
			break;
			case 5:
			amt=1.35*m;
			break;
			case 6:
			amt=0.75*m;
			break;
			case 7:
			amt=3.75*m;
			break;
			case 8:
			amt=1.46*m;
			break;
			case 9:
			amt=19.62*m;
			break;
			case 10:
			amt=144.84*m;
			break;
			case 11:
			amt=92.50*m;
			break;
			case 12:
			amt=0.38*m;
			break;
			default:
			System.out.println("Invalid Choice.");
			break;
		}
		System.out.println(amt+" is the approximate conversion of the given amount");
		System.out.println("\n*Rates as shown on google, dated: 26/09/2024*");
	}
}