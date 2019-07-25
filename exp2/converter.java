import currency1.currency;
import time1.time;
import distance1.distance;
import java.util.*;

class converter{
	public static void main(String args[]){
		int ch;
		char c;
		currency cur = new currency();
		time time = new time();
		distance dist = new distance();
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("=======================CONVERTER========================");
			System.out.println("1) Currency\n2) Time\n3) Distance");
			System.out.println("Enter Your Choice: ");	
			ch = sc.nextInt();
			switch(ch){
				case 1:
					cur.getCurr();
					break;
				case 2: 
					time.getTime();
					break;
				case 3:
					dist.getDist();
					break;
				default: System.out.println("Invalid Choice!");
			}
			System.out.println("Do you want to continue?: ");
			c = sc.next().charAt(0);
		}while(c!='n');
	}
}

