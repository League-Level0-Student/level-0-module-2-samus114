package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Checkpoint {
public static void main(String[] args) {
String flour = JOptionPane.showInputDialog("How many cups of flower do you have?");
int x = Integer.parseInt(flour);
if(x<2) {
JOptionPane.showMessageDialog(null, "you need more flower");
}else {
	JOptionPane.showMessageDialog(null, "you have enough");
}
String people = JOptionPane.showInputDialog("how many people are you giving cookies");
int y = Integer.parseInt(people);
if(y>30) {
JOptionPane.showMessageDialog(null, "you are going to have to bake two batches of cookies.");
}
String Amnt = JOptionPane.showInputDialog("how many batches did you make");
int j = Integer.parseInt(Amnt);
if(j<2) {
JOptionPane.showMessageDialog(null, "your lucky to have lots of friends");
}
//-----------------------------------------------------
Random rand = new Random();
int generator1 = rand.nextInt(1000);
int generator2 = rand.nextInt(900);
int p = 64;
int f = 99;
JOptionPane.showMessageDialog(null, ""+f+" + "+p+"= 163");
JOptionPane.showMessageDialog(null, ""+f+" - "+p+"= 35");
//-----------------------------------------------------
Random rand2 = new

}
}
