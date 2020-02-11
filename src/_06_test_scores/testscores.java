package _06_test_scores;

import javax.swing.JOptionPane;

public class testscores {
	public static void main(String[] args) {
		String test= JOptionPane.showInputDialog("what was your test scores");
		double scores =Double.parseDouble(test);
		if (scores>89) {
			JOptionPane.showMessageDialog(null, "you got a a "); 
			
		}
		else if (scores>79) {
			JOptionPane.showMessageDialog(null, "you got a b");
			
		}
		else if (scores>69) {
			JOptionPane.showMessageDialog(null, "you got a c");
			
		}
		else	if (scores>59) {
			JOptionPane.showMessageDialog(null, "you got a d");
			
		}
		else if (scores<60) {
			JOptionPane.showMessageDialog(null, "you got a f");
			
		}
	}

}
