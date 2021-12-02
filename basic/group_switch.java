import java.util.Scanner;
public class group_switch{
public static void main(String args[]){
	char c;
	System.out.println("Enter the character: ");
	Scanner in=new Scanner(System.in);
	c=in.next().charAt(0);
	switch(c)
	{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		System.out.println("entered letter is vowel");
		break;
	default:
System.out.println("not a vowel");
break;
	}
}
}
	
	