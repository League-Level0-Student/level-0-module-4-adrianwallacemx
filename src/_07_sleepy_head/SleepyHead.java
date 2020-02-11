package _07_sleepy_head;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
    	//Ask the user if today is a weekday
    	String week=JOptionPane.showInputDialog("is today a weekday");
    	//if so, ask them if they are on vacation
    	if (week.equals("yes")) {
    		String day=JOptionPane.showInputDialog(null, "are you on vacation");
			if (day.equals("yes")) {
				JOptionPane.showInputDialog("sleep in");
				
			}
			else {
				JOptionPane.showInputDialog("get up");
			}
		}
    	else {
    		JOptionPane.showInputDialog("sleep in");
    	}
    	//if it is not a weekday or they are on vacation
    	
    	
    	// tell them to sleep in.
    	// otherwise, tell them to get up
    	
    	
       
    }
}
