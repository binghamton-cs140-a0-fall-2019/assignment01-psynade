package assignment01;

public class SimpleDateTester{

	
	public static void main(String[]args){
		SimpleDate day= SimpleDate.of(1999,6,15);
		
		SimpleDate otherDay1= SimpleDate.of(1998,2,2);  // smaller year
		SimpleDate otherDay2= SimpleDate.of(1999,5,2);  // same year smaller month
		SimpleDate otherDay3= SimpleDate.of(1999,6,2);  // same year same month smaller day
		SimpleDate otherDay4= SimpleDate.of(2000,2,2);  // larger year 
		SimpleDate otherDay5= SimpleDate.of(1999,6,15); // same year same month same day
		
		if(!day.before(otherDay1)){
			System.out.println("test passed");
		}
		if(!day.before(otherDay2)){
			System.out.println("test passed");
		}
		if(!day.before(otherDay3)){
			System.out.println("test passed");
		}
		if(day.before(otherDay4)){
			System.out.println("test passed");
		}
		if(!day.before(otherDay5)){
			System.out.println("test passed");
		}
	}
}