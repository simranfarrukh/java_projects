package com.fdmgroup.tdd.taxcalculator;

public class ScottishTaxCalculator implements TaxCalculationService{
	
	public ScottishTaxCalculator() {
		
	}

	public double getTaxRate(double income) {
		if(income <= 11500)
            return 0;
        else if(income >= 11851 && income <= 13850)
            return 19;
        else if(income >= 13851 && income <= 24000)
            return 20;
        else if(income >= 24001 && income <= 44273)
            return 21;
        else if(income >= 44274 && income <= 150000)
            return 41;
		return 46;

	}
}
