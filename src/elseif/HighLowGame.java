//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.print.attribute.standard.JobKOctetsProcessed;
import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		int random = new Random().nextInt(10);
		for (int i = 0; i < 10; i++) {
			
		
		// 3. Change this line to give you a random number between 1 - 100. 
	
		// 2. Print out the random variable above
String bob=JOptionPane.showInputDialog(null,"guess a number between 1 and 10");
		// 11. do the following 10 times
int j=Integer.parseInt(bob);
			// 1. ask the user for a guess using a pop-up window, and save their response 

if (j==random){
	
JOptionPane.showMessageDialog(null,"you guessed it!");
break;
}
if(j<random){
	JOptionPane.showMessageDialog(null, "to low :)");
}
if(j>random){
	JOptionPane.showMessageDialog(null, "to high:)");
		
		
		
		
}}}}

