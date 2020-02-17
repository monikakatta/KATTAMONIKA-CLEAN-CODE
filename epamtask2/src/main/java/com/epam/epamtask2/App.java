package com.epam.epamtask2;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
		@SuppressWarnings("resource")
		Scanner  sc =new Scanner(System.in);
        float  principle=1000.00F;
        float time=2.00F;
        float rateOfInterest=2.00F;
        int numberoftimes=3;
        SimpleInterest si = new SimpleInterest(principle,time,rateOfInterest);
        System.out.println("simple interest is: "+ si.caluculateSimpleInterest());
        CompoundInterest ci=new CompoundInterest(principle,time,rateOfInterest,numberoftimes);
        System.out.println("compound interest is: "+ ci.caluculateCompoundInterest());
        System.out.println("1:1200INR if we use standard materials\r\n" + 
        		"2:1500INR if we use above standard materials\r\n" + 
        		"3: 1800INR if customers needs high standard material\r\n" + 
        		"4: 2500INR if customer needs high standard material and fully\r\n" + 
        		"automated home\r\n");
        System.out.println("enter the type of material:\n");
        int type=sc.nextInt();
        System.out.println("total area of house:\n");
        float area=sc.nextFloat();
        Construction c=new Construction(type,area);
        System.out.println("total cost for construction is :"+c.caluculateTotalCost()+"INR");
        
        
    }
}
