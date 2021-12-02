//here we use both if else condition//
import java.util.Scanner;
public class statement{
	public static void main(String args[]){
		int year;
		System.out.println("Enter the year: ");
		Scanner in=new Scanner(System.in);
		year=in.nextInt();
		if(year%4==0 || (year%100==0 && year%400==0))
		{
			System.out.println("year" +year+ "is a leap year");
		}
		else{
			System.out.println("not a leap year");
		}
	}
}
