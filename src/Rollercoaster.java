import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
	String height = JOptionPane.showInputDialog("how tall are you in inches?");
int a = Integer.parseInt(height);	
if(a<48) {
	JOptionPane.showMessageDialog(null, "you cannot come on the ride.");
}else {
	JOptionPane.showMessageDialog(null, "you can come on the ride.");
}


}
}
