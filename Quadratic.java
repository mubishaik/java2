package operatorprograms;
import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter the values of a and b and c");
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
int delta = (b*b)-(4*a*c);

double root1 = (-b + Math.sqrt(delta))/(2*a);
double root2 = (-b - Math.sqrt(delta))/(2*a);
System.out.println(root1 + "   " +root2);

}
}
