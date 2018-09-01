
public class WeeblBadger {

	public static void main(String[] args) {
		String s = "snake";
		// TODO Auto-generated method stub
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 12; j++) {
				System.out.print("Badger, ");
			}
			if (i < 3) {
				
				for (int l = -0; l < 2; l++) {
					System.out.println("Mushroom,");
				}
			} else {
				for (int m = 0; m <= 4; m++) {
					if (m < 4) {
						System.out.println(" A " +s);
				}
					else {
						System.out.println("OOOh,it's a " + s);
					}
			}
		}
	}
}
}