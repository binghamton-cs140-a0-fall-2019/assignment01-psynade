package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester {
	private Computer comp1;
	private Computer comp2;
	private Computer comp3;
	private Computer comp4;
	public static void main(String[] args) {
	//TODO make 4 different Computer objects with different 
	//combinations of disk size (two more than a terabyte and two less)
	//and for each make one an SSD drive and the other not.
	//Then call System.out.println(comp); for each "comp" object
	//and observe that there are small differences in how the computer
	//information prints out
	Computer comp1 = new Computer("MSI", "High end CPU", 16, 1000, true, 299.99);
	Computer comp2 = new Computer("HP", "Average CPU", 8, 620, false, 159.99);
	Computer comp3 = new Computer("Dell", "Fast CPU", 10, 1200, false, 329.99);
	Computer comp4 = new Computer("Alienware", "Superfast CPU", 30, 300, true, 499.99 );
		System.out.println(comp1);
		System.out.println(comp2);
		System.out.println(comp3);
		System.out.println(comp4);
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.
	Computer comp12 = new Computer("MSI", "High end CPU", 16, 1000, true, 299.99);
	Computer comp22 = new Computer("HP", "Average CPU", 8, 620, false, 159.99);
	Computer comp32 = new Computer("Dell", "Fast CPU", 10, 1200, false, 329.99);
	Computer comp42 = new Computer("Alienware", "Superfast CPU", 30, 300, true, 499.99 );
		output.print(comp12);
		output.print(comp22);
		output.print(comp32);
		output.print(comp42);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}