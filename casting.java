/* typecasting
widening
int->short->char->long->float->double
narrowing
double->float->long->char->short->int
*/
import java.lang.*;
class casting{
	public static void main(String args[])
	{
		int a =26;
		double b =a;
		double d=26.88;
		int c=(int)d;
		System.out.println("int: "+a);
		System.out.println("double: "+b);
		System.out.println("double to int: "+c);
	}
}
