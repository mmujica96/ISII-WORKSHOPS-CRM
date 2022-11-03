package ec.edu.espol.workshops;
//class of test
public class Test{
	public static void main(String[] args){	
		Customer customer = new Customer();
		CarInsurance car = new CarInsurance();
		/* Male, Not Married, Age < 25, valid license 
		 * THEN Primium = 2000
		 **/
		customer.setSex('M');
		customer.setAge(22);
		customer.setMarried(false);
		customer.setValidLicense(true);		
		car.setCustomer(customer);
		System.out.println(car.getPremium());
		/* Male, Married, Age < 25, valid license 
		 * THEN Primium = 500
		 **/
		customer.setMarried(true);	
		car.setCustomer(customer);
		System.out.println(car.getPremium());
		System.out.flush();
		/* Female, Not Married, Age < 25, valid license 
		 * THEN Primium = 500
		 * */
		customer.setSex('F');	
		customer.setMarried(false);
		car.setCustomer(customer);
		System.out.println(car.getPremium());
		/* Female, Not Married, Age > 25, valid license 
		 * THEN Primium = 500
		 * */
		customer.setAge(26);
		car.setCustomer(customer);
		System.out.println(car.getPremium());
		/* Female, Married, Age > 25, valid license 
		 * THEN Primium = 300
		 * */
		customer.setMarried(true);
		car.setCustomer(customer);
		System.out.println(car.getPremium());
		/* Female, Married, Age < 25, valid license 
		 * THEN Primium = 300
		 * */
		customer.setAge(26);
		car.setCustomer(customer);
		System.out.println(car.getPremium());
		/* Female, Married, Age = 45, valid license 
		 * THEN Primium = 400
		 * */
		customer.setAge(45);
		car.setCustomer(customer);
		System.out.println(car.getPremium());
		/* Female, Married, 65 > Age > 45, valid license 
		 * THEN Primium = 400
		 * */
		customer.setAge(50);
		car.setCustomer(customer);
		System.out.println(car.getPremium());
		/* Female, Not Married, Age = 80, valid license 
		 * THEN Primium = 500
		 * */
		customer.setAge(80);
		customer.setMarried(false);
		car.setCustomer(customer);
		System.out.println(car.getPremium());
		/* Age > 80
		 * THEN Primium = -1
		 * */
		customer.setAge(81);
		car.setCustomer(customer);
		System.out.println(car.getPremium());
		/* Invalid license 
		 * THEN Primium = -1
		 * */
		customer.setValidLicense(false);		
		car.setCustomer(customer);
		System.out.println(car.getPremium());
		

		//Case 3 - age less than 45
		customer.setMarried(true);
		customer.setAge(15);
		car.setCustomer(customer);
		System.out.println(car.getPremium());
		customer.setMarried(true);
		
	
		//Case 4 - age over 85
		customer.setAge(101);
		car.setCustomer(customer);
		System.out.println(car.getPremium());

		
	}

}
