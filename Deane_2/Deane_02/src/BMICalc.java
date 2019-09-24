import java.util.Scanner;
public class BMICalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double height, weight, BMI_std, BMI_met;
		int menu;
		Scanner scnr = new Scanner (System.in);
		
		System.out.println("Select units\n1:BMI Standard Calculation\n2:BMI Metric Calculation");

		menu = scnr.nextInt();
		
		if(menu==1) {
			
			System.out.println("Enter your Weight in Pounds: ");
			weight = scnr.nextDouble();
			System.out.println("Enter your height in inches: ");		
			height = scnr.nextDouble();         
			height = Math.pow(height, 2);            
			BMI_std = (703*weight)/(height);  
			System.out.printf("Your BMI is: %.1f\n\n",BMI_std);  
			
		}
		 
		if(menu==2) {
			
			System.out.println("Enter your Weight in Kilograms: ");
			weight = scnr.nextDouble();
			System.out.println("Enter your height in Meters: ");
			height = scnr.nextDouble(); 
			BMI_met = Math.pow(height, 2);  
			System.out.printf("Your BMI is: %.1f\n\n",BMI_met);
			
		}
		System.out.println("BMI Categories: ");
		System.out.println("Underweight = <18.5");
		System.out.println("Normal weight = 18.5–24.9");
		System.out.println("Overweight = 25–29.9");
		System.out.println("Obesity = BMI of 30 or greater");
	}

}
