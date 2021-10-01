import java.util.Scanner;
public class Ejemplo4 {
	public static void main (String argv[]) {
		float side;
		float squareArea;
		
		
		System.out.println("Enter the side:");
		
		
		//Reading the value
		Scanner inputValue;
		inputValue = new Scanner(System.in);
		side = inputValue.nextFloat();
		
		
		squareArea = side * side;
		System.out.println(squareArea);

		inputValue.close();
	}
}