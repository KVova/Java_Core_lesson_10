package volodymyr_max_task4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter you text!");
		
		String s = sc.nextLine();
		
//		System.out.println("The most popular word in line is " + line[a]);
	///////////////////
		
//		String message = "aaa abc bca  abc abcde sc abcdef fff f fff fff words fff ff abc abc g";
//        String [] words = message.toLowerCase().replaceAll("[-.?!)(,:]", "").split(" ");
// 
//        Map<String, Integer> counterMap = new HashMap<>();
//        for (String word : words) {
//            if(!word.isEmpty()) {
//                Integer count = counterMap.get(word);
//                if(count == null) {
//                    count = 0;
//                }
//                counterMap.put(word, ++count);
//            }
//        }
// 
//        for(String word : counterMap.keySet()) {
//            System.out.println(word + ": " + counterMap.get(word));
//	}
//}
//}
		
		String[] m = s.split(" ");
		Arrays.sort(m);

		String maxWord = "", word = "";
		int maxCount = 0, count = 1;

		for (String ss : m) {
			if (ss.equals(word)) {
				count++;
			} else {
				if (count > maxCount) {
					maxCount = count;
					maxWord = word;
				}
				word = ss;
				count = 1;
			}
		}

		if (count > maxCount) {
			maxCount = count;
			maxWord = word;
		}

		System.out.println("The most popular word in line is : " + maxWord + " (meets " + maxCount + " once)");
	}
}