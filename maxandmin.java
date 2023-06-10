package operatorprograms;
import java.util.Scanner;
public class maxandmin {
	public static void main(String[] args) {
		
Scanner sc =new Scanner(System.in);
System.out.println("enter the value of a");
int a= sc.nextInt();
System.out.println("enter the number b");
int b= sc.nextInt();
System.out.println("enter the number c");
int c= sc.nextInt();
System.out.println((a+b)*c);
System.out.println((c+a)/b);
System.out.println((a%b)+c);
System.out.println((a*b)+c);
{
if(a==b&&b==c) System.out.println("equal");
if (a>=b||a>=c) System.out.println(a + " is max");
else if (b>=c) System.out.println(b + " is max");
else  System.out.println(c + " is max");
}

if (a<=b||a<=c) System.out.println(a + " is min");
else if (b<=c) System.out.println(b + " is min");
else  System.out.println(c + " is min");
	}	
	}
