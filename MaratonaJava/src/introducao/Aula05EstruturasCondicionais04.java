package introducao;

public class Aula05EstruturasCondicionais04 {

	public static void main(String[] args) {
		
        /*     
              &&             || 
	       V && V = V     V || V = V
	       V && F = F	  V || F = V
	       F && V = F     F || V = V
	       F && F = F     F || F = F
	    */
		
		
		double annualSalary = 25000;
		double firstLane = 9.70 / 100;
		double secondLane = 37.35 / 100;
		double thirdLane = 49.50 / 100;
		double taxValue;
		if(annualSalary <= 34712) {
			taxValue = annualSalary * firstLane;
		}else if((annualSalary >= 34713) && (annualSalary <= 68507)) {
			taxValue = annualSalary * secondLane;
		}else {
			taxValue = annualSalary * thirdLane;
		}
		System.out.println(taxValue);
	}

}
