import java.util.Scanner;

// Got this info from http://www.mkyong.com/java/how-to-calculate-date-time-difference-in-java 
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.Period;

public class DifferenceInTime {
	public static void main(String[] args){
		
		//Initialize variables
		String firstDate;
		String secondDate;
		
		//Set up user input and show the format wanted for the dates
		Scanner scan = new Scanner(System.in);
		
		//Prints the line in quotes
		System.out.println("Enter the first date: mm/dd/yyyy");
		//Waits for the user to input numbers and press enter
		firstDate = scan.nextLine();
		
		System.out.println("Enter the second date: mm/dd/yyyy");
		secondDate = scan.nextLine();
		
		DateTimeFormatter format = DateTimeFormat.forPattern("MM/dd/yyyy");

		DateTime date1 = format.parseDateTime(firstDate);
		DateTime date2 = format.parseDateTime(secondDate);
		
		Period period = new Period(date1, date2);
		
		//Output difference in years, months, and days
		System.out.print(period.getYears() + " years, ");
		System.out.print(period.getMonths() + " months, ");
		System.out.print(period.getDays() + " days, ");
		
		//Closes scanner to prevent resource leak
		scan.close();
	}
}
