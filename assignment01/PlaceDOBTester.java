package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PlaceDOBTester {
	private DateAndPlaceOfBirth placeDob1;
	private DateAndPlaceOfBirth placeDob2;
	private DateAndPlaceOfBirth placeDob3;
	private DateAndPlaceOfBirth placeDob4;
	private DateAndPlaceOfBirth placeDob5;
	public static void main(String[] args){
	DateAndPlaceOfBirth placeDob1 = new DateAndPlaceOfBirth(1999,06,26,"New City","NY","USA");
	DateAndPlaceOfBirth placeDob2 = new DateAndPlaceOfBirth(1999,06,26,"Vestal","NY","USA");
	DateAndPlaceOfBirth placeDob3 = new DateAndPlaceOfBirth(2003,06,26,"San Francisco","NY","USA");
	DateAndPlaceOfBirth placeDob4 = new DateAndPlaceOfBirth(1983,03,9,"London","England");
	DateAndPlaceOfBirth placeDob5 = new DateAndPlaceOfBirth(1972,9,13,"Barcelona","Spain");
	
	// System.out.println test for all the objects
	System.out.println(placeDob1);
	System.out.println(placeDob2);
	System.out.println(placeDob3);
	System.out.println(placeDob4);
	System.out.println(placeDob5);
	System.out.println();
	
	// Test for .olderThan method
	System.out.println(placeDob1.olderThan(placeDob2));
	System.out.println(placeDob1.olderThan(placeDob3));
	System.out.println(placeDob1.olderThan(placeDob4));
	System.out.println(placeDob1.olderThan(placeDob5));
	System.out.println(placeDob2.olderThan(placeDob3));
	System.out.println(placeDob2.olderThan(placeDob4));
	System.out.println(placeDob2.olderThan(placeDob5));
	System.out.println(placeDob3.olderThan(placeDob4));
	System.out.println(placeDob3.olderThan(placeDob5));
	System.out.println(placeDob4.olderThan(placeDob5));
	System.out.println(".olderThan done");


	// Test for .youngerThan method
	System.out.println(placeDob1.youngerThan(placeDob2));
	System.out.println(placeDob1.youngerThan(placeDob3));
	System.out.println(placeDob1.youngerThan(placeDob4));
	System.out.println(placeDob1.youngerThan(placeDob5));
	System.out.println(placeDob2.youngerThan(placeDob3));
	System.out.println(placeDob2.youngerThan(placeDob4));
	System.out.println(placeDob2.youngerThan(placeDob5));
	System.out.println(placeDob3.youngerThan(placeDob4));
	System.out.println(placeDob3.youngerThan(placeDob5));
	System.out.println(placeDob4.youngerThan(placeDob5));
	System.out.println(".youngerThan done");

	//Test for .hasSameBirthDateAs
	System.out.println(placeDob1.hasSameBirthDateAs(placeDob2));
	System.out.println(placeDob1.hasSameBirthDateAs(placeDob3));
	System.out.println(placeDob1.hasSameBirthDateAs(placeDob4));
	System.out.println(placeDob1.hasSameBirthDateAs(placeDob5));
	System.out.println(placeDob2.hasSameBirthDateAs(placeDob3));
	System.out.println(placeDob2.hasSameBirthDateAs(placeDob4));
	System.out.println(placeDob2.hasSameBirthDateAs(placeDob5));
	System.out.println(placeDob3.hasSameBirthDateAs(placeDob4));
	System.out.println(placeDob3.hasSameBirthDateAs(placeDob5));
	System.out.println(placeDob4.hasSameBirthDateAs(placeDob5));
	System.out.println("hasSameBirthDateAs done");
	
	try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
}
	
}