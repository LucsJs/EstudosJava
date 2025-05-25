import javax.swing.JOptionPane;

public class AddIntegerGUI {
	public static void main(String[] args) {
		String numStr1 = JOptionPane.showInputDialog("Enter the first integer.");
		int num1 = Integer.parseInt(numStr1);

		String numStr2 = JOptionPane.showInputDialog("Enter the second integer.");
		int num2 = Integer.parseInt(numStr2);

		int sum = num1 + num2;
		
		String message = String.format("The sum is %d", sum);

		JOptionPane.showMessageDialog(null, message);
	}
}