package _11_own_adventure;

import javax.swing.JOptionPane;

public class ownadventure {
public static void main(String[] args) {
	String shopping=JOptionPane.showInputDialog("do you want to go to vans or do you want to go to nike");
	if (shopping.equals("vans")) {
	String colar=	JOptionPane.showInputDialog("do you want back vans or do you want white vans");
		if (colar.equals("black")) {
			JOptionPane.showMessageDialog(null, "you go home with your black shoes");
			
		}
		else if (colar.equals("white")) {
			JOptionPane.showMessageDialog(null, "you go home with your white shoes");
			
		}
	}
	else if (shopping .contentEquals("nike")) {
		String colar= JOptionPane.showInputDialog("do you want black nikes or do you want white nikes");
		if (colar.contentEquals("black")) {
			JOptionPane.showMessageDialog(null, "you go home with your black shoes");
			
		}
		else if (colar.contentEquals("white")) {
			JOptionPane.showMessageDialog(null, "you go home with your white shoes");
			
		}
		
		
	}
}
}
