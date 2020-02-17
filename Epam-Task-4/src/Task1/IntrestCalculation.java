package Task1;

public class IntrestCalculation {

	double IntrestMethod(String CalculationType,double Amount,double NoOfYears,double rateOfIntrest) {
        
        double SimpleIntrest,CompoundIntrest;
		if(CalculationType=="SimpleIntrest")
		{
         SimpleIntrest=(Amount * NoOfYears * rateOfIntrest)/100;
         return SimpleIntrest;
		}
		else if(CalculationType=="CompoundIntrest")
		{
         CompoundIntrest=Amount * Math.pow(1.0+rateOfIntrest/100.0,NoOfYears) - Amount;
         return CompoundIntrest;
		}
		else
			return 0.0;
	}
}
