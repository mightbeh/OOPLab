package currency1;

import java.io.*;
import java.util.*;

public class currency{
		public void getCurr(){
			float cur;
			int ch;
			char c;
			Scanner sc = new Scanner(System.in);
			System.out.println("=======================CURRENCY CONVERTER========================");
			System.out.println("1) INR-USD\n2)USD-INR\n3)INR-EUR\n4)EUR-INR\n5)INR-YEN\n6)YEN-INR");
			System.out.println("Enter Your Choice: ");
			ch = sc.nextInt();
			switch(ch){
				case 1: 
					System.out.println("Convert to INR, Enter in USD: ");
					cur = sc.nextFloat();
					System.out.println("INR: "+(cur * 69.03f));
					break;
				case 2:
					System.out.println("Convert to USD, Enter in INR: ");
					cur = sc.nextFloat();
					System.out.println("USD: "+cur * 0.014f);
					break;
				case 3:
					System.out.println("Convert to INR, Enter in EUR: ");
					cur = sc.nextFloat();
					System.out.println("INR: "+cur * 76.86f);
					break;
				case 4:
					System.out.println("Convert to EUR, Enter in INR: ");
					cur = sc.nextFloat();
					System.out.println("EUR: "+cur * 0.013f);
					break;					
				case 5:
					System.out.println("Convert to INR, Enter in YEN: ");
					cur = sc.nextFloat();
					System.out.println("INR: "+cur * 0.64f);
					break;
				case 6:
					System.out.println("COnvert to YEN, Enter in INR: ");
					cur = sc.nextFloat();
					System.out.println("USD: "+cur * 1.57f);
					break;
				default:
					System.out.println("Invalid Choice");
			}
		}
}