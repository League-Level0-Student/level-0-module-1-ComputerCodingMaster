import javax.swing.JOptionPane;

public class Rolllercoaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myu = JOptionPane.showInputDialog("What height are you?");
		int h = Integer.parseInt(myu); 		
		if (h > 48) {
			System.out.println("You may enter");
		}
		if (h <= 48) {
				System.out.println("You need to grow first");
			}
		}
	}

