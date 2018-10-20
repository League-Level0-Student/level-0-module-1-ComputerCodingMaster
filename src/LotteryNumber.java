import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();

		int i = rand.nextInt(100) + 1;
		int a = rand.nextInt(100) + 1;
		int m = rand.nextInt(100) + 1;
		int o = rand.nextInt(100) + 1;
		int k = rand.nextInt(100) + 1;
		JOptionPane.showMessageDialog(null,
				"The winning lottery numbers are " + i + "," + a + "," + m + "," + o + "," + k + ".");

	}

}
