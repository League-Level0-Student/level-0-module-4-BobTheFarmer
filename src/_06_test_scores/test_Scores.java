package _06_test_scores;

import javax.swing.JOptionPane;

public class test_Scores {
public static void main(String[] args) {
	String scoreString = JOptionPane.showInputDialog(null, "What is your test score?");
	Double score = Double.parseDouble(scoreString);
	if(score>100) {
		JOptionPane.showMessageDialog(null, "how");
	}
	else if(score>90) {
		JOptionPane.showMessageDialog(null, "A");
	}
	else if(score>80) {
		JOptionPane.showMessageDialog(null, "B");
	}
	else if(score>70) {
		JOptionPane.showMessageDialog(null, "C");
	}
	else if(score>60) {
		JOptionPane.showMessageDialog(null, "D");
	}
	else {
		JOptionPane.showMessageDialog(null, "F");
	}
	}
}

