
package time1;
import java.io.*;
import java.util.*;



public class time{
	public void getTime(){
		float cur;
		int ch;
		char c;
		Scanner sc = new Scanner(System.in);
		System.out.println("=======================TIME CONVERTER========================");
		System.out.println("1) Hours\n2) Min\n3) Seconds");
		System.out.println("Enter Your Choice: ");	
		ch = sc.nextInt();		
		switch(ch){
				case 1:
					System.out.println("Enter in Hours: ");
					cur = sc.nextFloat();
					System.out.println("Minuites: "+(cur * 60));
					System.out.println("Seconds: "+(cur * 3600));
					break;
				case 2: 
					System.out.println("Enter in Minuites: ");
					cur = sc.nextFloat();
					System.out.println("Seconds: "+(cur * 60));
					System.out.println("Hours: "+(cur / 60));
					break;
				case 3:
					System.out.println("Enter in Seconds: ");
					cur = sc.nextFloat();
					System.out.println("Minuites: "+(cur / 60));
					System.out.println("Hours: "+(cur / 3600));
					break;
				default: System.out.println("Invalid Choice!");
			}
	}
	
	
	
}