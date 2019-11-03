package _08_string_methods;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class StringMethods {
	public static void main(String[] args) {
		int yeet2 = 0;
		boolean yeetTorF = false;
		int yeetLN = 0;
		// 1. Create a String variable and initialize it to whatever you want
		
		String yeet = JOptionPane.showInputDialog("enter a word, with more than 2 letters");
		if(yeet.length()>2) {
			
			
		
		// 2. Print the 3rd char of your String to the console.
		//    HINT: .charAt
		char yeet3 = yeet.charAt(2);
		System.out.println(yeet3);
		// 3. Print the length of your String to the console.
		//    HINT: .length()
		int yeetL = yeet.length();
		System.out.println(yeetL);
		// 4. Using a for loop, print one char at time to the console.
		//    HINT: use .length() to determine how many loops
		for(int yeetL1=yeetL-1; yeetL1>-1; yeetL1-=1) {
			System.out.print(yeet.charAt(yeet2));
			yeet2+=1;
		}
		String yeetLetter = JOptionPane.showInputDialog("Choose a letter in your word");
		yeet2 = 0;
		for(int yeetL1=yeetL-1; yeetL1>-1; yeetL1-=1) {
			if((yeet.charAt(yeet2))==(yeetLetter.charAt(0))) {
				yeetTorF=true;
				yeetLN=yeet2;
				yeet2=-1;
			}
			yeet2+=1;
			}
			if(yeetTorF=true) {
				JOptionPane.showMessageDialog(null, "The first occurence of that letter is at index " + yeetLN + ".");
			}
			else {
				JOptionPane.showMessageDialog(null, "IN YOUR WORD");
			}
			
			}
			
				
		else {
			JOptionPane.showMessageDialog(null, "you had one job...");
			}
			
		
	
			
		}

}
	
		
		// 5. Pick a char inside your String, and use a loop to determine
		//    what position/index in the String the char is located.
		//    Print the char's position to the console.
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"


	



