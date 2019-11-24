package _11_own_adventure;

import javax.swing.JOptionPane;

public class Adventure {
public static void main(String[] args) {
	int Choise3 =-2;
	int Choise2 = 20;
	int Choise1 = JOptionPane.showOptionDialog(null, "Someone tells you that Joe farted. What do you do?", "Adventure Story", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "JOE MAMA", "Punch him", "Run away", "Hide"}, null);
	if(Choise1 == 0) {
		Choise2 = JOptionPane.showOptionDialog(null, "He faints. What do you do?", "Adventure Story", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Run away", "Hide", "FINISH THIS", }, null);
	}
	if(Choise1 == 1) {
		Choise2 = JOptionPane.showOptionDialog(null, "He gets knocked out. What do you do?", "Adventure Story", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Run away", "Hide", "FINISH THIS", }, null);
	}
	if(Choise1 == 2) {
		JOptionPane.showMessageDialog(null, "You escape. You win!");
	}
	if(Choise1 == 3) {
		JOptionPane.showMessageDialog(null, "He finds you. You lose. :(");
		}
	
	
	if(Choise2== 0) {
		JOptionPane.showMessageDialog(null, "You escape. You win!");
	}
	if(Choise2== 1) {
		Choise3 = JOptionPane.showOptionDialog(null, "The police come. What do you do?", "Adventure Story", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Run", "Stay put", "Fight them"}, null);
	}
	if(Choise2== 2) {
		JOptionPane.showMessageDialog(null, "You win!");
	}
		
	
	if(Choise3 == 0) {
		JOptionPane.showMessageDialog(null, "You escape. You win!");
	}
	if(Choise3 == 1) {
		JOptionPane.showMessageDialog(null, "They find you. You lose. :(");
	}
	if(Choise3 == 2) {
		JOptionPane.showMessageDialog(null, "You die. You lose.:(");
	}	
	}
}

	
	
	//int Choise2 = JOptionPane.showOptionDialog(null, "Question", "Adventure Story", 0, JOptionPane.INFORMATION_MESSAGE, null,
	//		new String[] { "A1", "A2", "A3", "A4"}, null);


