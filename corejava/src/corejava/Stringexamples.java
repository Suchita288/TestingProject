package corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Stringexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringexamples se = new Stringexamples();
		se.shuffle("ABC");
		System.out.println("executes");
		se.updateName();

	}

//// ******** shuffle string ************* /////	
	public void shuffle(String input) {
		List<Character> characters = new ArrayList<Character>();
		for (char c : input.toCharArray()) {
			characters.add(c);
		}
		StringBuilder output = new StringBuilder(input.length());
		while (characters.size() != 0) {
			int randPicker = (int) (Math.random() * characters.size());
			output.append(characters.remove(randPicker));
		}
		System.out.println(output.toString());
	}

//****************String Updated***************//

	public void updateName() {
		String split[] = null;
		String s = "my name is Ramesh";
		String Firstsentance ="";
		for (int i = 0; i < s.length(); i++) {

			split = s.split(" ");
			//System.out.println(split[i]);
		}
		for (int i = 0; i < split.length; i++) {
			if (!split[i].matches("Ramesh")) {

				if (Firstsentance.isEmpty()) {
					Firstsentance = Firstsentance + split[i];
				} else {
					Firstsentance = Firstsentance +" "+ split[i];
				}
			}
		}

		Scanner sc = new Scanner(System.in);
		String updatedName = sc.next();
		System.out.println(Firstsentance + " " + updatedName);

	}

}
