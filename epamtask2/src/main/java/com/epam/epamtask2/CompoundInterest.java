package com.epam.epamtask2;

public class CompoundInterest {
	 float initialprincipleamount;
     int number_of_times;
     float rateOfInterest;
     float number_of_timePerriod;
     CompoundInterest(float p,float t,float r,int n){
  	   initialprincipleamount=p;
  	   number_of_timePerriod=t;
  	   rateOfInterest=r;
  	   number_of_times=n;
  	   
     }
     public float caluculateCompoundInterest() {
    	 float val1=1+(this.rateOfInterest/this.number_of_times);
    	 double power=Math.pow(val1,this.number_of_times*this.number_of_timePerriod);
    	 return (float) (this.initialprincipleamount*power);
    	 
     }
}
