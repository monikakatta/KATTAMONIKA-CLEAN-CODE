package com.epam.epamtask2;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	private static final Logger LOGGER = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
		@SuppressWarnings("resource")
		Scanner  sc =new Scanner(System.in);
        float  principle=1000.00F;
        float time=2.00F;
        float rateOfInterest=2.00F;
        int numberoftimes=3;
        SimpleInterest si = new SimpleInterest(principle,time,rateOfInterest);
        LOGGER.info("simple interest is: "+ si.caluculateSimpleInterest());
        CompoundInterest ci=new CompoundInterest(principle,time,rateOfInterest,numberoftimes);
        LOGGER.info("compound interest is: "+ ci.caluculateCompoundInterest());
        LOGGER.info("1:1200INR if we use standard materials\r\n" + 
        		"2:1500INR if we use above standard materials\r\n" + 
        		"3: 1800INR if customers needs high standard material\r\n" + 
        		"4: 2500INR if customer needs high standard material and fully\r\n" + 
        		"automated home\r\n");
        LOGGER.info("enter the type of material:\n");
        int type=sc.nextInt();
        LOGGER.info("total area of house:\n");
        float area=sc.nextFloat();
        Construction c=new Construction(type,area);
        LOGGER.info("total cost for construction is :"+c.caluculateTotalCost()+"INR");
        LOGGER.debug("this is debug logger");
        LOGGER.info("this is info logger");
        LOGGER.warn("this is warn logger");
        LOGGER.error("this is error logger");
        LOGGER.fatal("this is fatal logger");
        
    }
}
