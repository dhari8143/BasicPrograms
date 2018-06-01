package GuviPrgms;

import java.util.Scanner; //importing scanner class

public class Pos {
public static void main(String[] args) {
	// the below s represents the object name of scanner class. we can put any variables there
	Scanner s=new Scanner(System.in);  //Scanner class is used for getting inputs from the user
	int a=s.nextInt();
	//string a=s.next(); this is for string
	//float a=s.nextFloat(); this is for float
	//double a=s.nextDouble(); this is for double
	if(a>0) {
		System.out.println("Positive");
	}
	else if(a<0) {
		System.out.println("Negative");
	}
	else {
		System.out.println("Zero");
	}
}
}
