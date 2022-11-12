package ec.edu.espol.workshops;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class StepsDefs {
	public Customer customer = new Customer();
	public CarInsurance car = new CarInsurance();
			
	@Given("The value of the premium is: {int}")
	public void customer(String gender, String isMarried,int age, String isValid) {
		gender = customer.setSex('M');
		age = customer.setAge(22);
		isMarried = customer.setMarried(false);
		isValid = customer.setValidLicense(true);
		car.setCustomer(customer);
	}
	
	@When("Calculate the premium ")
	public void we_calculate_the_premium() {
		actualAnswer = car.getPremium();
	}
	@Them("Show 2000")
	public void we_Should_receive() {
		assertEquals(2000, actualAnswer);
	}
	
	
	@Given("s female, married, 50, valid license")
	public void customer(String gender, String isMarried,int age, String isValid) {
		gender = customer.setSex('F');
		age = customer.setAge(50);
		isMarried = customer.setMarried(true);
		isValid = customer.setValidLicense(true);
		car.setCustomer(customer);
	}
	@When("Calculate the premium ")
	public void we_calculate_the_premium() {
		actualAnswer = car.getPremium();
	}
	@Them("Show 400")
	public void we_Should_receive() {
		assertEquals(400, actualAnswer);
	}
	
	@Given("Female, Married, 26, valid license")
	public void customer(String gender, String isMarried,int age, String isValid) {
		gender = customer.setSex('F');
		age = customer.setAge(26);
		isMarried = customer.setMarried(true);
		isValid = customer.setValidLicense(true);
		car.setCustomer(customer);
	}
	@When("Calculate the premium")
	public void we_calculate_the_premium() {
		actualAnswer = car.getPremium();
	}
	@Them("Show 300")
	public void we_Should_receive() {
		assertEquals(300, actualAnswer);
	}
	
	@Given("s female, not married, 80, valid license")
	public void citizen_is_underage {
		Customer customer = new Customer();
		CarInsurance car = new CarInsurance();
		customer.setSex('F');
		customer.setAge(80);
		customer.setMarried(false);
		customer.setValidLicense(true);		
		car.setCustomer(customer);
	}
	@When("Calculate the premium")
	public void we_calculate_the_premium() {
		actualAnswer = car.getPremium();
	}
	@Them("Show 500")
	public void we_Should_receive() {
		assertEquals(500, actualAnswer);
	}
	
}
