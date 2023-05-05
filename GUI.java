import java.awt.*;
import javax.swing.*;

public class GUI {

	// attributes
	static JLabel label;
	static JFrame frame;
	static JPanel panel;
	static JComboBox box;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// JFrame, JLabel object
		frame = new JFrame("JComboBox");
		label = new JLabel("Documentary");

		frame.setLayout(new FlowLayout());

		String[] listString = { "Zero Tolerance", "I Am Not Your Negro", "Crip Camp: A Disability Revolution",
				"Back to Natural", "Duty Free", "Who We Are: A Chronicle of Racism in America" };

		box = new JComboBox(listString);

		// jPanel
		panel = new JPanel();
		panel.add(label);
		panel.add(box);

		// JFrame
		frame.add(panel);
		frame.setSize(400, 200);
		frame.setVisible(true);
	}

}
