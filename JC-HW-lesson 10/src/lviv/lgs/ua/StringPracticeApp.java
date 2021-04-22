package lviv.lgs.ua;

import java.util.Scanner;

public class StringPracticeApp {
	
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter word which contains 5 letters: ");
			
			String word = sc.next().toLowerCase();
			
			if (word.length() == 5) {
				if(word.charAt(0)==word.charAt(4) & word.charAt(1)==word.charAt(3)) {
					System.out.println("The  " + word + " is polyander " );
				} else {
					System.out.println("The  " + word + " isn't polyander");
				}
			} else {
				System.out.println("ERROR. You have to enter word which contains only 5 letters");
			}
		
		
	}

}
