package lab_2_Jamesg127;
import java.util.Scanner;
public class Lab2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(max(3.9, 5));
		
		
	}
	public static int max(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		}
		else {
			return num2;
				
		}
	}
	public static double max(int num1, double num3) {
		if (num1 > num3) {
			return num1;
		}
		else {
			return num3;
				
		}
	}
	public static double max(int num2, double num3) {
		if (num3 > num2) {
			return num3;
		}
		else {
			return num2;
				
		}
	}
	public static double max(double num3, double num4) {
		if (num3 > num4) {
			return num3;
		}
		else {
			return num4;
				
		}
	}

}
