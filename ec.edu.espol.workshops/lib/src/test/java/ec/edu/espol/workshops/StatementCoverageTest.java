package ec.edu.espol.workshops;

import junit.framework.TestCase;
import ec.edu.espol.workshops.CarInsurance;
import ec.edu.espol.workshops.Customer;


public class StatementCoverageTest extends TestCase{
	
	private int test(int age, char sex, boolean married, boolean validLicense) {
		//CarInsurance testC1 = new CarInsurance();
		
		Customer customer = new Customer();
		CarInsurance testC1 = new CarInsurance();
		
		customer.setAge(age);
		customer.setSex(sex);
		customer.setMarried(married);
		customer.setValidLicense(validLicense);
		
		testC1.setCustomer(customer);
		return testC1.getPremium();
	}
	
	public void test1() {
		int res = test(30, 'M', true, false);
		assertEquals(res, -1);
	}
	
	public void test2() {
		Customer customer = new Customer();
		CarInsurance testC1 = new CarInsurance();
		testC1.setCustomer(customer);
		assertEquals(testC1.getPremium(), -1);
		customer.setAge(20);
		customer.setSex('M');
		customer.setMarried(false);
		customer.setValidLicense(true);
		assertEquals(testC1.getPremium(), 2100);
	}
	
	public void test3() {
		Customer customer = new Customer();
		CarInsurance testC1 = new CarInsurance();
		testC1.setCustomer(customer);
		assertEquals(testC1.getPremium(), -1);
	}
	
	public void test4() {
		Customer customer = new Customer();
		CarInsurance testC1 = new CarInsurance();
		testC1.setCustomer(customer);
		assertEquals(testC1.getPremium(), -1);
		customer.setAge(20);
		customer.setSex('F');
		customer.setMarried(true);
		customer.setValidLicense(true);
		
		assertEquals(testC1.getPremium(), 400);
	}
	
	public void test5() {
		Customer customer = new Customer();
		CarInsurance testC1 = new CarInsurance();
		testC1.setCustomer(customer);
		assertEquals(testC1.getPremium(), -1);
		customer.setAge(50);
		customer.setSex('F');
		customer.setMarried(true);
		customer.setValidLicense(true);
		
		assertEquals(testC1.getPremium(), 500);
	}
	
	public void test6() {
		Customer customer = new Customer();
		CarInsurance testC1 = new CarInsurance();
		testC1.setCustomer(customer);
		assertEquals(testC1.getPremium(), -1);
		customer.setSex('X');
		customer.setValidLicense(true);
		
		assertEquals(testC1.getPremium(), -1);
	}
}
