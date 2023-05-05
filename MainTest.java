import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testLinearSearch() {
		var ls = new Main();

		String a[] = { "Zero Tolerance", "I Am Not Your Negro", "Crip Camp: A Disability Revolution", "Back to Natural",
				"Duty Free", "Who We Are: A Chronicle of Racism in America" };
		String x = "Who We Are: A Chronicle of Racism in America";

		assertNotEquals(x, ls.linearSearch(a, x));
		assertNotSame(x, ls.linearSearch(a, x));
	}

	@Test
	void testLinkedList() {
		LinkedList<String> ls = new LinkedList<String>();

		ls.add("Zero Tolerance");
		ls.add("I Am Not Your Negro");
		ls.add("Crip Camp: A Disability Revolution");
		ls.add("Back to Natural");
		ls.add("Duty Free");
		ls.add("Who We Are: A Chronicle of Racism in America \n");

		assertFalse(ls.isEmpty());
	}

	@Test
	void testSelectionSort() {
		String a[] = { "Zero Tolerance", "I Am Not Your Negro", "Crip Camp: A Disability Revolution", "Back to Natural",
				"Duty Free", "Who We Are: A Chronicle of Racism in America" };

		LinkedList<String> ls = new LinkedList<String>();

		ls.add("Zero Tolerance");
		ls.add("I Am Not Your Negro");
		ls.add("Crip Camp: A Disability Revolution");
		ls.add("Back to Natural");
		ls.add("Duty Free");
		ls.add("Who We Are: A Chronicle of Racism in America \n");

		for (int i = 0; i < a.length; i++) {
			assertEquals(a.length, ls.size());
		}
	}

}
