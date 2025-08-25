package lab_2_Jamesg127;

import java.util.Scanner;

public class Lab2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Input: ");
		String word = scan.nextLine();
		word = word.toLowerCase();
		int letters = word.length();
		System.out.println("Number of letters: " + letters);
		int x = 0;
		for (int i = 0; i < word.length() - 1; i++) {
			if ((word.substring(i, i + 1).equals("a") || word.substring(i, i + 1).equals("e") || word.substring(i, i + 1).equals("i") || word.substring(i, i + 1).equals("o") || word.substring(i, i + 1).equals("u")) && x == 0){
				System.out.println("Index of the first vowel: " + i);
				x = i;
			}
			else {
				
			}
			
		}
		System.out.println("Uppercase: " + word.toUpperCase());
		System.out.println("Secret string: " + word.substring(0, 5).toUpperCase() + word.substring(letters - 3, letters).toLowerCase() + letters);
		
	}

}
