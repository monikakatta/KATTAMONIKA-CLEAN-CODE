package com.epam.epamtask2;

public class SimpleInterest {
       float principle;
       float time;
       float rateOfInterest;
       SimpleInterest(float p,float t,float r){
    	   principle=p;
    	   time=t;
    	   rateOfInterest=r;
       }
       public float caluculateSimpleInterest() {
    	   return (this.principle*this.time*this.rateOfInterest)/100;
       }
}
