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
		customer.setMarried(false);
		customer.setValidLicense(true);		
		
		System.out.println("Test AGE variable ----------------------------------");
		
		System.out.println("Lower Value: 1");
		customer.setAge(1);
		car.setCustomer(customer);
		System.out.println(car.getPremium());
		
		System.out.println("Below Lower Value: 0");
		customer.setAge(0);
		car.setCustomer(customer);
		System.out.println(car.getPremium());
		
		System.out.println("Above Lower Value: 2");
		customer.setAge(2);
		car.setCustomer(customer);
		System.out.println(car.getPremium());
		
		System.out.println("Upper Value Value: 80");
		customer.setAge(80);
		car.setCustomer(customer);
		System.out.println(car.getPremium());
		
		System.out.println("Below Upper Value: 79");
		customer.setAge(79);
		car.setCustomer(customer);
		System.out.println(car.getPremium());
		
		System.out.println("Above Upper Value: 81");
		customer.setAge(81);
		car.setCustomer(customer);
		System.out.println(car.getPremium());
		
		System.out.println("Test AGE variable END ------------------------------");
		
	}

}
