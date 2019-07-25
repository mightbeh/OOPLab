package distance1;
import java.util.*;
public class distance{
	public void getDist(){
		float cur;
			int ch;
			char c;
			System.out.println("=======================DISTANCE CONVERTER========================");
			System.out.println("1) meter - km\n2)km - meter\n3)km - mile\n4)mile - km");
			System.out.println("Enter Your Choice: ");
			Scanner sc = new Scanner(System.in);
			ch = sc.nextInt();
			switch(ch){
				case 1: 
					System.out.println("Convert to Kilo Meters, Enter in Meters: ");
					cur = sc.nextFloat();
					System.out.println("km: "+(cur /1000));
					break;
				case 2:
					System.out.println("Convert to Meters, Enter in Kilo Meters: ");
					cur = sc.nextFloat();
					System.out.println("meter: "+cur * 1000);
					break;
				case 3:
					System.out.println("Convert to Miles, Enter in Kilo Meters: ");
					cur = sc.nextFloat();
					System.out.println("Mile: "+cur * 0.62f);
					break;
				case 4:
					System.out.println("Convert to Kilo Meters, Enter in Miles: ");
					cur = sc.nextFloat();
					System.out.println("EUR: "+cur * 1.609f);
					break;					
				default:
					System.out.println("Invalid Choice");
			}
	}
}