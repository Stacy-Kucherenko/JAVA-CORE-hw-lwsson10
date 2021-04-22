package lviv.lgs.ua;

import java.util.Scanner;

public class StringPracticeAppTask4 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Please enter the sentence: ");
		 
		 String sentence = sc.nextLine();
		String[] words = sentence.split(" ");
		 int countRepWords = 0;
		 
		    
		 for (int i=0; i < words.length; i ++) {
			 countRepWords = 1;
			 for(int j = i+1; j < words.length; j++) {  
	                if(words[i].equals(words[j])) {  
	                    countRepWords++;  
	                    words[j] = "0";  
	                }  
	                
	               	            
		 }	
			 if(countRepWords > 1 && words[i] != "0") {
            	 System.out.println("The most repeated word in the sentence is: " + words[i] + " - " +  + countRepWords + " times");      
            } else {
            	
            }
}
	}
}
