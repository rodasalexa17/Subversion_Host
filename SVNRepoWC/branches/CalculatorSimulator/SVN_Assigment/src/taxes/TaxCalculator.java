package taxes;

public class TaxCalculator {
	private final static int lakh =100000; 

	private float basicSalary; 

	private boolean citizenship; 

	private float tax;

	

	//constructors

	

	public TaxCalculator(){ 

		

	}

	

	public TaxCalculator(boolean citi, float basi ){

		this.citizenship = citi; 

		this.basicSalary = basi; 

	}

	

	//Getters & Setters 

	public float getBasicSalary() {

		return basicSalary;

	}




	public void setBasicSalary(float basicSalary) {

		this.basicSalary = basicSalary;

	}




	public boolean isCitizenship() {

		return citizenship;

	}




	public void setCitizenship(boolean citizenship) {

		this.citizenship = citizenship;

	}




	public float getTax() {

		return tax;

	}




	public void setTax(float tax) {

		this.tax = tax;

	}

	

	

	//Methods

	public void calculateTax() {

		

		 tax=(30*this.basicSalary)/100;

		 System.out.println("The tax of the employee for the " + this.basicSalary + " is " + this.tax);

		

	}




	public void deductTax(){

		int nettSalary = (int) (this.basicSalary-this.tax);

	System.out.println("The nett salary of the employee  " + nettSalary);

	}

	

	void validateSalary(){

		

			System.out.println("The salary and citizenship eligibility: "   );

			if(basicSalary > lakh && this.citizenship) {System.out.print("true");}

			else System.out.print("false");

		}




	

	

	}

