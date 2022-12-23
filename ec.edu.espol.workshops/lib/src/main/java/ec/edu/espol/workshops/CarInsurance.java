/**
 * 
 */
package ec.edu.espol.workshops;
/**
 * @author Claudio Olvera
 *
 */
public class CarInsurance {
	private Customer customer;
	//The base premium is $600, it must be applied to every insurance;
	final int basePremium=600; 
	public void setCustomer(Customer customer) {
		this.customer=customer;
	}
	public Customer getCustomer(){return this.customer;}
	/**
	 * @author Claudio Olvera
	 * @author klucin
	 */
	public int getPremium() {
		//1
		int premium = this.basePremium;
		int age = customer.getAge();
		char sex = customer.getSex();
		boolean married = customer.isMarried();
		//2
		if(customer.isValidLicense() !=true || age > 80 || age < 1){
			//si es mayor de 80 no puede ser asegurado
			// si no tiene licencia no es asegurado
			return -1;
		}
		
		//- If the customer is male, not married, and younger than 25, 
		//  then it is needed to add $1500 to the base premium;
		//3
		if(sex == 'M'){
			if(!married && age < 25)
				//4
				premium = 1500 + this.basePremium;	
		//- If the customer is female, or if the customer is married, 
		//  then it is needed to subtract $200 from the base premium;
		//5
		}else if(sex == 'F'){
			if(married)
			//6
				premium = this.basePremium - 200;
		//7
		}else{
			return -1; // solo puede ser hombre o mujer
		}
		//If the customer is 45 or older, but younger than 65, 
		//then it is needed to subtract $100 from the base premium.
		//8
		if(age >= 45 && age < 65){
			//9
			premium = this.basePremium - 100;
		}

		return premium;
		//prueba xxx
	}
	
}
