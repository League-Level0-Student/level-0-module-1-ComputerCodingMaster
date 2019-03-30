import javax.swing.JOptionPane;

public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String lol = JOptionPane.showInputDialog("What's your test scores");
double lul = Double.parseDouble(lol);

if(lul<80) {
JOptionPane.showMessageDialog(null,"Study more to get better grades.");
}
else if(lul<100) {
JOptionPane.showMessageDialog(null,"Keep it up!");
}
else if(lul<1) {
JOptionPane.showMessageDialog(null,"Omegalul");	
}
	}
}
