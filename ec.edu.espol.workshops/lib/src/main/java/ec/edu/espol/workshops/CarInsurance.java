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
	//The base premium is $500, it must be applied to every insurance;
	final int basePremium=500; 
	public void setCustomer(Customer customer) {
		this.customer=customer;
	}
	public Customer getCustomer(){return this.customer;}
	/**
	 * @author Claudio Olvera
	 * @author klucin
	 */
	public int getPremium() {
		int premium = this.basePremium;
		int age = customer.getAge();
		char sex = customer.getSex();
		boolean married = customer.isMarried();
		if(customer.isValidLicense() !=true || age > 80){
			//si es mayor de 80 no puede ser asegurado
			// si no tiene licencia no es asegurado
			return -1;
		}
		//- If the customer is male, not married, and younger than 25, 
		//  then it is needed to add $1500 to the base premium;
		if(sex == 'M'){
			if(!married && age < 25)
			premium = 1500 + this.basePremium;	
		//- If the customer is female, or if the customer is married, 
		//  then it is needed to subtract $200 from the base premium;
		}else if(sex == 'F'){
			if(married)
			premium = this.basePremium - 200;
		}else{
			return -1; // solo puede ser hombre o mujer
		}
		//If the customer is 45 or older, but younger than 65, 
		//then it is needed to subtract $100 from the base premium.
		if(age >= 45 && age < 65){
			premium = this.basePremium - 100;
		}
		return premium;
	}
	
}
