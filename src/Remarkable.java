import javax.swing.JOptionPane;

public class Remarkable {

	public static void main(String[] args) {
		String Hans = null;

		String Neo = null;

		String Julia = null;

		String Wendy = null;

		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog(null, "(Write Name)");
		String name1 = "Hans";
		if (name.equals("Hans")) {
			System.out.println("That's remarkable Hans");
		} else if (name.equals("Neo")) {
			System.out.println("Cool");
		}
		if (name.equals("Julia")) {
			System.out.println("That's Amamzing");
		} else if (name.equals("Wendy")) {
			System.out.println("Great");

		}
	}
}