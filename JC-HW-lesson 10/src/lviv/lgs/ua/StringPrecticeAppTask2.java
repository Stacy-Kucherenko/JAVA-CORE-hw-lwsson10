package lviv.lgs.ua;

import java.util.Scanner;

public class StringPrecticeAppTask2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter word: ");
	
	String word = sc.nextLine();
	char wordArray [] = word.toCharArray();
char vowelsArray [] = {'�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�','�', '�', '�', '�', '�', '�', '�', '�'};
	
	for (int i = 0; i < wordArray.length; i++) {

		for (int j = 0; j < vowelsArray.length; j++) {

			if (wordArray[i] == vowelsArray[j]) {
				wordArray[i] = '-';
			} 	
		}
		
}
	System.out.println(wordArray);

}
}

