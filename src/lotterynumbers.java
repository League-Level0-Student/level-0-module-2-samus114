import java.util.Random;

import javax.swing.JOptionPane;

public class lotterynumbers {
public static void main(String[] args) {
	String lottery =" ";
	for (int i = 0; i < 5; i++) {
	int randomNumber = new Random().nextInt(60);
	System.out.println(randomNumber);
	lottery += randomNumber;
	lottery += " ";
	}	
	JOptionPane.showMessageDialog(null, lottery, "Lottery Ticket", JOptionPane.INFORMATION_MESSAGE);
}
}