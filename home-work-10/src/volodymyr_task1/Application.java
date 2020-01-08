package volodymyr_task1;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input palindr: ");
		
		String s = sc.nextLine();
		StringBuilder sb = new StringBuilder(s);
		
		if(s.length() == 5) {
			if(s.toUpperCase().equals(sb.reverse().toString().toUpperCase())/*(s.indexOf(0) == s.lastIndexOf(4)) && (s.indexOf(1) == s.lastIndexOf(3))*/){
				System.out.println("World is palindr: " + s);
			}else {
				System.out.println("Input world "+ s +" is not palingdr!");
			}
		}else {
			Exception e = new Exception("Input world "+ s + " is not corect! " + "His lends = " + s.length()+"!");
			System.err.println(e);
		}
		
	}
	
}
