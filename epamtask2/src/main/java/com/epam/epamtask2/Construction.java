package com.epam.epamtask2;

public class Construction {
     int typeOfMaterial;
     float costpersquarefeet;
     float area;
     Construction(int type,float a){
    	 typeOfMaterial=type;
    	 area=a;
    	 if(typeOfMaterial==1) {
    		 costpersquarefeet=1200.00F;
    	 }
    	 else if(typeOfMaterial==2) {
    		 costpersquarefeet=1500.00F;
    	 }
    	 else if(typeOfMaterial==3) {
    		 costpersquarefeet=1800.00F;
    	 }
    	 else {
    		 costpersquarefeet=2500.00F;
    	 }
     }
     public int caluculateTotalCost() {
    	 return (int)(this.area*this.costpersquarefeet);
     }
     
}
