package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PersonTester{
	private Person per1;
	private DateAndPlaceOfBirth pDob;
	private StreetUSAddress addr;

public static void main(String[] args){
	DateAndPlaceOfBirth pDob = new DateAndPlaceOfBirth(1991,06,27,"Hillway","NY","US");
	StreetUSAddress addr = new StreetUSAddress("Main Street","","Avenue","NY","10942");
	Person per1 = new Person("John", "Doe","1613760176",pDob,addr);
	System.out.println(per1);
	
	try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR PersonTester.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

}

}