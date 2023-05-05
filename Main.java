import java.util.Iterator;
import java.util.LinkedList;
/***************************************************************
* Name : Final Project
* Author: Bonj Doyo
* Created : 04/16/2023
* Course: CIS 152 - Data Structure
* Version: 1.0
* OS: Windows 10
* IDE: eclipse
* Copyright : This is my own original work 
* based on specifications issued by our instructor
* Description : Creating a streaming like application that helps
* you search/find documentaries about discrimination
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or
* unmodified. I have not given other fellow student(s) access
* to my program.
***************************************************************/
public class Main {

	/**
	 * @param a
	 * @param x
	 * @return
	 */
	public static int linearSearch(String a[], String x) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] == x)
				return i;
		}
		return -1;
	}

	/**
	 * @param a
	 */
	public static void selectionSort(String a[]) {

		for (int i = 0; i < a.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j].compareTo(a[index]) < 0) {
					index = j;
				}
			}
			String temp = a[index];
			a[index] = a[i];
			a[i] = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Linear Search
		String a[] = { "Zero Tolerance", "I Am Not Your Negro", "Crip Camp: A Disability Revolution", "Back to Natural",
				"Duty Free", "Who We Are: A Chronicle of Racism in America" };
		String x = "Who We Are: A Chronicle of Racism in America";

		System.out.println(x + " is found at index: " + linearSearch(a, x) + "\n");

		// Linked List
		LinkedList<String> ls = new LinkedList<String>();

		System.out.println("List of documentaries: ");

		ls.add("Zero Tolerance");
		ls.add("I Am Not Your Negro");
		ls.add("Crip Camp: A Disability Revolution");
		ls.add("Back to Natural");
		ls.add("Duty Free");
		ls.add("Who We Are: A Chronicle of Racism in America \n");

		Iterator<String> itr = ls.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// Selection Sort
		System.out.println("Before Selection Sort:");
		for (String i : a) {
			System.out.print(i + ", ");
		}
		System.out.println();

		selectionSort(a);

		System.out.println("After Selection Sort:");
		for (String i : a) {
			System.out.print(i + ", ");
		}
	}
}
