package lab_2_Jamesg127;
import java.util.Scanner;
public class Lab2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcom to the Guess teh Square Root Game!\n");
		int count = 0;
		int q1 = (int)(Math.random() * 100 + 1);
		double correct1 = Math.sqrt(q1);
		System.out.println("What's the square root of " + q1);
		double answer1 = scan.nextDouble();
		if (q1 == answer1) {
			System.out.println("Nice Job!");
			count++;
		}
		else if (q1 != answer1) {
			System.out.println("So close, it's " + correct1);
		}
		int q2 = (int)(Math.random() * 100 + 1);
		double correct2 = Math.sqrt(q2);
		System.out.println("What's the square root of " + q2);
		double answer2 = scan.nextDouble();
		if (q2 == answer2) {
			System.out.println("Nice Job!");
			count++;
		}
		else if (q2 != answer2) {
			System.out.println("So close, it's " + correct2);
		}
		int q3 = (int)(Math.random() * 100 + 1);
		double correct3 = Math.sqrt(q3);
		System.out.println("What's the square root of " + q3);
		double answer3 = scan.nextDouble();
		if (q3 == answer3) {
			System.out.println("Nice Job!");
			count++;
		}
		else if (q3 != answer3) {
			System.out.println("So close, it's " + correct3);
		}
		System.out.println("You got " + count + "/3");
	}

}
