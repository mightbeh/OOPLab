package javaprg1;


import java.io.*;
import java.util.*;
public class okk { 
        
    int cno;
    String cna;
    float pr,cr,cost=0,temp;
    Scanner o3 = new Scanner (System.in);
    public void getinfo(int g)
    {
        System.out.println("        CONSUMER "+(g+1));
        System.out.print("Enter consumer Name              : "); 
        cna = o3.nextLine();
        System.out.print("Enter consumer no.               : "); 
        cno = o3.nextInt();
        System.out.print("Enter previous_month_reading     : "); 
        pr = o3.nextFloat();
        System.out.print("Enter current_month_reading      : "); 
        cr = o3.nextFloat();
    }
    public void coninfo(int h)
    {        
        System.out.println("  ============================================== ");
        System.out.println("              EB BILL ->"+(h+1)); 
        System.out.println("  ============================================== ");
        System.out.println("    consumer name           : "+cna);
        System.out.println("    consumer no.            : "+cno); 
        System.out.println("    previous_month_reading  : "+pr+" units"); 
        System.out.println("    current_month_reading   : "+cr+" units");
        System.out.println("    No. of units consumed   : "+(cr-pr)+" units");
        System.out.println("    BILL AMOUNT(domestic) : Rs."+cost);
        System.out.println("  ============================================== ");
    }
    public void domestic()
    {   
        temp = cr - pr;
        
        if(temp <101)
        {
            cost = cost + temp; 
        }
        else if(temp<201)
        {
            cost += (temp * 2.5);
        }
        else if(temp <501)
        {
            cost += (temp * 4); 
        }
        else
        {
            cost += (temp * 6);
        }
    }
    public void commercial()
    {   
        temp = cr - pr;
       // System.out.println("    No. of units consumed   : "+temp+" units");
        if(temp <101)
        {
            cost += (2*temp); 
        }
        else if(temp<201)
        {
            cost += (temp * 4.5);
        }
        else if(temp <501)
        {
            cost += (temp * 6); 
        }
        else
        {
            cost += (temp * 7);
        }
        //System.out.println("    BILL AMOUNT(commercial) : Rs."+cost); 
        //System.out.println("  =============================================");
    }
    
}
