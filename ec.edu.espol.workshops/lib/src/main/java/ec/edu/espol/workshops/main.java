/**
 * 
 */
package ec.edu.espol.workshops;
import ec.edu.espol.workshops.CarInsurance;

/**
 * @author Claudio Olvera
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		CarInsurance car = new CarInsurance();
		car.setAge(27);
		car.setMarried(true);
		car.setValidLicense(true);
		car.setSex("M".charAt(0));
		
		System.out.println(getPrima(car));
		*/
	}
	
	/**
	 * @author Claudio Olvera
	 */
	public static int getPrima(CarInsurance car) {
		int prima = 500; //The base premium is $500, it must be applied to every insurance;
		int age = car.getAge();
		char sex = car.getSex();
		boolean married = car.isMarried();
		
		if(car.isValidLicense() != true || age > 80) {
			//si es mayor de 80 no puede ser asegurado
			// si no tiene licencia no es asegurado
			return -1;
		}
		
		//- If the customer is male, not married, and younger than 25, 
		//  then it is needed to add $1500 to the base premium;
		
		//- If the customer is female, or if the customer is married, 
		//  then it is needed to subtract $200 from the base premium;
		if(sex == "M".charAt(0)) {
			//es hombre
			prima += 1500;
			if(married) {
				prima -= 200;
			}
		}else if(sex == "F".charAt(0)) {
			prima -= 200;
		}else {
			return -1; // solo puede ser hombre o mujer
		}
		
		//If the customer is 45 or older, but younger than 65, 
		//then it is needed to subtract $100 from the base premium.
		if(age >= 45 && age < 65) {
			prima -= 100;
		}

		return prima;
	}
	
}
