package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class USAddressTester {
	private StreetUSAddress add1;
	private StreetUSAddress add2;

public static void main(String[] args){
	StreetUSAddress add1 = new StreetUSAddress("12 Oak Road","64 North Drive","Grover","NY","10465");
	StreetUSAddress add2 = new StreetUSAddress("1035 Summit Street","","New City","NY","10891");
	
	add1.toString();
	add2.toString();
	
	try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR StreetUSAddress.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
  }
}