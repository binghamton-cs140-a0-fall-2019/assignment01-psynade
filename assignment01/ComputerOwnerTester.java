package assignment01;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ComputerOwnerTester{
	private DateAndPlaceOfBirth pDob;
	private StreetUSAddress addr;
	private ComputerOwner bob;
	private Person per1;
	private Computer comp1;
	private Computer comp2;
	private Computer comp3;
	private Computer comp4;
	
	

public static void main(String[] args){
	DateAndPlaceOfBirth pDob = new DateAndPlaceOfBirth(1991,06,27,"Hillway","NY","US");
	StreetUSAddress addr = new StreetUSAddress("Main Street","","Avenue","NY","10942");
	Person per1 = new Person("John", "Doe","1613760176",pDob,addr);
	ComputerOwner bob= new ComputerOwner(per1);
	
	Computer comp1 = new Computer("MSI", "High end CPU", 16, 1000, true, 299.99);
	Computer comp2 = new Computer("HP", "Average CPU", 8, 620, false, 159.99);
	Computer comp3 = new Computer("Dell", "Fast CPU", 10, 1200, false, 329.99);
	Computer comp4 = new Computer("Alienware", "Superfast CPU", 30, 300, true, 499.99 );
	
	bob.addComputer(comp1);
	bob.addComputer(comp2);
	bob.addComputer(comp3);
	bob.addComputer(comp4);
	
	try(var output =new PrintWriter(new FileOutputStream(new File("output.txt"), true /* true means append to file */))) {
		for(Computer comps: bob.getComputers()){			
			System.out.println(comps.toString());
			output.println(comps.toString());
		}
		bob.removeComputer(0);
		bob.removeComputer(2);
	
		for(Computer comps: bob.getComputers()){
			System.out.println(comps.toString());
			output.println(comps.toString());
		}
	} catch (FileNotFoundException e) {
			e.printStackTrace();
	}
}
}