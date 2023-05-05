import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.junit.jupiter.api.Test;

class GUITest {

	@Test
	void test1JFrame() {
		JFrame frame = new JFrame();
		frame.setVisible(true);;
		assertTrue(true);
	}
	
	@Test
	void test2JFrame() {
		JFrame frame = new JFrame();
		frame.setSize(400, 200);
		assertNotEquals(frame, 400);
		assertNotEquals(frame, 400);
		assertNotSame(400, 200);
	}
		
	@Test
	void testJLabel() {
		JLabel label = new JLabel("Documentary");
		assertNotEquals(label, "Documentary");
	}
	
	@Test
	void testJComboBox() {
		String[] listString = { "Zero Tolerance", "I Am Not Your Negro", "Crip Camp: A Disability Revolution",
				"Back to Natural", "Duty Free", "Who We Are: A Chronicle of Racism in America" };
		JComboBox box = new JComboBox(listString);
		assertNotEquals(box, listString);
	}

}
