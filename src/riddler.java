import javax.swing.JOptionPane;

public class riddler {
	public static void main(String[] args) {
		int score = 0;
		String riddle = JOptionPane.showInputDialog(
				"What is greater than God, more evil than the devil, the poor have it, the rich need it, and if you eat it, you'll die?");
		if (riddle.equals("nothing")) {
			JOptionPane.showMessageDialog(null, "correct");
			score++;
			JOptionPane.showMessageDialog(null, "Your score is now " + score);

		} else {
			JOptionPane.showMessageDialog(null, "wrong, the correct answer is actually nothing");
		}
		String riddle2 = JOptionPane.showInputDialog(
				"What occurs once in every minute, twice in every moment, yet never in a thousand years? ");
		
		if (riddle2.equalsIgnoreCase("The letter m")) {
			JOptionPane.showMessageDialog(null, "correct");
			score++;
			JOptionPane.showMessageDialog(null, "Your score is now " + score);

		} else {
			JOptionPane.showMessageDialog(null, "wrong, the correct answer is actually the letter m");
		}
	}}