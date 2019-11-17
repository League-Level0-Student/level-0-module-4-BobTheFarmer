package _09_pi_aloud;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class PiAloud {
	// 1. Make a main method and make sure your program can run
public static void main(String[] args) {
	String  pi= "3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679821480865132823066470938446095505822317253594081284811174502841027019385211055596446229489";
	// 2. Make a String variable to hold the value of Pi. You could use http://www.piday.org/million/ for the value.
	int piCount2 = 0;
	int piCount1;
	String guess;
	char guessChar;
	// 3. Print out some digits of Pi. The first value is "pi.charAt(0)", the second is "pi.charAt(1)"
	//System.out.println(pi.charAt(0));
	//System.out.println(pi.charAt(1));
	//System.out.println(pi.charAt(2));
	// 4. Print ALL the digits of of Pi (hint: use a loop)
	//for(piCount1 = pi.length(); piCount1>piCount2; piCount2=piCount2+1) {
	//System.out.println(pi.charAt(piCount2));
	//}
	
	// 5. Use the speak() method to speak all the digits of Pi.
	//for(piCount2=0; piCount1>piCount2; piCount2=piCount2+1) {
	//speak(pi.charAt(piCount2));
	//}
	// [ADVANCED]
	// *6. Get a character from the user using the getInputFromUser() method
	// *7. Compare the users' char to the next digit of Pi
	// *8. If they are correct, print out "correct". If they are not, print "incorrect" to System.err.println
	int score=1;
	JOptionPane.showMessageDialog(null, "Hi. If you are not a nerd you will get a nerd you will get a bad score. You will have to type out Pi.");
	for(score=score; score<pi.length(); score+=1) {
	guess = JOptionPane.showInputDialog(null, "Didget #" + score);
	guessChar = guess.charAt(0);
	if(guessChar==pi.charAt(score-1)) {

	}
	else {
	JOptionPane.showMessageDialog(null, "You are at nerd level " + score + ". But you lost so now you get reset.");
	score=0;
	}
	
	}
	}
	





	static void speak(char characterToSpeak) {
		try {
			Runtime.getRuntime().exec("say " + characterToSpeak).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void pause(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	static char getInputFromUser() {
		Scanner scanner = new Scanner(System.in);
		return scanner.next().toCharArray()[0];
	}

}


