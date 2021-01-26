package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String Unbirthday=JOptionPane.showInputDialog(null, "When is your Birthday");
		if(Unbirthday.equals("1/25")) {
			JOptionPane.showMessageDialog(null,"Happy birthday");
			
			
		}
		else {
			JOptionPane.showMessageDialog(null,"Happy unbirthday");
			
		}
	}

}