/* Mested if statement
a company insures its drivers in the following cases;
a.if the driver is married.
b.if the driver is unmarried,male & above 30 years of age.
c.if the driver is unmarried,female & above 25 years of age.
*/
import java.util.Scanner;
public class nested{
	public static void main(String args[]){
		System.out.println("Enter the marital(M/U): ");
		Scanner in =new Scanner(System.in);
		char marital=in.next().charAt(0);
		if(marital=='u' || marital=='U')
		{
			System.out.println("Enter the catergory(M/F): ");
			char catergory=in.next().charAt(0);
			System.out.println("Enter the age: ");
			int age=in.nextInt();
			if(catergory=='M' || catergory=='m' && age>=30)
			{
				System.out.println("eligible for insurance at unmarried malelevel");
			}
			else if(catergory=='F' || catergory=='f' && age>=25){
				
				System.out.println("eligible for insurance at unmarried femalelevel ");
			}
			else{
				System.out.println("not eligible");
			}
		}
		else if(marital=='m'|| marital=='M')
		{
			System.out.println("eligible for insurance");
		}
		else{
			System.out.println("Not eligible");
		}
	}
}
