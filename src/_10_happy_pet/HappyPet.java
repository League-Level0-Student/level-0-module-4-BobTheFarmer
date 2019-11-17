package _10_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	static int pet;
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	static int WorL = 0;
	static int task;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		
		pet = JOptionPane.showOptionDialog(null, "What pet do you want?", "Stop reading and choose a pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Cat", "Dog", "Hamster", "Fish"}, null);
		if(pet==0) {
		JOptionPane.showMessageDialog(null, "Reconsider you life choises");
		happinessLevel = -10000;
		}
		for(WorL=WorL; WorL==0; WorL=WorL) {
		task = JOptionPane.showOptionDialog(null, "What will you do to make your pet happy?", "Make your pet less deppresed", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Feed", "Play", "Kill" }, null);
		if(task==0) {
		Feed();	
		}
		if(task==1) {
			Play();	
			}
		if(task==2) {
			Kill();	
		}
		if(happinessLevel>9) {
			JOptionPane.showMessageDialog(null, "You win! Your pet is" + happinessLevel*10 + "% happy!");
			WorL=2;
		}
		}
			}
		
		
		
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
		

			// 5. Use user input to call the appropriate method created in step 4.
			
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			
	

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	public static void Feed() {
		if(pet==0) {
			JOptionPane.showMessageDialog(null, "You wish you had a Dog. +0 happines. Your pet is " + happinessLevel*10 + "% happy");
		}
		if(pet==1) {
			happinessLevel+=1;
			JOptionPane.showMessageDialog(null, "Doggo is happy. +1 happines. Your pet is " + happinessLevel*10 + "% happy");
		}
		if(pet==2) {
			happinessLevel+=1;
			JOptionPane.showMessageDialog(null, "Your hamster is happy. +1 happines. Your pet is " + happinessLevel*10 + "% happy");
		}
		if(pet==3) {
			happinessLevel+=1;
			JOptionPane.showMessageDialog(null, "Your fish eats it. +1 happines. Your pet is " + happinessLevel*10 + "% happy");
		}
		
		}
	public static void Play() {
		if(pet==0) {
			JOptionPane.showMessageDialog(null, "You wish you had a Dog. +0 happines. Your pet is"  + happinessLevel*10 +  "% happy");
		}
		if(pet==1) {
			happinessLevel+=2;
			JOptionPane.showMessageDialog(null, "Doggo likes to play. +2 happines. Your pet is"  + happinessLevel*10 +  "% happy");
		}
		if(pet==2) {
			happinessLevel+=1;
			JOptionPane.showMessageDialog(null, "Your hamster likes to play. +1 happines. Your pet is"  + happinessLevel*10 +  "% happy");
		}
		if(pet==3) {
			happinessLevel -=5;
			JOptionPane.showMessageDialog(null, "You can't play with a fish. -5 happines. Your pet is"  + happinessLevel*10 +  "% happy");
		}
		
		}
	public static void Kill() {
		if(pet==1) {
			JOptionPane.showMessageDialog(null, "You lose");
			WorL=1;
			
		}
		if(pet==2) {
			JOptionPane.showMessageDialog(null, "You Lose");
			WorL=1;
		}
		if(pet==3) {
			JOptionPane.showMessageDialog(null, "You Lose");
			WorL=1;
		}
		if(pet==0) {
			JOptionPane.showMessageDialog(null, "You are glad that your cat is dead and get a dog. Your pet is now dog and your dog's happines is 0%");
			pet=1;
			happinessLevel=0;
		}
		}
	}
	