/*
Else If Ladder
90-100 grade-A
80-89 grade-b
70-79 grade-c
<70 grade-D
*/
import java.util.Scanner;
public class ladder{
public static void main(String args[]){
	float avg;
	System.out.println("Enter the avg mark: ");
	Scanner in =new Scanner(System.in);
	avg=in.nextFloat();
	if(avg>=90 && avg<=100)
	{
		System.out.println("Grade A");
	}
	else if(avg>=80 && avg<=89)
	{
		System.out.println("Grade B");
	}
	else if(avg>=70 && avg<=79)
	{
		System.out.println("Grade C");
	}
	else{
		System.out.println("Grade D");
	}
}
}

