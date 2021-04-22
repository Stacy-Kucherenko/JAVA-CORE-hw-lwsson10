package lviv.lgs.ua;

import java.util.Scanner;

public class StringPracticeAppTask3 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Please enter the sentence: ");
		 
		 String sentence = sc.nextLine();
		 int countWords = 0;
		 if(sentence.length() != 0) {
			 countWords++;
			 
			 for (int i = 0; i < sentence.length(); i++) {
                 if(sentence.charAt(i) == ' '){
                     //≈сли пробел - увеличиваем количество слов на 1
                     countWords++;
                 }
		 }
			 System.out.println("Your sentence consists of " + countWords + " words");
	}

}
}
