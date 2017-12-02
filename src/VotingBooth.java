import javax.swing.JOptionPane;
public class VotingBooth {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("how old are you?");
	int a = Integer.parseInt(age);	
	String cool = null;
	if(a<18) {
		JOptionPane.showMessageDialog(null, "Sorry but I can't let you vote.");
	}else {		
	cool = JOptionPane.showInputDialog(null, "Who should be the next president?");
}
	if (cool.equalsIgnoreCase("trump")) {
	JOptionPane.showMessageDialog(null, "yay good for you");
}else {
	JOptionPane.showMessageDialog(null, "which president is that?");
}

	}
}
