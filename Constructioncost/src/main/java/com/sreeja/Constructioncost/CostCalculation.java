package com.sreeja.Constructioncost;

public class CostCalculation {
	public double Cost( String materialStandard, double area , boolean automated ) {
		
		double cost = 0.0;
		
		if(materialStandard.equals("standard"))
			cost= 1500*area; 
		
		else if(materialStandard.equals("aboveStandard"))
			cost = 1700*area;
		
		else if(materialStandard.equals("highStandard") && automated == true)
			cost = 2100*area;
		
		else 
			cost = 2700*area;
		
		return cost;
}
}
