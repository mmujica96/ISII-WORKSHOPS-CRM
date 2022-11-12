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
		
		//Case 5 - age less than 1
		customer.setAge(-1);
		car.setCustomer(customer);
		System.out.println(car.getPremium());

			
		/* 11/11/2022 
		* System Testing 
		* */
		System.out.println("************ System Testing **********");
		
		//CUSTOMER MODEL
		Customer customer_age_test = new Customer();
		CarInsurance car_age_case = new CarInsurance();
		customer_age_test.setSex('M');
		customer_age_test.setMarried(false);
		customer_age_test.setValidLicense(true);		
		
		System.out.println("..........1........");
		customer_age_test.setAge(45);
		car_age_case.setCustomer(customer_age_test);
		System.out.println(car_age_case.getPremium());
		
		System.out.println("..........2........");
		customer_age_test.setAge(90);
		car_age_case.setCustomer(customer_age_test);
		System.out.println(car_age_case.getPremium());

		System.out.println("..........3........");
		customer_age_test.setAge(-5);
		car_age_case.setCustomer(customer_age_test);
		System.out.println(car_age_case.getPremium());
		
		System.out.println("..........4........");
		customer_age_test.setAge(20);
		car_age_case.setCustomer(customer_age_test);
		System.out.println(car_age_case.getPremium());
		
		System.out.println("..........6........");
		customer_age_test.setAge(30);
		car_age_case.setCustomer(customer_age_test);
		System.out.println(car_age_case.getPremium());
		
		System.out.println("..........5........");
		Customer customer_age_test_null = new Customer();
		CarInsurance car_age_case_null = new CarInsurance();
		customer_age_test_null.setSex('M');
		customer_age_test_null.setMarried(false);
		//customer_age_test.setAge(); no se pasa el argumento
		customer_age_test_null.setValidLicense(true);
		car_age_case_null.setCustomer(customer_age_test_null);
		System.out.println(car_age_case_null.getPremium());
		
		
		Customer customer_gender_test = new Customer();
		CarInsurance car_gender_test = new CarInsurance();
		customer_gender_test.setAge(22);
		customer_gender_test.setMarried(false);
		customer_gender_test.setValidLicense(true);		
		

		System.out.println('7');
		customer_gender_test.setSex('M');
		car_gender_test.setCustomer(customer_gender_test);
		System.out.println(car_gender_test.getPremium());
		System.out.println(".................................................");
		
		System.out.println('8');
		customer_gender_test.setSex('F');
		car_gender_test.setCustomer(customer_gender_test);
		System.out.println(car_gender_test.getPremium());
		System.out.println(".................................................");
		
		System.out.println('9');
		customer_gender_test.setSex('K');
		car_gender_test.setCustomer(customer_gender_test);
		System.out.println(car_gender_test.getPremium());
		System.out.println(".................................................");
		
		System.out.println("10");
		Customer customer_gender_null = new Customer();
		CarInsurance car_gender_null = new CarInsurance();
		customer_gender_null.setAge(22);
		customer_gender_null.setMarried(false);
		customer_gender_null.setValidLicense(true);	
		car_gender_null.setCustomer(customer_gender_null);
		System.out.println(car_gender_null.getPremium());
		System.out.println(".................................................");
		
		
		System.out.println("Caso 11");
		Customer customer_married_true = new Customer();
		CarInsurance car_married_true = new CarInsurance();
		
		customer_married_true.setSex('M');
		customer_married_true.setAge(30);
		customer_married_true.setValidLicense(true);
		customer_married_true.setMarried(true);
		
		car_married_true.setCustomer(customer_married_true);
		System.out.println(car_married_true.getPremium());
		
		System.out.println("Caso 12");
		Customer customer_married_false = new Customer();
		CarInsurance car_married_false = new CarInsurance();
		
		customer_married_false.setSex('M');
		customer_married_false.setAge(30);
		customer_married_false.setValidLicense(true);
		customer_married_false.setMarried(false);
		
		car_married_false.setCustomer(customer_married_false);
		System.out.println(car_married_false.getPremium());
		
		System.out.println("Caso 13");
		Customer customer_married_null = new Customer();
		CarInsurance car_married_null = new CarInsurance();
		
		customer_married_null.setSex('M');
		customer_married_null.setAge(30);
		customer_married_null.setValidLicense(true);
		
		car_married_null.setCustomer(customer_married_null);
		System.out.println(car_married_null.getPremium());
		
		System.out.println("Caso 14");
		Customer customer_ValidLicense_true = new Customer();
		CarInsurance car_ValidLicense_true = new CarInsurance();
		
		customer_ValidLicense_true.setSex('M');
		customer_ValidLicense_true.setAge(30);
		customer_ValidLicense_true.setMarried(false);
		customer_ValidLicense_true.setValidLicense(true);
		
		
		car_ValidLicense_true.setCustomer(customer_ValidLicense_true);
		System.out.println(car_ValidLicense_true.getPremium());
		
		System.out.println("Caso 15");
		Customer customer_ValidLicense_false = new Customer();
		CarInsurance car_ValidLicense_false = new CarInsurance();
		
		customer_ValidLicense_false.setSex('M');
		customer_ValidLicense_false.setAge(30);
		customer_ValidLicense_false.setMarried(false);
		customer_ValidLicense_false.setValidLicense(false);
		
		
		car_ValidLicense_false.setCustomer(customer_ValidLicense_false);
		System.out.println(car_ValidLicense_false.getPremium());
		
		System.out.println("Caso 16");
		Customer customer_ValidLicense_null = new Customer();
		CarInsurance car_ValidLicense_null = new CarInsurance();
		
		customer_ValidLicense_null.setSex('M');
		customer_ValidLicense_null.setAge(30);
		customer_ValidLicense_null.setMarried(false);
		
		car_ValidLicense_null.setCustomer(customer_married_null);
		System.out.println(car_ValidLicense_null.getPremium());
		

		
	}

}
