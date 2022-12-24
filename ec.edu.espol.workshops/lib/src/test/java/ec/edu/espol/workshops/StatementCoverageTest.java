package ec.edu.espol.workshops;
import junit.framework.TestCase;
import static org.junit.Assert.assertTrue;
import org.apache.commons.math3.geometry.euclidean.threed.CardanEulerSingularityException;
import ec.edu.espol.workshops.CarInsurance;
import ec.edu.espol.workshops.Customer;


public class StatementCoverageTest {
	
	private void test() {
		//CarInsurance testC1 = new CarInsurance();
		
	}
	CarInsurance testC1 = new CarInsurance();
	private void testC1() {
		Customer customer = new Customer();
		customer.setAge(30);
		customer.setSex('M');
		
		//assertTrue(testC1.getPremium());
	}
}
