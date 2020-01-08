package volodymyr_max_task3;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please input text!");

		String s = sc.nextLine();
		
//		StringBuilder sb = new StringBuilder(s);
//		int in = -1;
//		
//		if(s.length() != 0 && s.length() > 2) {
//			in++;
//			for(int i = 0; i< s.length(); i++) {
//				if(/*(s.length() != 0 && s.length() > 2) & */
//						   (s.charAt(i) == ' ') 
//						|| (s.charAt(i) == ',') 
//						|| (s.charAt(i) == '.')) {
//					in++;
//				}
//			}
//		}
//		
//		System.out.println("You input " + in + " word");

		String[] word = s.split(" ");
		int in = 0;

		for (int i = 0; i < word.length; i++) {
			if (word[i].length() > 2) {
				in++;
			}
		}
		System.out.println("You input " + in + " word");
	}

}