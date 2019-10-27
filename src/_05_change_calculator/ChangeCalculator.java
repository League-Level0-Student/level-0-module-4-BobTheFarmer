package _05_change_calculator;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {
	public static void main(String[] args) {
		double money=0;
		// Ask ythe user how many nickels they have
		String nickelsString = JOptionPane.showInputDialog(null, "How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
		int nickels = Integer.parseInt(nickelsString);
		// Ask the user how many dimes they have, and convert their answer
		String dimesString = JOptionPane.showInputDialog(null, "How many dimes do you have?");
		int dimes = Integer.parseInt(dimesString);
		// Ask the user how many quarters they have, and convert their answer
		String quartersString = JOptionPane.showInputDialog(null, "How many quarters do you have?");
		int quarters = Integer.parseInt(quartersString);
		// Calculate how much money the user has and save it in a double variable 
		for(nickels=nickels; nickels>0; nickels-=1) {
			money+=0.05;
		}
		for(quarters=quarters; quarters>0; quarters-=1) {
			money+=0.25;
		}
		for(dimes=dimes; dimes>0; dimes-=1) {
			money+=0.10;
		}
		JOptionPane.showMessageDialog(null, "You have $" + money + ".");
		}
		// Tell the user how much money they have
	}


