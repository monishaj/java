//Switch case statement in java
import java.util.Scanner;
public class caseswitch{
public static void main(String args[]){
	int a,b,c,ch;
	System.out.println("1.addition");
	System.out.println("2.substraction");
	System.out.println("3.Multiplication");
	System.out.println("4.Division");
	System.out.println("Enter your choice: ");
	Scanner in=new Scanner(System.in);
	ch=in.nextInt();
	System.out.println("Enter 2 nos: ");
	a=in.nextInt();
	b=in.nextInt();
	switch(ch)
	{
	case 1:
	c=a+b;
	System.out.println("1.addition"+c);
	break;
	case 2:
	c=a-b;
	System.out.println("2.substraction"+c);
	break;
	case 3:
	c=a*b;
	System.out.println("3.Multiplication"+c);
	break;
	case 4:
	c=a/b;
	System.out.println("4.Division"+c);
	break;
	default:
	System.out.println("invalid selection");
	}
}
}

	 