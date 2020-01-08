package volodymyr_task2;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input you line (^_^) :");
		
		String s = sc.nextLine();
		
		//String s = "Hello, my name is Volodymyr and I learn Java";
		
		System.out.println(s.replace("a", "-").replace("o", "-").replace("i", "-").replace("u", "-").replace("y", "-").replace("e", "-").replace("A", "-").replace("O", "-").replace("I", "-").replace("E", "-").replace("U", "-").replace("Y", "-"));	
	}
}