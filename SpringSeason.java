package operatorprograms;
import java.util.Scanner;
public class SpringSeason {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter values of m and d");
	int m =sc.nextInt();
    int d =sc.nextInt();
    boolean spring = false;
  
    if (m==3&&d>=20&&d<=31||m==4&&d<=30&&d>0||m==5&&d<=31&&d>0||m==6&&d<=20&&d>0) {
    	spring = true;
    	System.out.println(spring);
    }
    else System.out.println(spring);
    
    
}
}
