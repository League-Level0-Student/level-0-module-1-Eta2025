package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
	int	score= 0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String	Question1=JOptionPane.showInputDialog(null, "I’m tall when I’m young and I’m short when I’m old. What am I?");
	
			
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (Question1.equals ("A candle")) {
	JOptionPane.showMessageDialog(null, "Correct");
	score +=1;
}
else {
	JOptionPane.showMessageDialog(null, "worng. The Correct answer is 'A candle'");
}
		// 5. Otherwise, say "wrong" and tell them the answer
String	Question2=JOptionPane.showInputDialog(null,"What can you catch but not throw?");
		// 6. Add some more riddles
if (Question2.equals ("A cold")) {
	JOptionPane.showMessageDialog(null, "Correct");
	score +=1;
}
	
	else {
		JOptionPane.showMessageDialog(null, "worng. The Correct answer is 'A cold'");
	}
		// 2. Make a pop up to show the score.

	JOptionPane.showMessageDialog(null, "your score is " +score);
	}
}

