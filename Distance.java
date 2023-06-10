package operatorprograms;
import java.util.Scanner;
public class Distance {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the values of x and y");
	double x = sc.nextInt();
	double  y = sc.nextInt();
	double distance = Math.sqrt(Math.pow(x,2.0)+ Math.pow(y,2.0));
	System.out.println(distance);
}
}
