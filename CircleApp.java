package co.grandcircus;
import java.util.Scanner;



public class CircleApp{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double radius;
		String cont = "yes";
	
		do {	
		radius = Validator.getDouble(scan, "Enter a radius: ");
		Circle circle = new Circle(radius); 
		
		System.out.println(circle.getFormattedCircumference());
		System.out.println(circle.getFormattedArea());
		
		System.out.println("Would you like to continue?");
		cont = scan.nextLine();
		
	}while (cont.equalsIgnoreCase("Yes"));
		System.out.println("Goodbye!");
	}
	
}