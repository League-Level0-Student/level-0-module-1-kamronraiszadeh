import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String birthday = JOptionPane.showInputDialog(null, "What is your birthday");
		if (birthday.equals("11/13")) {
			JOptionPane.showMessageDialog(null, "Happy Birthday ");

		}

		else {

			JOptionPane.showMessageDialog(null, "Happy Unbirthday");
		}

	}
}
