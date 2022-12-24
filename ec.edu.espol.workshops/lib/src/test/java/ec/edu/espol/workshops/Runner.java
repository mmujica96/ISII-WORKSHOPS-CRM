package ec.edu.espol.workshops;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import ec.edu.espol.workshops.StatementCoverageTest;

public class Runner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(StatementCoverageTest.class);
		
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
		
      System.out.println(result.wasSuccessful());
   }
} 